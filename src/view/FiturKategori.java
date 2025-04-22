package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.util.logging.Level;         
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.table.DefaultTableCellRenderer;

public class FiturKategori extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturKategori(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setupCustomTableStyle();
        setTabelModel();
        loadData();
        setPlaceholderField();
        setButtonIcons();
        
        FlatSVGIcon kategoriIcon = new FlatSVGIcon("icons/category.svg").derive(15, 15);
        kategoriIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_pel.setIcon(kategoriIcon);
        
        FlatSVGIcon kategoriSVG = new FlatSVGIcon("icons/category.svg").derive(15, 15);
        kategoriSVG.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        icon_pelanggan.setIcon(kategoriSVG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rb_jenisKelamin = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_pel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        icon_pelanggan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lb_nama = new javax.swing.JLabel();
        txt_idKategori = new javax.swing.JTextField();
        lb_id = new javax.swing.JLabel();
        lb_satuan = new javax.swing.JLabel();
        txt_namaKategori = new javax.swing.JTextField();
        txt_deskripsi = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Data Master > Kategori");

        lb_pel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_pel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Kategori SiLoang");

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        btn_add.setBackground(new java.awt.Color(0, 0, 255));
        btn_add.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btn_add.setText("TAMBAH");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delete.png"))); // NOI18N
        btn_delete.setText("HAPUS");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addComponent(btn_add)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_delete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_batal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lb_pel)
                            .addGap(7, 7, 7)
                            .addComponent(jLabel1))))
                .addGap(10, 10, 10))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lb_pel)))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Data Master > Kategori");

        icon_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        icon_pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Kategori SiLoang");

        btn_save.setBackground(new java.awt.Color(0, 0, 255));
        btn_save.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_simpan.png"))); // NOI18N
        btn_save.setText("SIMPAN");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 153, 0));
        btn_cancel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_cancel.setText("BATAL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        lb_nama.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_nama.setText("Nama");

        txt_idKategori.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_idKategori.setForeground(new java.awt.Color(102, 102, 102));

        lb_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_id.setText("ID");

        lb_satuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_satuan.setText("Deskripsi");

        txt_namaKategori.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_namaKategori.setForeground(new java.awt.Color(102, 102, 102));

        txt_deskripsi.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_deskripsi.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_deskripsi)
                    .addComponent(txt_idKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(txt_namaKategori, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(icon_pelanggan)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btn_save)
                                .addGap(10, 10, 10)
                                .addComponent(btn_cancel))
                            .addComponent(lb_satuan)
                            .addComponent(lb_id)
                            .addComponent(lb_nama))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(icon_pelanggan)))
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lb_id)
                .addGap(10, 10, 10)
                .addComponent(txt_idKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_nama)
                .addGap(10, 10, 10)
                .addComponent(txt_namaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_satuan)
                .addGap(10, 10, 10)
                .addComponent(txt_deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();

        txt_idKategori.setText(setIDKategori());
        if (btn_add.getText().equals("EDIT")) {
            dataTabel();
            btn_save.setText("PERBARUI");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        showPanel();
        //panelMain.removeAll();
        //panelMain.add(panelView);
        //panelMain.repaint();
        //panelMain.revalidate();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (btn_save.getText().equals("TAMBAH")) {
            btn_save.setText("SIMPAN");
        } else if (btn_save.getText().equals("SIMPAN")) {
            insertData();
        } else if (btn_save.getText().equals("PERBARUI")) {
            updateData();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        if (btn_add.getText().equals("TAMBAH")) {
            btn_add.setText("EDIT");
            btn_delete.setVisible(true);
            btn_batal.setVisible(true);
        }
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel icon_pelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_pel;
    private javax.swing.JLabel lb_satuan;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rb_jenisKelamin;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_deskripsi;
    private javax.swing.JTextField txt_idKategori;
    private javax.swing.JTextField txt_namaKategori;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        btn_batal.setVisible(false);
        btn_delete.setVisible(false);
    }

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturKategori(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void resetForm() {
        txt_idKategori.setText("");
        txt_namaKategori.setText("");
        txt_deskripsi.setText("");
    }
    
    private void setupCustomTableStyle() {
        try {
            Color headerColor = new Color(17, 97, 171);
            Color selectionColor = new Color(200, 200, 200);

            UIManager.put("TableHeader.background", headerColor);
            UIManager.put("TableHeader.foreground", Color.WHITE);
            UIManager.put("Table.selectionBackground", selectionColor);
            UIManager.put("Table.selectionForeground", Color.BLACK); // Text hitam untuk kontras dengan background abu-abu
            UIManager.put("Table.alternateRowColor", new Color(240, 240, 240));

            if (tbl_data != null) {
                tbl_data.getTableHeader().setBackground(headerColor);
                tbl_data.getTableHeader().setForeground(Color.WHITE);
                tbl_data.setFocusable(false);
                tbl_data.setRowSelectionAllowed(true);
                tbl_data.setColumnSelectionAllowed(false);
                tbl_data.setRowHeight(30);
                tbl_data.setShowGrid(false);
                tbl_data.setShowHorizontalLines(false);
                tbl_data.setShowVerticalLines(false);
                tbl_data.setIntercellSpacing(new Dimension(0, 0));

                tbl_data.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, 
                            boolean isSelected, boolean hasFocus, int row, int column) {
                        Component comp = super.getTableCellRendererComponent(table, value, 
                                isSelected, false, row, column);

                        if (isSelected) {
                            comp.setBackground(selectionColor);
                            comp.setForeground(Color.BLACK); // Text hitam untuk kontras
                        } else {
                            if (row % 2 == 0) {
                                comp.setBackground(Color.WHITE);
                            } else {
                                comp.setBackground(new Color(240, 240, 240));
                            }
                            comp.setForeground(Color.BLACK);
                        }

                        ((JComponent) comp).setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4));
                        return comp;
                    }
                });

                tbl_data.repaint();
            }
        } catch (Exception e) {
            System.err.println("Error saat mengatur custom style tabel: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID Kategori");
        model.addColumn("Nama Kategori");
        model.addColumn("Deskripsi");
    }
    
    private void setPlaceholderField() {
        txt_idKategori.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID Kategori");
        txt_namaKategori.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Kategori");
        txt_deskripsi.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan deskripsi disini");
        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM kategori";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idKategori = rs.getString("id_kategori");
                    String namaKategori = rs.getString("nama_kategori");
                    String deskKategori = rs.getString("deskripsi");

                    Object[] rowData = {idKategori, namaKategori, deskKategori};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Penomoran Otomatis ID Kategori
    private String setIDKategori() {
        String urutan = null;

        try {
            String sql = "SELECT RIGHT(id_kategori, 3) AS LastNumber "
                    + "FROM kategori "
                    + "WHERE id_kategori LIKE 'KT%' "
                    + "ORDER BY id_kategori DESC "
                    + "LIMIT 1";

            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("KT%03d", nextNumber);
            } else {
                urutan = "KT001";
            }

            rs.close();
            st.close();

        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
            urutan = "KT001";
        }
        return urutan;
    }

    private boolean cekDuplikatData(String idKategori, String namaKategori) {
        String query = "SELECT COUNT(*) FROM kategori WHERE id_kategori = ? OR nama_kategori = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, idKategori);
            ps.setString(2, namaKategori);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    private void insertData() {
        String idKategori = txt_idKategori.getText();
        String namaKategori = txt_namaKategori.getText();
        String deskKategori = txt_deskripsi.getText();
        
        if (idKategori.isEmpty() || namaKategori.isEmpty() || deskKategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cekDuplikatData(idKategori, namaKategori)) {
            JOptionPane.showMessageDialog(this, "Data Kategori sudah ada !", "Duplikasi Data", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String sql = "INSERT INTO kategori (id_kategori, nama_kategori, deskripsi) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idKategori);
            st.setString(2, namaKategori);
            st.setString(3, deskKategori);

            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel6.setText("Perbarui Data Kategori SiLoang");

        txt_idKategori.setEnabled(false);  //Gabisa diklik

        txt_idKategori.setText(tbl_data.getValueAt(row, 0).toString());
        txt_namaKategori.setText(tbl_data.getValueAt(row, 1).toString());
        txt_deskripsi.setText(tbl_data.getValueAt(row, 2).toString());
    }

    private void updateData() {
        String idKategori = txt_idKategori.getText();
        String namaKategori = txt_namaKategori.getText();
        String deskKategori = txt_deskripsi.getText();

        if (idKategori.isEmpty() || namaKategori.isEmpty() || deskKategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE kategori SET nama_kategori=?, deskripsi=? WHERE id_kategori=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, namaKategori);
            st.setString(2, deskKategori);
            st.setString(3, idKategori);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void deleteData() {
        int selectedRow = tbl_data.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM kategori WHERE id_kategori=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);

                    int rowDelete = st.executeUpdate();
                    if (rowDelete > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String kataKunci = txt_search.getText();

        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM kategori WHERE nama_kategori LIKE ? OR deskripsi LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idKategori = rs.getString("id_kategori");
                    String namaKategori = rs.getString("nama_kategori");
                    String deskKategori = rs.getString("deskripsi");

                    Object[] rowData = {idKategori, namaKategori, deskKategori};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKategori.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setButtonIcons() {
        int iconSize = 18;  
        Color iconColor = Color.WHITE;  

        btn_add.setIcon(createSVGIcon("icons/add.svg", iconSize, iconColor));
        btn_delete.setIcon(createSVGIcon("icons/delete.svg", iconSize, iconColor));
        btn_batal.setIcon(createSVGIcon("icons/cancel.svg", iconSize, iconColor));
        btn_save.setIcon(createSVGIcon("icons/save.svg", iconSize, iconColor));
        btn_cancel.setIcon(createSVGIcon("icons/cancel.svg", iconSize, iconColor));
    }

    private FlatSVGIcon createSVGIcon(String path, int size, Color color) {
        FlatSVGIcon icon = new FlatSVGIcon(path).derive(size, size);
        icon.setColorFilter(new FlatSVGIcon.ColorFilter(c -> color));
        return icon;
    }
}
