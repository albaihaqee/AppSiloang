package aplikasidesktopsiloang;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import view.PanelDropdownProfil;

public class ImageProfil extends JComponent {
    
    private Icon image;
    private int borderSize = 5;
    private Color borderColor = new Color(60, 60, 60);
    private java.awt.Frame parentFrame;
    
    public ImageProfil() {
        initMouseListener();
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    public ImageProfil(java.awt.Frame parent) {
        this.parentFrame = parent;
        initMouseListener();
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    private void initMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    showDropdownProfil();
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Hover effect - ubah warna border
                setBorderColor(new Color(100, 100, 100));
                repaint();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                // Kembalikan warna border normal
                setBorderColor(new Color(60, 60, 60));
                repaint();
            }
        });
    }
    
    private void showDropdownProfil() {
        // Cari parent frame jika belum di-set
        if (parentFrame == null) {
            parentFrame = (java.awt.Frame) SwingUtilities.getWindowAncestor(this);
        }
        
        // Buat dan tampilkan dialog dengan UI yang sama seperti NotifikasiPanel
        PanelDropdownProfil dialog = new PanelDropdownProfil(parentFrame, true);
        
        // Gunakan method yang sama seperti showNotificationBelowBell
        dialog.showDropdownBelowProfile(this);
    }
    
    // Setter untuk parent frame
    public void setParentFrame(java.awt.Frame parentFrame) {
        this.parentFrame = parentFrame;
    }
    
    // Getter dan Setter yang sudah ada
    public Icon getImage() {
        return image;
    }
    
    public void setImage(Icon image) {
        this.image = image;
        repaint();
    }
    
    public int getBorderSize() {
        return borderSize;
    }
    
    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
        repaint();
    }
    
    public Color getBorderColor() {
        return borderColor;
    }
    
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        if (image != null) {
            int width = image.getIconWidth();
            int height = image.getIconHeight();
            int diameter = Math.min(width, height);
            BufferedImage mask = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = mask.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.fillOval(0, 0, diameter - 1, diameter - 1);
            g2d.dispose();
            
            BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
            g2d = masked.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            int x = (diameter - width) / 2;
            int y = (diameter - height) / 2;
            g2d.drawImage(toImage(image), x, y, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
            g2d.drawImage(mask, 0, 0, null);
            g2d.dispose();
            
            Icon icon = new ImageIcon(masked);
            Rectangle size = getAutoSize(icon);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(toImage(icon), size.getLocation().x, size.getLocation().y, size.getSize().width, size.getSize().height, null);
            
            if (borderSize > 0) {
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(borderColor);
                g2.setStroke(new BasicStroke(borderSize));
                g2.drawOval(size.x + (borderSize / 2), size.y + (borderSize / 2), size.width - borderSize, size.height - borderSize);
            }
        }
        super.paint(g);
    }
    
    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
    
    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
}