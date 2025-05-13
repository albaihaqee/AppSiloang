package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class FiturKartuStok extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturKartuStok(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setupCustomTableStyle();
        setTabelModel();
        loadData();

        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        
        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/cardstock.svg").derive(15, 15);
        dashboardIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_keuangan.setIcon(dashboardIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rb_jenisKelamin = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_keuangan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Laporan > Kartu Stok");

        lb_keuangan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_keuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Laporan Kartu Stok SiLoang");

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lb_keuangan)
                            .addGap(7, 7, 7)
                            .addComponent(jLabel1))
                        .addComponent(txt_search)))
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
                        .addComponent(lb_keuangan)))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked

    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData((DefaultTableModel) tbl_data.getModel());
    }//GEN-LAST:event_txt_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_keuangan;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rb_jenisKelamin;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModel();
        }
        try {
            String sql = "SELECT ks.id_kartu, DATE_FORMAT(ks.tanggal, '%Y-%m-%d') AS tanggal, " +
                    "ks.id_produk, p.nama_produk, p.satuan, ks.stok_masuk, ks.stok_keluar, " +
                    "(SELECT SUM(k.stok_masuk) - SUM(k.stok_keluar) " +
                    " FROM kartu_stok k " +
                    " WHERE k.id_produk = ks.id_produk AND k.tanggal <= ks.tanggal) AS stok_akhir, " +
                    "ks.keterangan, u.nama AS petugas " +
                    "FROM kartu_stok ks " +
                    "JOIN produk p ON ks.id_produk = p.id_produk " +
                    "JOIN user u ON ks.id_user = u.id_user " +
                    "ORDER BY ks.id_kartu ASC";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Object[] rowData = {
                        rs.getString("tanggal"),
                        rs.getString("id_produk"),
                        rs.getString("nama_produk"),
                        rs.getString("satuan"),
                        rs.getInt("stok_masuk"),
                        rs.getInt("stok_keluar"),
                        rs.getInt("stok_akhir"),
                        rs.getString("keterangan"),
                        rs.getString("petugas")
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error loading stock card data: " + e.getMessage());
        }
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
        model.addColumn("Tanggal");
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Satuan");
        model.addColumn("Stok Masuk");
        model.addColumn("Stok Keluar");
        model.addColumn("Stok Akhir");
        model.addColumn("Keterangan");
        model.addColumn("Petugas");
    }

    private void searchData(DefaultTableModel par) {
        String kataKunci = txt_search.getText().trim().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);

        if (kataKunci.isEmpty()) {
            loadData();
            return;
        }

        try {
            StringBuilder sqlBuilder = new StringBuilder();
            sqlBuilder.append("SELECT ks.id_kartu, DATE_FORMAT(ks.tanggal, '%Y-%m-%d') AS tanggal, ");
            sqlBuilder.append("ks.id_produk, p.nama_produk, p.satuan, ks.stok_masuk, ks.stok_keluar, ");
            sqlBuilder.append("(SELECT SUM(k.stok_masuk) - SUM(k.stok_keluar) ");
            sqlBuilder.append(" FROM kartu_stok k ");
            sqlBuilder.append(" WHERE k.id_produk = ks.id_produk AND k.tanggal <= ks.tanggal) AS stok_akhir, ");
            sqlBuilder.append("ks.keterangan, u.nama AS petugas ");
            sqlBuilder.append("FROM kartu_stok ks ");
            sqlBuilder.append("JOIN produk p ON ks.id_produk = p.id_produk ");
            sqlBuilder.append("JOIN user u ON ks.id_user = u.id_user ");
            sqlBuilder.append("WHERE LOWER(ks.id_produk) LIKE ? OR LOWER(p.nama_produk) LIKE ? ");
            sqlBuilder.append("OR LOWER(ks.keterangan) LIKE ? OR LOWER(u.nama) LIKE ? ");
            sqlBuilder.append("OR DATE_FORMAT(ks.tanggal, '%M %Y') LIKE ? OR DATE_FORMAT(ks.tanggal, '%d-%m-%Y') LIKE ? ");
            sqlBuilder.append("ORDER BY ks.id_kartu ASC");

            try (PreparedStatement st = conn.prepareStatement(sqlBuilder.toString())) {
                String searchPattern = "%" + kataKunci + "%";
                for (int i = 1; i <= 6; i++) {
                    st.setString(i, searchPattern);
                }

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Object[] rowData = {
                        rs.getString("tanggal"),
                        rs.getString("id_produk"),
                        rs.getString("nama_produk"),
                        rs.getString("satuan"),
                        rs.getInt("stok_masuk"),
                        rs.getInt("stok_keluar"),
                        rs.getInt("stok_akhir"),
                        rs.getString("keterangan"),
                        rs.getString("petugas")
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error searching stock card data: " + e.getMessage());
        }
    }

}
