package view;

import view.FiturLogin;
import Config.Koneksi;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FiturRegister extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;

    public FiturRegister() {
        initComponents();
        conn = Koneksi.getConnection();
        setBlueSidebarIcons();
        lb_hidePassword.setVisible(false);
        
        logo.setIcon(new FlatSVGIcon("icons/siloang.svg", logo.getWidth(), logo.getHeight()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bg_left = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panahKiri = new javax.swing.JLabel();
        bg_right = new javax.swing.JPanel();
        lb_createAccount = new javax.swing.JLabel();
        lb_already = new javax.swing.JLabel();
        lb_fullName = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        lb_email = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lb_hidePassword = new javax.swing.JLabel();
        lb_showPassword = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        bt_signUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER - Aplikasi Desktop SiLoang");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        bg_left.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_formSiloang.png"))); // NOI18N

        panahKiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_arrowBack.png"))); // NOI18N
        panahKiri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panahKiriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_leftLayout = new javax.swing.GroupLayout(bg_left);
        bg_left.setLayout(bg_leftLayout);
        bg_leftLayout.setHorizontalGroup(
            bg_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_leftLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(panahKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bg_leftLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg_leftLayout.setVerticalGroup(
            bg_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_leftLayout.createSequentialGroup()
                .addComponent(panahKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(bg_left);
        bg_left.setBounds(0, 0, 400, 500);

        bg_right.setBackground(new java.awt.Color(14, 97, 171));
        bg_right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_createAccount.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lb_createAccount.setForeground(new java.awt.Color(255, 255, 255));
        lb_createAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_createAccount.setText("Create new account");
        bg_right.add(lb_createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, -1));

        lb_already.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_already.setForeground(new java.awt.Color(255, 255, 255));
        lb_already.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_already.setText("Already registered? Login");
        bg_right.add(lb_already, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, -1));

        lb_fullName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_fullName.setForeground(new java.awt.Color(255, 255, 255));
        lb_fullName.setText("Full Name");
        bg_right.add(lb_fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 158, -1, -1));

        tf_nama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 180, 230, 40));

        lb_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setText("Username");
        bg_right.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 225, -1, -1));

        tf_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 247, 230, 40));

        lb_hidePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeVisible.png"))); // NOI18N
        lb_hidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_hidePasswordMouseClicked(evt);
            }
        });
        bg_right.add(lb_hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 315, 40, 40));

        lb_showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeDetector.png"))); // NOI18N
        lb_showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_showPasswordMouseClicked(evt);
            }
        });
        bg_right.add(lb_showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 315, 40, 40));

        lb_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Password");
        bg_right.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 293, -1, -1));

        tf_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bg_right.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 315, 230, 40));

        bt_signUp.setBackground(new java.awt.Color(28, 179, 228));
        bt_signUp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bt_signUp.setForeground(new java.awt.Color(255, 255, 255));
        bt_signUp.setText("Sign Up");
        bt_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signUpActionPerformed(evt);
            }
        });
        bg_right.add(bt_signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 385, 230, 40));

        jPanel1.add(bg_right);
        bg_right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_hidePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_hidePasswordMouseClicked
        lb_showPassword.setVisible(true);
        lb_hidePassword.setVisible(false);
        tf_password.setEchoChar('•');
    }//GEN-LAST:event_lb_hidePasswordMouseClicked

    private void lb_showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showPasswordMouseClicked
        lb_showPassword.setVisible(false);
        lb_hidePassword.setVisible(true);
        tf_password.setEchoChar((char)0);
    }//GEN-LAST:event_lb_showPasswordMouseClicked

    private void bt_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signUpActionPerformed
        registerUser();
        clearForm();
    }//GEN-LAST:event_bt_signUpActionPerformed

    private void panahKiriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panahKiriMouseClicked
        this.dispose();
        FiturLogin LoginFrame = new FiturLogin();
        LoginFrame.setVisible(true);
    }//GEN-LAST:event_panahKiriMouseClicked

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
            java.util.logging.Logger.getLogger(FiturRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiturRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiturRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiturRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiturRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_left;
    private javax.swing.JPanel bg_right;
    private javax.swing.JButton bt_signUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_already;
    private javax.swing.JLabel lb_createAccount;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_fullName;
    private javax.swing.JLabel lb_hidePassword;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_showPassword;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel panahKiri;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JPasswordField tf_password;
    // End of variables declaration//GEN-END:variables

private void registerUser() {
        String nama = tf_nama.getText();
        String username = tf_email.getText();
        String password = tf_password.getText();
        String level = "Kasir";
        
        try {
            String sql = "SELECT * FROM user WHERE username=?";
            st = conn.prepareStatement(sql);
            st.setString(1, username);
            rs = st.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Username sudah terdaftar!");
                return;
            }
            
            String queryId = "SELECT id_user FROM user ORDER BY id_user DESC LIMIT 1";
            st = conn.prepareStatement(queryId);
            rs = st.executeQuery();
        
            String newId = "USR01"; // ID default jika belum ada data
        
            if(rs.next()) {
                String lastId = rs.getString("id_user");
                int num = Integer.parseInt(lastId.substring(3)) + 1;
                newId = String.format("USR%02d", num);
            }

            String insertSql = "INSERT INTO user (id_user, nama, username, password, level) VALUES (?, ?, ?, ?, 'Kasir')";
            st = conn.prepareStatement(insertSql);
            st.setString(1, newId);
            st.setString(2, nama);
            st.setString(3, username);
            st.setString(4, password);
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registrasi Berhasil");
                clearForm();
                new FiturLogin().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Registrasi Gagal");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void clearForm() {
        tf_nama.setText("");
        tf_email.setText("");
        tf_email.setText("");
    }
    
    private void setBlueSidebarIcons() {
        // Ukuran ikon
        int arrowIconSize = 20;
        int eyeIconSize = 15;

        // Ikon panah kiri
        FlatSVGIcon panahKiriIcon = new FlatSVGIcon("icons/panahKiri.svg");
        panahKiriIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        panahKiri.setIcon(panahKiriIcon.derive(arrowIconSize, arrowIconSize));

        // Ikon mata (eye)
        FlatSVGIcon eyeIcon = new FlatSVGIcon("icons/eye.svg");
        eyeIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_showPassword.setIcon(eyeIcon.derive(eyeIconSize, eyeIconSize));

        // Ikon mata tersembunyi (hide eye)
        FlatSVGIcon hideEyeIcon = new FlatSVGIcon("icons/crossedEye.svg");
        hideEyeIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_hidePassword.setIcon(hideEyeIcon.derive(eyeIconSize, eyeIconSize));
    }
}

