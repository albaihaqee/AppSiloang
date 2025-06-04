package view;

import Config.Koneksi;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PanelNotifikasiStok extends javax.swing.JDialog {
    
    private Connection conn;
    private JPanel contentPanel;
    private JPanel itemsContainer;
    private JScrollPane scrollPane;
    private int notificationCount = 0;

    public PanelNotifikasiStok(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);         // ✅ HARUS pertama
        initComponents();             // Jangan ada setVisible() di sini!
        conn = Koneksi.getConnection();
        initializeComponents();
        loadNotifikasiData();
        setupDialog();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelNotifikasiStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelNotifikasiStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelNotifikasiStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelNotifikasiStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelNotifikasiStok dialog = new PanelNotifikasiStok(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void initializeComponents() {
        setLayout(new BorderLayout());

        // Main content panel with modern styling
        contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            new EmptyBorder(0, 0, 0, 0)
        ));

        // Header panel
        JPanel headerPanel = createHeaderPanel();
        contentPanel.add(headerPanel, BorderLayout.NORTH);

        // Items container - no scroll, just direct panel
        itemsContainer = new JPanel();
        itemsContainer.setLayout(new BoxLayout(itemsContainer, BoxLayout.Y_AXIS));
        itemsContainer.setBackground(Color.WHITE);

        contentPanel.add(itemsContainer, BorderLayout.CENTER);
        add(contentPanel);

        // Add drop shadow effect
        setBackground(new Color(0, 0, 0, 0)); // Transparent background for shadow
    }

    private JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(17, 97, 171));
        headerPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        headerPanel.setPreferredSize(new Dimension(320, 44)); // Fixed header height

        // Left side - Icon and title
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        leftPanel.setBackground(new Color(17, 97, 171));

        // Use SVG icon instead of emoji
        JLabel iconLabel = createSVGIcon("bell.svg", 16);
        if (iconLabel == null) {
            iconLabel = new JLabel("🔔"); // fallback
            iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        }
        iconLabel.setBorder(new EmptyBorder(0, 0, 0, 8));

        JLabel titleLabel = new JLabel("Informasi Stok");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setForeground(Color.WHITE);

        leftPanel.add(iconLabel);
        leftPanel.add(titleLabel);

        // Right side - Close button
        JLabel closeButton = new JLabel("×");
        closeButton.setFont(new Font("Arial", Font.BOLD, 18));
        closeButton.setForeground(Color.WHITE);
        closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeButton.setBorder(new EmptyBorder(0, 8, 0, 0));
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                closeButton.setForeground(new Color(255, 180, 180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                closeButton.setForeground(Color.WHITE);
            }
        });

        headerPanel.add(leftPanel, BorderLayout.WEST);
        headerPanel.add(closeButton, BorderLayout.EAST);

        return headerPanel;
    }

    // Variabel untuk menentukan mode tampilan
    private boolean showAllItems = false;

    private void loadNotifikasiData() {
        if (conn == null) {
            return;
        }

        try {
            itemsContainer.removeAll();
            notificationCount = 0;

            String sql = "SELECT nama_produk, stok, satuan, harga_beli " +
                        "FROM produk " +
                        "WHERE " +
                        "    (nama_produk = 'Refill Galon' AND stok < 100) " +
                        "    OR " +
                        "    (nama_produk != 'Refill Galon' AND stok < 10) " +
                        "ORDER BY stok ASC";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Collect all low stock items
            java.util.List<ProductData> lowStockItems = new java.util.ArrayList<>();
            while (rs.next()) {
                String nama = rs.getString("nama_produk");
                int stok = rs.getInt("stok");
                String satuan = rs.getString("satuan");
                double hargaBeli = rs.getDouble("harga_beli");

                lowStockItems.add(new ProductData(nama, stok, satuan, hargaBeli));
                notificationCount++;
            }

            rs.close();
            ps.close();

            // ✅ LOGIC PERBAIKAN: Cek apakah ada low stock items
            if (notificationCount == 0) {
                // Tidak ada stok rendah - tampilkan 1 panel "safe stock" saja
                itemsContainer.add(createSafeStockSlot());
            } else if (showAllItems && notificationCount > 3) {
                // Show all items when expanded
                for (int i = 0; i < notificationCount; i++) {
                    ProductData product = lowStockItems.get(i);
                    JPanel itemPanel = createNotifikasiItemPanel(
                        product.nama, product.stok, product.satuan, product.hargaBeli);
                    itemsContainer.add(itemPanel);

                    if (i < notificationCount - 1) {
                        itemsContainer.add(createSeparator());
                    }
                }
            } else {
                // Show 3 slots mode
                for (int i = 0; i < 3; i++) {
                    JPanel itemPanel;

                    if (i < lowStockItems.size()) {
                        // Show actual low stock item
                        ProductData product = lowStockItems.get(i);
                        itemPanel = createNotifikasiItemPanel(
                            product.nama, product.stok, product.satuan, product.hargaBeli);
                    } else {
                        // Show empty slot for remaining slots
                        itemPanel = createEmptySlot();
                    }

                    itemsContainer.add(itemPanel);

                    if (i < 2) {
                        itemsContainer.add(createSeparator());
                    }
                }

                // Add "View All" button if there are more than 3 items
                if (!showAllItems && notificationCount > 3) {
                    itemsContainer.add(createSeparator());
                    itemsContainer.add(createViewAllButton());
                }
            }

        } catch (SQLException e) {
            Logger.getLogger(PanelNotifikasiStok.class.getName()).log(Level.SEVERE, null, e);

            // Show error slots
            itemsContainer.removeAll();
            for (int i = 0; i < 3; i++) {
                itemsContainer.add(createErrorSlot());
                if (i < 2) {
                    itemsContainer.add(createSeparator());
                }
            }
        }

        // Refresh layout
        itemsContainer.revalidate();
        itemsContainer.repaint();
    }

    private JPanel createSafeStockSlot() {
        JPanel itemPanel = new JPanel(new BorderLayout());
        itemPanel.setBackground(Color.WHITE);
        itemPanel.setBorder(new EmptyBorder(20, 16, 20, 16)); // Padding lebih besar untuk centering

        // ✅ UKURAN LEBIH TINGGI untuk menampung konten yang di-center
        itemPanel.setPreferredSize(new Dimension(320, 120));
        itemPanel.setMaximumSize(new Dimension(320, 120));
        itemPanel.setMinimumSize(new Dimension(320, 120));

        // ✅ CENTER PANEL - semua konten akan di-center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(Color.WHITE);

        // ✅ Icon di bagian atas
        JLabel iconLabel = new JLabel("✅");
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24)); // Icon lebih besar
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // ✅ Text utama
        JLabel nameLabel = new JLabel("Semua stok aman");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        nameLabel.setForeground(new Color(40, 167, 69));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // ✅ Text subtitle
        JLabel stockLabel = new JLabel("Tidak ada produk dengan stok rendah");
        stockLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        stockLabel.setForeground(new Color(120, 120, 120));
        stockLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        stockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // ✅ Tambahkan semua komponen dengan spacing
        centerPanel.add(Box.createVerticalGlue()); // Dorong ke center
        centerPanel.add(iconLabel);
        centerPanel.add(Box.createVerticalStrut(8)); // Space antara icon dan text
        centerPanel.add(nameLabel);
        centerPanel.add(Box.createVerticalStrut(4)); // Space antara text utama dan subtitle
        centerPanel.add(stockLabel);
        centerPanel.add(Box.createVerticalGlue()); // Dorong ke center

        itemPanel.add(centerPanel, BorderLayout.CENTER);

        return itemPanel;
    }

    // Helper class for product data
    private static class ProductData {
        String nama;
        int stok;
        String satuan;
        double hargaBeli;

        ProductData(String nama, int stok, String satuan, double hargaBeli) {
            this.nama = nama;
            this.stok = stok;
            this.satuan = satuan;
            this.hargaBeli = hargaBeli;
        }
    }

    private JPanel createNotifikasiItemPanel(String nama, int stok, String satuan, double hargaBeli) {
        JPanel itemPanel = new JPanel(new BorderLayout());
        itemPanel.setBackground(Color.WHITE);
        itemPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        itemPanel.setPreferredSize(new Dimension(320, 60)); // Fixed item height
        itemPanel.setMaximumSize(new Dimension(320, 60));
        itemPanel.setMinimumSize(new Dimension(320, 60));

        // Left side - Icon and main info
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.WHITE);

        // Use SVG icon for all low stock items
        JLabel iconLabel = createSVGIcon("minProduk.svg", 16);
        if (iconLabel == null) {
            iconLabel = new JLabel("🔴");
            iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        }
        iconLabel.setToolTipText("Stok menipis");
        iconLabel.setBorder(new EmptyBorder(0, 0, 0, 12));

        // Product info panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBackground(Color.WHITE);

        // Product name
        JLabel nameLabel = new JLabel(nama);
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        nameLabel.setForeground(new Color(60, 60, 60));
        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Stock info - ALL LOW STOCK ITEMS SHOULD BE RED
        String stockText = "Stok: " + stok + " " + satuan;
        JLabel stockLabel = new JLabel(stockText);
        stockLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        stockLabel.setForeground(new Color(220, 53, 69));
        stockLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        infoPanel.add(nameLabel);
        infoPanel.add(Box.createVerticalStrut(2));
        infoPanel.add(stockLabel);

        leftPanel.add(iconLabel, BorderLayout.WEST);
        leftPanel.add(infoPanel, BorderLayout.CENTER);

        // Right side - Price and time
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(Color.WHITE);

        // Price display
        JLabel priceLabel = new JLabel(String.format("Rp %,.0f", hargaBeli));
        priceLabel.setFont(new Font("Segoe UI", Font.BOLD, 11));
        priceLabel.setForeground(new Color(40, 167, 69));
        priceLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        // Static "Hari ini" text
        JLabel timeLabel = new JLabel("Hari ini");
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        timeLabel.setForeground(new Color(160, 160, 160));
        timeLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        rightPanel.add(priceLabel);
        rightPanel.add(Box.createVerticalStrut(2));
        rightPanel.add(timeLabel);

        itemPanel.add(leftPanel, BorderLayout.CENTER);
        itemPanel.add(rightPanel, BorderLayout.EAST);

        // Hover effect - but keep default cursor as requested
        itemPanel.addMouseListener(new MouseAdapter() {
            Color originalColor = itemPanel.getBackground();

            @Override
            public void mouseEntered(MouseEvent e) {
                itemPanel.setBackground(new Color(248, 249, 250));
                // Keep default cursor as requested
            }

            @Override
            public void mouseExited(MouseEvent e) {
                itemPanel.setBackground(originalColor);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(PanelNotifikasiStok.this, 
                    "Detail produk: " + nama + "\nStok tersisa: " + stok + " " + satuan);
            }
        });

        return itemPanel;
    }

    private JPanel createEmptySlot() {
        JPanel itemPanel = new JPanel(new BorderLayout());
        itemPanel.setBackground(new Color(250, 250, 250)); // Light gray background
        itemPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        itemPanel.setPreferredSize(new Dimension(320, 60));
        itemPanel.setMaximumSize(new Dimension(320, 60));
        itemPanel.setMinimumSize(new Dimension(320, 60));

        // Center content
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(250, 250, 250));

        // Empty slot indicator
        JLabel emptyLabel = new JLabel("—");
        emptyLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        emptyLabel.setForeground(new Color(180, 180, 180));
        emptyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emptyLabel.setHorizontalAlignment(SwingConstants.CENTER);

        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(emptyLabel);
        centerPanel.add(Box.createVerticalGlue());

        itemPanel.add(centerPanel, BorderLayout.CENTER);

        return itemPanel;
    }

    private JPanel createErrorSlot() {
        JPanel itemPanel = new JPanel(new BorderLayout());
        itemPanel.setBackground(new Color(255, 248, 248)); // Light red background
        itemPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        itemPanel.setPreferredSize(new Dimension(320, 60));
        itemPanel.setMaximumSize(new Dimension(320, 60));
        itemPanel.setMinimumSize(new Dimension(320, 60));

        // Left side - Icon and main info
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(new Color(255, 248, 248));

        // Error icon
        JLabel iconLabel = new JLabel("⚠️");
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        iconLabel.setBorder(new EmptyBorder(0, 0, 0, 12));

        // Info panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBackground(new Color(255, 248, 248));

        // Error text
        JLabel nameLabel = new JLabel("Error");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        nameLabel.setForeground(new Color(220, 53, 69));
        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Sub text
        JLabel stockLabel = new JLabel("Gagal memuat data");
        stockLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        stockLabel.setForeground(new Color(160, 160, 160));
        stockLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        infoPanel.add(nameLabel);
        infoPanel.add(Box.createVerticalStrut(2));
        infoPanel.add(stockLabel);

        leftPanel.add(iconLabel, BorderLayout.WEST);
        leftPanel.add(infoPanel, BorderLayout.CENTER);

        itemPanel.add(leftPanel, BorderLayout.CENTER);

        return itemPanel;
    }

    private JLabel createSVGIcon(String svgPath, int size) {
        try {
            String fullPath = "icons/" + svgPath;
            // Implement SVG loading logic here
            // For now, return null to use emoji fallback
            return null;
        } catch (Exception e) {
            return null; // Fallback to emoji
        }
    }

    private JSeparator createSeparator() {
        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(240, 240, 240));
        separator.setPreferredSize(new Dimension(320, 1));
        separator.setMaximumSize(new Dimension(320, 1));
        separator.setMinimumSize(new Dimension(320, 1));
        return separator;
    }

    private JPanel createViewAllButton() {
        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.setBackground(new Color(248, 249, 250));
        buttonPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        buttonPanel.setPreferredSize(new Dimension(320, 40));
        buttonPanel.setMaximumSize(new Dimension(320, 40));
        buttonPanel.setMinimumSize(new Dimension(320, 40));

        JLabel viewAllLabel = new JLabel("Lihat Semua (" + notificationCount + ")");
        viewAllLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        viewAllLabel.setForeground(new Color(17, 97, 171));
        viewAllLabel.setHorizontalAlignment(SwingConstants.CENTER);
        viewAllLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        viewAllLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showAllItems = true;
                loadNotifikasiData();
                setupDialog();
                revalidate();
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonPanel.setBackground(new Color(240, 245, 255));
                viewAllLabel.setForeground(new Color(12, 72, 128));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buttonPanel.setBackground(new Color(248, 249, 250));
                viewAllLabel.setForeground(new Color(17, 97, 171));
            }
        });

        buttonPanel.add(viewAllLabel, BorderLayout.CENTER);
        return buttonPanel;
    }

    private void setupDialog() {
        int headerHeight = 44;
        int itemHeight = 60;      
        int separatorHeight = 1;
        int buttonHeight = 40;

        int contentHeight = 0;

        if (showAllItems && notificationCount > 3) {
            // Show all items mode
            contentHeight += notificationCount * itemHeight;
            if (notificationCount > 1) {
                contentHeight += (notificationCount - 1) * separatorHeight;
            }
        } else {
            // Always 3 slots mode
            contentHeight += 3 * itemHeight;
            contentHeight += 2 * separatorHeight;

            // Add "View All" button if applicable
            if (!showAllItems && notificationCount > 3) {
                contentHeight += separatorHeight + buttonHeight;
            }
        }

        int totalHeight = headerHeight + contentHeight;
        setSize(320, totalHeight);

        // Rest of method remains same...
        setBackground(Color.WHITE);
        getRootPane().setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            BorderFactory.createEmptyBorder()
        ));
    }

    public void showNotificationBelowBell(Component bellIcon) {
        // Reset mode tampilan
        showAllItems = false;

        // Load data dan setup dialog
        loadNotifikasiData();
        setupDialog();

        // Calculate position below the bell icon
        Point bellLocation = bellIcon.getLocationOnScreen();

        // Position the popup below and aligned to the right edge of the bell
        int x = bellLocation.x + bellIcon.getWidth() - getWidth();
        int y = bellLocation.y + bellIcon.getHeight() + 5; // 5px gap below bell

        // Ensure dialog stays within screen bounds
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Adjust horizontal position if needed
        if (x + getWidth() > screenSize.width) {
            x = screenSize.width - getWidth() - 10;
        }
        if (x < 10) {
            x = 10;
        }

        // Adjust vertical position if needed
        if (y + getHeight() > screenSize.height) {
            y = bellLocation.y - getHeight() - 5; // Show above bell if no space below
        }
        if (y < 10) {
            y = 10;
        }

        setLocation(x, y);
        setVisible(true);
        toFront();

        // Add global click listener to close dialog when clicking outside
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            @Override
            public void eventDispatched(AWTEvent event) {
                if (event.getID() == MouseEvent.MOUSE_PRESSED) {
                    MouseEvent me = (MouseEvent) event;
                    Component clicked = SwingUtilities.getDeepestComponentAt(
                        me.getComponent(), me.getX(), me.getY());

                    if (clicked != null && !SwingUtilities.isDescendingFrom(clicked, PanelNotifikasiStok.this)) {
                        dispose();
                        Toolkit.getDefaultToolkit().removeAWTEventListener(this);
                    }
                }
            }
        }, AWTEvent.MOUSE_EVENT_MASK);
    }

    public boolean isStokMenipis() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM produk WHERE " +
                        "    (nama_produk = 'Refill Galon' AND stok < 100) " +
                        "    OR " +
                        "    (nama_produk != 'Refill Galon' AND stok < 10)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    int total = rs.getInt("total");
                    return total > 0;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(PanelNotifikasiStok.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public void refreshData() {
        SwingUtilities.invokeLater(() -> {
            showAllItems = false; // Reset ke mode 3 item
            loadNotifikasiData();
            setupDialog();
            revalidate();
            repaint();
        });
    }
    
}
