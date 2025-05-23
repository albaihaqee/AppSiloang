package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.table.DefaultTableCellRenderer;

public class FiturStokOpname extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturStokOpname(String userID) {
        initComponents();
        conn = Koneksi.getConnection();
        this.userID = userID;
        setupCustomTableStyle();
        setTabelModel();
        addProdukListener();
        loadData();
        setPlaceholderField();
        valueComboBox();
        setButtonIcons();
        
        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/opname.svg").derive(15, 15);
        dashboardIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_produk.setIcon(dashboardIcon);
        
        FlatSVGIcon dashboardSVG = new FlatSVGIcon("icons/opname.svg").derive(15, 15);
        dashboardSVG.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        icon_produk.setIcon(dashboardSVG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_produk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        icon_produk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lb_nama = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lb_id = new javax.swing.JLabel();
        lb_diskon = new javax.swing.JLabel();
        lb_minPembelian = new javax.swing.JLabel();
        txt_stokSistem = new javax.swing.JTextField();
        lb_keterangan = new javax.swing.JLabel();
        txt_stokFisik = new javax.swing.JTextField();
        txt_tanggal = new com.toedter.calendar.JDateChooser();
        cb_idProduk = new javax.swing.JComboBox<>();
        lb_keterangan1 = new javax.swing.JLabel();
        txt_keterangan = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Data Master > Stok Opname");

        lb_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_produk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Stok Opname SiLoang");

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

        txt_search.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal)
                        .addGap(587, 587, 587))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                                .addGroup(panelViewLayout.createSequentialGroup()
                                    .addComponent(lb_produk)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel1))))
                        .addGap(10, 10, 10))))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lb_produk)))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Data Master > Stok Opname");

        icon_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        icon_produk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Stok Opname SiLoang");

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
        lb_nama.setText("Tanggal Opname");

        txt_id.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));

        lb_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_id.setText("ID Opname");

        lb_diskon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_diskon.setText("Stok Sistem");

        lb_minPembelian.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_minPembelian.setText("Produk");

        txt_stokSistem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_stokSistem.setForeground(new java.awt.Color(102, 102, 102));

        lb_keterangan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_keterangan.setText("Stok Fisik");

        txt_stokFisik.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_stokFisik.setForeground(new java.awt.Color(102, 102, 102));

        cb_idProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Produk" }));

        lb_keterangan1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_keterangan1.setText("Keterangan");

        txt_keterangan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_keterangan.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(lb_keterangan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_idProduk, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_tanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(icon_produk)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(txt_stokFisik)
                            .addComponent(txt_stokSistem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                        .addComponent(btn_save)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_cancel))
                                    .addComponent(lb_id, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_minPembelian, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_diskon, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addComponent(lb_keterangan1)
                                .addGap(835, 835, 835))
                            .addComponent(txt_keterangan))
                        .addGap(10, 10, 10))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(icon_produk)))
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lb_id)
                .addGap(10, 10, 10)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_nama)
                .addGap(10, 10, 10)
                .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_minPembelian)
                .addGap(10, 10, 10)
                .addComponent(cb_idProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_diskon)
                .addGap(10, 10, 10)
                .addComponent(txt_stokSistem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_keterangan)
                .addGap(10, 10, 10)
                .addComponent(txt_stokFisik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_keterangan1)
                .addGap(10, 10, 10)
                .addComponent(txt_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();

        txt_id.setText(setIDStokOpname());
        txt_tanggal.setDate(new Date());
        
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
    private javax.swing.JComboBox<String> cb_idProduk;
    private javax.swing.JLabel icon_produk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_diskon;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_keterangan;
    private javax.swing.JLabel lb_keterangan1;
    private javax.swing.JLabel lb_minPembelian;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_produk;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_keterangan;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_stokFisik;
    private javax.swing.JTextField txt_stokSistem;
    private com.toedter.calendar.JDateChooser txt_tanggal;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        btn_batal.setVisible(false);
        btn_delete.setVisible(false);
    }

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturStokOpname(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void resetForm() {
        txt_id.setText("");
        txt_tanggal.setDate(null);
        cb_idProduk.setSelectedIndex(0);
        txt_stokSistem.setText("");
        txt_stokFisik.setText("");
        txt_keterangan.setText("");
    }
    
    private void addProdukListener() {
        cb_idProduk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String namaProduk = cb_idProduk.getSelectedItem().toString();
                if (!namaProduk.equals("Pilih Produk")) {
                    int stokSistem = getStokSistemByNamaProduk(namaProduk);
                    txt_stokSistem.setText(String.valueOf(stokSistem));
                } else {
                    txt_stokSistem.setText("0");
                }
            }
        });
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
        model.addColumn("ID Opname");
        model.addColumn("Tanggal");
        model.addColumn("Petugas");
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Stok Sistem");
        model.addColumn("Stok Fisik");
        model.addColumn("Selisih");
        model.addColumn("Keterangan");
    }
    
    private void setPlaceholderField() {
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID Opname");
        txt_stokSistem.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "0");
        txt_stokFisik.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "0");
        txt_keterangan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan keterangan opname disini");
        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        
        if(cb_idProduk.getSelectedItem().equals("Pilih Produk")){
            cb_idProduk.setForeground(new Color(153,153,153));
        }
        
        cb_idProduk.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    if(cb_idProduk.getSelectedItem().equals("Pilih Produk")){
                        cb_idProduk.setForeground(new Color(153,153,153));
                    }else{
                        cb_idProduk.setForeground(new Color(0,0,0));
                    }
                }
            }
        });
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT s.id_opname, s.tanggal, u.nama, p.id_produk, p.nama_produk, " +
                         "d.stok_sistem, d.stok_fisik, d.selisih, d.keterangan " +
                         "FROM stok_opname s " +
                         "INNER JOIN user u ON u.id_user = s.id_user " +
                         "INNER JOIN detail_opname d ON d.id_opname = s.id_opname " +
                         "INNER JOIN produk p ON p.id_produk = d.id_produk " +
                         "ORDER BY s.id_opname ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idStokOpname        = rs.getString("id_opname");
                    String tanggalOpname       = rs.getString("tanggal");
                    String namaPetugas         = rs.getString("nama");
                    String idProduk            = rs.getString("id_produk");
                    String namaProduk          = rs.getString("nama_produk");
                    String stokSistem          = rs.getString("stok_sistem");
                    String stokFisik           = rs.getString("stok_fisik");
                    String selisihStok         = rs.getString("selisih");
                    String keteranganOpname    = rs.getString("keterangan");
                    
                    
                    Object[] rowData = {
                        idStokOpname,
                        tanggalOpname, 
                        namaPetugas,
                        idProduk,
                        namaProduk,
                        stokSistem,
                        stokFisik,
                        selisihStok,
                        keteranganOpname
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String setIDStokOpname() {
        String urutan = null;

        try {
            String sql = "SELECT RIGHT(id_opname, 3) AS LastNumber "
                         + "FROM stok_opname "
                         + "WHERE id_opname LIKE 'OP%' "
                         + "ORDER BY id_opname DESC "
                         + "LIMIT 1";

            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("OP%03d", nextNumber);
            } else {
                urutan = "OP001";
            }

            rs.close();
            st.close();

        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
            urutan = "OP001";
        }
        return urutan;
    }
    
    private void insertData() {
        String idStokOpname = txt_id.getText();
        Date tanggal = txt_tanggal.getDate();
        String tanggalOpname = new SimpleDateFormat("yyyy-MM-dd").format(tanggal);
        String produk = cb_idProduk.getSelectedItem().toString();
        String stokSistemText = txt_stokSistem.getText();
        String stokFisikText = txt_stokFisik.getText();
        String keterangan = txt_keterangan.getText();

        if (idStokOpname.isEmpty() || tanggalOpname.isEmpty() || produk.isEmpty() || stokSistemText.isEmpty() || stokFisikText.isEmpty() || keterangan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int stokSistem = Integer.parseInt(stokSistemText);
            int stokFisik = Integer.parseInt(stokFisikText);

            // Hitung selisih secara otomatis - selisih bisa negatif
            int selisih = stokFisik - stokSistem;

            // Cek duplikat data
            if (cekDuplikatData(idStokOpname)) {
                JOptionPane.showMessageDialog(this, "Data Stok Opname sudah ada!", "Duplikasi Data", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Mendapatkan id_produk berdasarkan nama produk yang dipilih
            String idProduk = getIdProdukByNama(produk);

            // Menyimpan data ke tabel stok_opname (header)
            String sqlHeader = "INSERT INTO stok_opname (id_opname, tanggal, id_user) VALUES (?,?,?)";
            PreparedStatement stHeader = conn.prepareStatement(sqlHeader);
            stHeader.setString(1, idStokOpname);
            stHeader.setString(2, tanggalOpname);
            stHeader.setString(3, userID);
            stHeader.executeUpdate();
            stHeader.close();

            // Menyimpan data ke tabel detail_opname (detail)
            String sqlDetail = "INSERT INTO detail_opname (stok_sistem, stok_fisik, selisih, keterangan, id_opname, id_produk) VALUES (?,?,?,?,?,?)";
            PreparedStatement stDetail = conn.prepareStatement(sqlDetail);
            stDetail.setInt(1, stokSistem);
            stDetail.setInt(2, stokFisik);
            stDetail.setInt(3, selisih);
            stDetail.setString(4, keterangan);
            stDetail.setString(5, idStokOpname);
            stDetail.setString(6, idProduk);

            int rowInserted = stDetail.executeUpdate();
            stDetail.close();

            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan nilai stok sistem dan stok fisik berupa angka yang valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getIdProdukByNama(String namaProduk) {
        String idProduk = "";
        try {
            String sql = "SELECT id_produk FROM produk WHERE nama_produk = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, namaProduk);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                idProduk = rs.getString("id_produk");
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
        }
        return idProduk;
    }
    
    private int getStokSistemByNamaProduk(String namaProduk) {
        int stok = 0;
        try {
            String sql = "SELECT stok FROM produk WHERE nama_produk = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, namaProduk);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                stok = rs.getInt("stok");
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
        }
        return stok;
    }

    private boolean cekDuplikatData(String idStokOpname) {
        boolean isDuplikat = false;
        try {
            String sql = "SELECT * FROM stok_opname WHERE id_opname = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idStokOpname);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                isDuplikat = true;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
        }
        return isDuplikat;
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel6.setText("Perbarui Data Stok Opname SiLoang");

        txt_id.setEnabled(false);
        txt_tanggal.setEnabled(false);

        txt_id.setText(tbl_data.getValueAt(row, 0).toString());

        String tanggalOpname = tbl_data.getValueAt(row, 1).toString();
        if (tanggalOpname != null && !tanggalOpname.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                java.util.Date tanggal = sdf.parse(tanggalOpname);
                txt_tanggal.setDate(tanggal);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Format tanggal tidak valid: " + tanggalOpname, "Error", JOptionPane.ERROR_MESSAGE);
                txt_tanggal.setDate(null);
            }
        } else {
            txt_tanggal.setDate(null);
        }

        cb_idProduk.setSelectedItem(tbl_data.getValueAt(row, 4).toString()); // Nama produk
        txt_stokSistem.setText(tbl_data.getValueAt(row, 5).toString());
        txt_stokFisik.setText(tbl_data.getValueAt(row, 6).toString());
        txt_keterangan.setText(tbl_data.getValueAt(row, 8).toString());
    }

    private void updateData() {
        String idOpname = txt_id.getText();
        String stokSistemText = txt_stokSistem.getText();
        String stokFisikText = txt_stokFisik.getText();
        String keterangan = txt_keterangan.getText();
        String produk = cb_idProduk.getSelectedItem().toString();

        if (idOpname.isEmpty() || stokSistemText.isEmpty() || stokFisikText.isEmpty() || keterangan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int stokSistem = Integer.parseInt(stokSistemText);
            int stokFisik = Integer.parseInt(stokFisikText);
            int selisih = stokFisik - stokSistem; // Hitung selisih otomatis

            // Mendapatkan id_produk berdasarkan nama produk yang dipilih
            String idProduk = getIdProdukByNama(produk);

            String sql = "UPDATE detail_opname SET stok_sistem = ?, stok_fisik = ?, selisih = ?, keterangan = ? WHERE id_opname = ? AND id_produk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, stokSistem);
            ps.setInt(2, stokFisik);
            ps.setInt(3, selisih);
            ps.setString(4, keterangan);
            ps.setString(5, idOpname);
            ps.setString(6, idProduk);

            int updated = ps.executeUpdate();
            ps.close();

            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui!");
                resetForm();
                loadData();
                showPanel();
            } else {
                // Jika tidak ada baris yang diupdate, mungkin kombinasi id_opname dan id_produk tidak ditemukan
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan. Tidak ada perubahan yang disimpan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan nilai stok sistem dan stok fisik berupa angka yang valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteData() {
        int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus terlebih dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            try {
                conn.setAutoCommit(false); 

                // Hapus data detail terlebih dahulu (child)
                String sqlDetail = "DELETE FROM detail_opname WHERE id_opname=?";
                try (PreparedStatement stDetail = conn.prepareStatement(sqlDetail)) {
                    stDetail.setString(1, id);
                    stDetail.executeUpdate();
                }

                // Kemudian hapus data header (parent)
                String sqlHeader = "DELETE FROM stok_opname WHERE id_opname=?";
                try (PreparedStatement stHeader = conn.prepareStatement(sqlHeader)) {
                    stHeader.setString(1, id);
                    int rowDelete = stHeader.executeUpdate();

                    if (rowDelete > 0) {
                        conn.commit(); // Commit transaksi jika berhasil
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    } else {
                        conn.rollback(); // Rollback jika tidak ada header yang dihapus
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }

                conn.setAutoCommit(true); // Kembalikan ke autocommit
            } catch (SQLException e) {
                try {
                    conn.rollback(); // Rollback jika terjadi exception
                    conn.setAutoCommit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, ex);
                }
                Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
            String sql = "SELECT s.id_opname, s.tanggal, u.nama, d.id_produk, " +
                         "p.nama_produk, d.stok_sistem, d.stok_fisik, d.selisih, d.keterangan " +
                         "FROM stok_opname s " +
                         "JOIN detail_opname d ON s.id_opname = d.id_opname " +
                         "JOIN produk p ON d.id_produk = p.id_produk " +
                         "JOIN user u ON s.id_user = u.id_user " +
                         "WHERE s.id_opname LIKE ? OR p.nama_produk LIKE ? " +
                         "ORDER BY s.tanggal DESC";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Object[] rowData = {
                        rs.getString("id_opname"),
                        rs.getString("tanggal"),
                        rs.getString("nama"),         // Ubah dari id_user menjadi nama
                        rs.getString("id_produk"),
                        rs.getString("nama_produk"),
                        rs.getInt("stok_sistem"),
                        rs.getInt("stok_fisik"),
                        rs.getInt("selisih"),
                        rs.getString("keterangan")
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturStokOpname.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void valueComboBox() {
        try {
            String sql = "SELECT nama_produk FROM produk\n" +
                         "ORDER BY produk.id_produk ASC";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Produk");
            
            while(rs.next()){
                String namaKategori = rs.getString("nama_produk");
                model.addElement(namaKategori);
            }
            
            cb_idProduk.setModel(model);
            
        } catch (Exception e) {
            
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
