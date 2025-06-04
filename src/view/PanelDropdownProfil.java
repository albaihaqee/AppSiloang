package view;

import Config.Koneksi;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PanelDropdownProfil extends javax.swing.JDialog {

    private Connection conn;
    private String currentUserId;
    private JPanel contentPanel;
    private JPanel itemsContainer;
    
    public void setCurrentUserId(String userId) {
        this.currentUserId = userId;
    }

    public String getCurrentUserId() {
        return this.currentUserId;
    }
    
    public PanelDropdownProfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        
        conn = Koneksi.getConnection();
        
        initComponents();
        initializeComponents();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
            .addGap(0, 158, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(PanelDropdownProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDropdownProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDropdownProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDropdownProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelDropdownProfil dialog = new PanelDropdownProfil(new javax.swing.JFrame(), true);
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

        // Items container
        itemsContainer = new JPanel();
        itemsContainer.setLayout(new BoxLayout(itemsContainer, BoxLayout.Y_AXIS));
        itemsContainer.setBackground(Color.WHITE);

        // Add menu items
        loadMenuItems();

        contentPanel.add(itemsContainer, BorderLayout.CENTER);
        add(contentPanel);

        // Add drop shadow effect
        setBackground(new Color(0, 0, 0, 0)); // Transparent background for shadow
    }

    private JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(17, 97, 171));
        headerPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        headerPanel.setPreferredSize(new Dimension(280, 44)); // Fixed header height

        // Left side - Icon and title
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        leftPanel.setBackground(new Color(17, 97, 171));

        // Use SVG icon instead of emoji
        JLabel iconLabel = createSVGIcon("icons/produk.svg", 16);
        if (iconLabel == null) {
            iconLabel = new JLabel("👤"); // fallback
            iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        }
        iconLabel.setBorder(new EmptyBorder(0, 0, 0, 8));

        JLabel titleLabel = new JLabel("Profil Pengguna");
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

    private void loadMenuItems() {
        // Account menu item
        JPanel accountPanel = createMenuItemPanel("Account", "Kelola informasi akun", "account.svg", "👤", () -> {
            handleAccountClick();
        });
        itemsContainer.add(accountPanel);
        itemsContainer.add(createSeparator());

        // Change Password menu item
        JPanel passwordPanel = createMenuItemPanel("Ganti Password", "Ubah kata sandi akun", "password.svg", "🔑", () -> {
            handleChangePasswordClick();
        });
        itemsContainer.add(passwordPanel);
        itemsContainer.add(createSeparator());

        // Logout menu item
        JPanel logoutPanel = createMenuItemPanel("Logout", "Keluar dari aplikasi", "logout.svg", "🚪", () -> {
            handleLogoutClick();
        });
        itemsContainer.add(logoutPanel);
    }

    private JPanel createMenuItemPanel(String title, String subtitle, String svgPath, String fallbackEmoji, Runnable action) {
        JPanel itemPanel = new JPanel(new BorderLayout());
        itemPanel.setBackground(Color.WHITE);
        itemPanel.setBorder(new EmptyBorder(12, 16, 12, 16));
        itemPanel.setPreferredSize(new Dimension(280, 60)); // Fixed item height
        itemPanel.setMaximumSize(new Dimension(280, 60));
        itemPanel.setMinimumSize(new Dimension(280, 60));

        // Left side - Icon and main info
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.WHITE);

        // Use SVG icon
        JLabel iconLabel = createSVGIcon(svgPath, 16);
        if (iconLabel == null) {
            iconLabel = new JLabel(fallbackEmoji);
            iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        }
        iconLabel.setBorder(new EmptyBorder(0, 0, 0, 12));

        // Menu info panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBackground(Color.WHITE);

        // Menu title
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        titleLabel.setForeground(new Color(60, 60, 60));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Menu subtitle
        JLabel subtitleLabel = new JLabel(subtitle);
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        subtitleLabel.setForeground(new Color(120, 120, 120));
        subtitleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        infoPanel.add(titleLabel);
        infoPanel.add(Box.createVerticalStrut(2));
        infoPanel.add(subtitleLabel);

        leftPanel.add(iconLabel, BorderLayout.WEST);
        leftPanel.add(infoPanel, BorderLayout.CENTER);

        // Right side - Arrow indicator
        JLabel arrowLabel = new JLabel("›");
        arrowLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        arrowLabel.setForeground(new Color(160, 160, 160));

        itemPanel.add(leftPanel, BorderLayout.CENTER);
        itemPanel.add(arrowLabel, BorderLayout.EAST);

        // Hover effect and click handling
        itemPanel.addMouseListener(new MouseAdapter() {
            Color originalColor = itemPanel.getBackground();

            @Override
            public void mouseEntered(MouseEvent e) {
                itemPanel.setBackground(new Color(248, 249, 250));
                itemPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                itemPanel.setBackground(originalColor);
                itemPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (action != null) {
                    action.run();
                }
            }
        });

        return itemPanel;
    }

    private JSeparator createSeparator() {
        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(240, 240, 240));
        separator.setPreferredSize(new Dimension(280, 1));
        separator.setMaximumSize(new Dimension(280, 1));
        separator.setMinimumSize(new Dimension(280, 1));
        return separator;
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

    private void setupDialog() {
        int headerHeight = 44;
        int itemHeight = 60;      
        int separatorHeight = 1;
        int totalMenuItems = 3; // Account, Change Password, Logout

        int contentHeight = (totalMenuItems * itemHeight) + ((totalMenuItems - 1) * separatorHeight);
        int totalHeight = headerHeight + contentHeight;
        
        setSize(280, totalHeight);

        setBackground(Color.WHITE);
        getRootPane().setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            BorderFactory.createEmptyBorder()
        ));
    }

    public void showDropdownBelowProfile(Component profileComponent) {
        // Calculate position below the profile component
        Point profileLocation = profileComponent.getLocationOnScreen();

        // Position the popup below and aligned to the right edge of the profile
        int x = profileLocation.x + profileComponent.getWidth() - getWidth();
        int y = profileLocation.y + profileComponent.getHeight() + 5; // 5px gap below profile

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
            y = profileLocation.y - getHeight() - 5; // Show above profile if no space below
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

                    if (clicked != null && !SwingUtilities.isDescendingFrom(clicked, PanelDropdownProfil.this)) {
                        dispose();
                        Toolkit.getDefaultToolkit().removeAWTEventListener(this);
                    }
                }
            }
        }, AWTEvent.MOUSE_EVENT_MASK);
    }

    // Action handlers
    private void handleAccountClick() {
        dispose();
        if (currentUserId == null || currentUserId.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Data user tidak tersedia. Silakan login ulang.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Panggil method untuk menampilkan data user
        getUserInfo(currentUserId);
    }

    private void handleChangePasswordClick() {
        dispose();
        JOptionPane.showMessageDialog(getParent(), 
            "Dialog ganti password akan dibuka\n(Implementasi fitur ganti password di sini)", 
            "Ganti Password", 
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void handleLogoutClick() {
        int confirmDialog = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Apakah Anda yakin ingin logout?",
                "Konfirmasi Logout",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        if (confirmDialog == javax.swing.JOptionPane.YES_OPTION) {
            // Tutup dialog dropdown profil
            this.dispose();

            // Cari dan tutup frame utama
            Window[] windows = Window.getWindows();
            for (Window window : windows) {
                if (window instanceof JFrame && window.isDisplayable()) {
                    window.dispose();
                }
            }

            // Pastikan frame login dibuat setelah event dispatch queue kosong
            SwingUtilities.invokeLater(() -> {
                FiturLogin LoginFrame = new FiturLogin();
                LoginFrame.setVisible(true);
                LoginFrame.setExtendedState(JFrame.NORMAL); // Pastikan tidak minimized
                LoginFrame.toFront();
                LoginFrame.requestFocus();
            });
        }
    }
    
    private void getUserInfo(String userId) {
        try {
            String sql = "SELECT * FROM users WHERE id_user = ? OR username = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userId);
            pst.setString(2, userId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String idUser = rs.getString("id_user");
                String namaUser = rs.getString("nama_user");
                String rfidUser = rs.getString("rfid_user");
                String username = rs.getString("username");
                String level = rs.getString("level");

                StringBuilder message = new StringBuilder();
                message.append("INFORMASI AKUN PENGGUNA\n");
                message.append("================================\n");
                message.append("ID User        : ").append(idUser).append("\n");
                message.append("Nama User      : ").append(namaUser).append("\n");
                message.append("RFID User      : ").append(rfidUser != null ? rfidUser : "Tidak ada").append("\n");
                message.append("Username       : ").append(username).append("\n");
                message.append("Level          : ").append(level).append("\n");
                message.append("================================");

                JOptionPane.showMessageDialog(
                    this,
                    message.toString(),
                    "Informasi Akun",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Data user tidak ditemukan.",
                    "User Tidak Ditemukan",
                    JOptionPane.WARNING_MESSAGE
                );
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
}
