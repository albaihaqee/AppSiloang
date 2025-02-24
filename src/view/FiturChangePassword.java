package view;

import Config.Koneksi;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FiturChangePassword extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;

    public FiturChangePassword() {
        initComponents();
        conn = Koneksi.getConnection();
        lb_hidePass.setVisible(false);
        lb_hidePass1.setVisible(false);
        //tf_email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan email");
        //tf_passLama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password lama");
        //tf_passBaru.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buat password baru");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bg_left = new javax.swing.JPanel();
        lb_logoSiloang = new javax.swing.JLabel();
        lb_arrowBack = new javax.swing.JLabel();
        bg_right = new javax.swing.JPanel();
        lb_setPassword = new javax.swing.JLabel();
        lb_create = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_passBaru = new javax.swing.JLabel();
        bt_updatePassword = new javax.swing.JButton();
        lb_passLama = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lb_hidePass1 = new javax.swing.JLabel();
        lb_showPass1 = new javax.swing.JLabel();
        lb_hidePass = new javax.swing.JLabel();
        lb_showPass = new javax.swing.JLabel();
        tf_passLama = new javax.swing.JPasswordField();
        tf_passBaru = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORGOT PASSWORD - Aplikasi Desktop SiLoang");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        bg_left.setBackground(new java.awt.Color(255, 255, 255));

        lb_logoSiloang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_formSiloang.png"))); // NOI18N
        lb_logoSiloang.setText("jLabel1");

        lb_arrowBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_arrowBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_arrowBack.png"))); // NOI18N
        lb_arrowBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_arrowBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_leftLayout = new javax.swing.GroupLayout(bg_left);
        bg_left.setLayout(bg_leftLayout);
        bg_leftLayout.setHorizontalGroup(
            bg_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_leftLayout.createSequentialGroup()
                .addGroup(bg_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_logoSiloang, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_arrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg_leftLayout.setVerticalGroup(
            bg_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_leftLayout.createSequentialGroup()
                .addComponent(lb_arrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_logoSiloang, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(bg_left);
        bg_left.setBounds(0, 0, 400, 500);

        bg_right.setBackground(new java.awt.Color(17, 97, 171));
        bg_right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_setPassword.setBackground(new java.awt.Color(255, 255, 255));
        lb_setPassword.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lb_setPassword.setForeground(new java.awt.Color(255, 255, 255));
        lb_setPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_setPassword.setText("Set a new password");
        bg_right.add(lb_setPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));

        lb_create.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_create.setForeground(new java.awt.Color(255, 255, 255));
        lb_create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_create.setText(" Create a new password.");
        bg_right.add(lb_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, -1));

        lb_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setText("Username");
        bg_right.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 150, -1, -1));

        lb_passBaru.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_passBaru.setForeground(new java.awt.Color(255, 255, 255));
        lb_passBaru.setText("Password Baru");
        bg_right.add(lb_passBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 280, -1, 30));

        bt_updatePassword.setBackground(new java.awt.Color(28, 179, 228));
        bt_updatePassword.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bt_updatePassword.setForeground(new java.awt.Color(255, 255, 255));
        bt_updatePassword.setText("Update Password");
        bt_updatePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_updatePasswordMouseClicked(evt);
            }
        });
        bg_right.add(bt_updatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 380, 230, 40));

        lb_passLama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_passLama.setForeground(new java.awt.Color(255, 255, 255));
        lb_passLama.setText("Password Lama");
        bg_right.add(lb_passLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 210, -1, 30));

        tf_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 170, 230, 40));

        lb_hidePass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hidePass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeVisible.png"))); // NOI18N
        lb_hidePass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_hidePass1MouseClicked(evt);
            }
        });
        bg_right.add(lb_hidePass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 310, 40, 40));

        lb_showPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeDetector.png"))); // NOI18N
        lb_showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_showPass1MouseClicked(evt);
            }
        });
        bg_right.add(lb_showPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 310, 40, 40));

        lb_hidePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeVisible.png"))); // NOI18N
        lb_hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_hidePassMouseClicked(evt);
            }
        });
        bg_right.add(lb_hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 240, 40, 40));

        lb_showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeDetector.png"))); // NOI18N
        lb_showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_showPassMouseClicked(evt);
            }
        });
        bg_right.add(lb_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 240, 40, 40));

        tf_passLama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_passLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 240, 230, 40));

        tf_passBaru.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_passBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 310, 230, 40));

        jPanel1.add(bg_right);
        bg_right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_arrowBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_arrowBackMouseClicked
        this.dispose();
        FiturLogin LoginFrame = new FiturLogin();
        LoginFrame.setVisible(true);
    }//GEN-LAST:event_lb_arrowBackMouseClicked

    private void bt_updatePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_updatePasswordMouseClicked
        if (tf_email.getText().isEmpty() || 
            tf_passLama.getText().isEmpty() || 
            tf_passBaru.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        updatePassword();
    }//GEN-LAST:event_bt_updatePasswordMouseClicked

    private void lb_showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showPassMouseClicked
        lb_showPass.setVisible(false);
        lb_hidePass.setVisible(true);
        tf_passLama.setEchoChar((char)0);
    }//GEN-LAST:event_lb_showPassMouseClicked

    private void lb_hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_hidePassMouseClicked
        lb_showPass.setVisible(true);
        lb_hidePass.setVisible(false);
        tf_passLama.setEchoChar('•');
    }//GEN-LAST:event_lb_hidePassMouseClicked

    private void lb_showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showPass1MouseClicked
        lb_showPass1.setVisible(false);
        lb_hidePass1.setVisible(true);
        tf_passBaru.setEchoChar((char)0);
    }//GEN-LAST:event_lb_showPass1MouseClicked

    private void lb_hidePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_hidePass1MouseClicked
        lb_showPass1.setVisible(true);
        lb_hidePass1.setVisible(false);
        tf_passBaru.setEchoChar('•');
    }//GEN-LAST:event_lb_hidePass1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        //FlatDarkLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiturChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_left;
    private javax.swing.JPanel bg_right;
    private javax.swing.JButton bt_updatePassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_arrowBack;
    private javax.swing.JLabel lb_create;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_hidePass;
    private javax.swing.JLabel lb_hidePass1;
    private javax.swing.JLabel lb_logoSiloang;
    private javax.swing.JLabel lb_passBaru;
    private javax.swing.JLabel lb_passLama;
    private javax.swing.JLabel lb_setPassword;
    private javax.swing.JLabel lb_showPass;
    private javax.swing.JLabel lb_showPass1;
    private javax.swing.JTextField tf_email;
    private javax.swing.JPasswordField tf_passBaru;
    private javax.swing.JPasswordField tf_passLama;
    // End of variables declaration//GEN-END:variables

    private void updatePassword() {
        String username = tf_email.getText();
        String passLama = tf_passLama.getText();
        String passBaru = tf_passBaru.getText();
        
        try {
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, passLama);
            rs = st.executeQuery();
            
            if (rs.next()) {
                String updateSql = "UPDATE user SET password=? WHERE username=?";
                st = conn.prepareStatement(updateSql);
                st.setString(1, passBaru);
                st.setString(2, username);
                
                int rowsAffected = st.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Password berhasil diperbarui");
                    clearForm();
                    new FiturLogin().setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password lama tidak sesuai");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void clearForm() {
        tf_email.setText("");
        tf_passLama.setText("");
        tf_passBaru.setText("");
    }
}

