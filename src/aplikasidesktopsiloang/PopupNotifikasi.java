package aplikasidesktopsiloang;

import view.*;
import Config.Koneksi;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PopupNotifikasi extends javax.swing.JDialog {

    private Connection conn;

    private String namaProduk;
    private String satuanProduk;

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getSatuanProduk() {
        return satuanProduk;
    }

    public PopupNotifikasi(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        setUndecorated(true);
        initComponents();
        panel_notif.setLayout(new BorderLayout());

        conn = Koneksi.getConnection();
        tampilkanProdukStokHampirHabis();
//        setTabelModel();
//        loadData();
//        actionButton();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_notif = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(17, 97, 171));

        panel_notif.setBackground(new java.awt.Color(17, 97, 171));
        panel_notif.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_notif, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_notif, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(PopupNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PopupNotifikasi dialog = new PopupNotifikasi(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel panel_notif;
    // End of variables declaration//GEN-END:variables

//    private void actionButton() {
//
//        tbl_data.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//            }
//        });
//
//    }
    public void showAtScreenCorner() {
        // Ambil ukuran layar
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;

        // Ukuran dialog
        int dialogWidth = getWidth();
        int dialogHeight = getHeight();

        int x = screenWidth - dialogWidth - 190;
        int y = 80;

        setLocation(x, y);
        setVisible(true);

        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            @Override
            public void eventDispatched(AWTEvent event) {
                if (event.getID() == MouseEvent.MOUSE_PRESSED) {
                    MouseEvent me = (MouseEvent) event;
                    Component clicked = SwingUtilities.getDeepestComponentAt(me.getComponent(), me.getX(), me.getY());

                    if (clicked != null && !SwingUtilities.isDescendingFrom(clicked, PopupNotifikasi.this)) {
                        dispose(); // Tutup dialog
                        Toolkit.getDefaultToolkit().removeAWTEventListener(this); // Bersihkan listener
                    }
                }
            }
        }, AWTEvent.MOUSE_EVENT_MASK);
    }

    private void tampilkanProdukStokHampirHabis() {
        if (conn == null || panel_notif == null) {
            return;
        }

        try {
            panel_notif.removeAll();
            panel_notif.setLayout(new BorderLayout());
            panel_notif.setBackground(Color.WHITE);
            panel_notif.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

            // Header panel dengan ukuran yang tepat
            JPanel headerPanel = new JPanel(new BorderLayout());
            headerPanel.setBackground(new Color(220, 53, 69));

            JLabel headerLabel = new JLabel("⚠ STOK HAMPIR HABIS", JLabel.CENTER);
            headerLabel.setFont(new Font("Arial", Font.BOLD, 12));
            headerLabel.setForeground(Color.WHITE);
            headerLabel.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8)); // Padding minimal
            headerPanel.add(headerLabel, BorderLayout.CENTER);

            // Content panel dengan layout yang ketat
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
            contentPanel.setBackground(Color.WHITE);

            String sql = "SELECT nama_produk, stok \n"
                    + "FROM produk \n"
                    + "WHERE \n"
                    + "    (nama_produk = 'Refill Galon' AND stok < 100)\n"
                    + "    OR\n"
                    + "    (nama_produk != 'Refill Galon' AND stok < 10)\n"
                    + "ORDER BY stok ASC;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            int itemCount = 0;
            int maxLabelWidth = 0;

            while (rs.next()) {
                String nama = rs.getString("nama_produk");
                int stok = rs.getInt("stok");

                // Buat label langsung tanpa panel wrapper
                JLabel itemLabel = new JLabel("• " + nama + " (Stok: " + stok + ")");
                itemLabel.setFont(new Font("Arial", Font.PLAIN, 12));
                itemLabel.setForeground(stok < 5 ? Color.RED : new Color(255, 140, 0));

                // Padding minimal
                itemLabel.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

                // Background bergantian
                if (itemCount % 2 == 1) {
                    itemLabel.setOpaque(true);
                    itemLabel.setBackground(new Color(248, 249, 250));
                }

                // Hitung lebar teks untuk menentukan ukuran panel
                FontMetrics fm = itemLabel.getFontMetrics(itemLabel.getFont());
                int labelWidth = fm.stringWidth(itemLabel.getText()) + 20; // +20 untuk padding kiri-kanan
                maxLabelWidth = Math.max(maxLabelWidth, labelWidth);

                contentPanel.add(itemLabel);
                itemCount++;
            }

            rs.close();
            ps.close();

            if (itemCount > 0) {
                // Hitung ukuran header berdasarkan teks header
                FontMetrics headerFM = headerLabel.getFontMetrics(headerLabel.getFont());
                int headerWidth = headerFM.stringWidth(headerLabel.getText()) + 30;

                // Tentukan lebar final (ambil yang terbesar antara header dan content)
                int finalWidth = Math.max(headerWidth, maxLabelWidth);
                finalWidth = Math.max(finalWidth, 180); // minimal 180px
                finalWidth = Math.min(finalWidth, 300); // maksimal 300px

                // Set ukuran header sesuai dengan lebar final
                headerPanel.setPreferredSize(new Dimension(finalWidth, 30));

                // Hitung tinggi content (tanpa extra space)
                int itemHeight = 24; // tinggi per item yang lebih kecil
                int contentHeight = itemCount * itemHeight;

                // Total tinggi panel
                int totalHeight = 30 + contentHeight + 4; // header + content + border

                // Jika content terlalu tinggi, gunakan scroll
                if (contentHeight > 120) {
                    JScrollPane scrollPane = new JScrollPane(contentPanel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    scrollPane.setPreferredSize(new Dimension(finalWidth, 120));

                    panel_notif.add(headerPanel, BorderLayout.NORTH);
                    panel_notif.add(scrollPane, BorderLayout.CENTER);
                    totalHeight = 30 + 120 + 4;
                } else {
                    // Set ukuran content panel secara eksplisit
                    contentPanel.setPreferredSize(new Dimension(finalWidth, contentHeight));

                    panel_notif.add(headerPanel, BorderLayout.NORTH);
                    panel_notif.add(contentPanel, BorderLayout.CENTER);
                }

                // Set ukuran final panel secara eksplisit
                panel_notif.setPreferredSize(new Dimension(finalWidth, totalHeight));
                panel_notif.setMinimumSize(new Dimension(finalWidth, totalHeight));
                panel_notif.setMaximumSize(new Dimension(finalWidth, totalHeight));

                // Posisikan panel
//                panel_notif.setBounds(
//                        Jdialog.getWidth() - finalWidth - 10,
//                        10,
//                        finalWidth,
//                        totalHeight
//                );
                panel_notif.setVisible(true);
                panel_notif.revalidate();
                panel_notif.repaint();

                Container parent = panel_notif.getParent();
                if (parent != null) {
                    parent.revalidate();
                    parent.repaint();
                }

            } else {
                panel_notif.setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// Method untuk memaksa update layout jika dipanggil dari thread lain
    private void forceLayoutUpdate() {
        SwingUtilities.invokeLater(() -> {
            if (panel_notif != null && panel_notif.isVisible()) {
                Container parent = panel_notif.getParent();
                if (parent != null) {
                    parent.doLayout();
                    parent.repaint();
                }
            }
        });
    }

//    private void getData(DefaultTableModel model) {
//        model.setRowCount(0);
//
//        try {
//            String sql = "SELECT * FROM produk WHERE stok < 10";
//            try (PreparedStatement st = conn.prepareStatement(sql)) {
//                ResultSet rs = st.executeQuery();
//
//                while (rs.next()) {
//                    String namaProduk = rs.getString("nama_produk");
//                    String stokProduk = rs.getString("stok");
//                    String satuanProduk = rs.getString("satuan");
//
//                    Object[] rowData = {namaProduk, stokProduk, satuanProduk};
//                    model.addRow(rowData);
//                }
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }
    public boolean isStokMenipis() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM produk WHERE stok < 10";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    int total = rs.getInt("total");
                    return total > 0;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(PopupNotifikasi.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

}
