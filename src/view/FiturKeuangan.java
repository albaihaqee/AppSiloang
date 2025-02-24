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
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;

public class FiturKeuangan extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturKeuangan(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setTabelModel();
        loadData();

        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        
        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/keuangan.svg").derive(15, 15);
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
        jLabel1.setText("Laporan > Keuangan");

        lb_keuangan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_keuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Laporan Keuangan SiLoang");

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

        getDataPenjualan(model);
        getDataPembelian(model);
        calculateLabaBersih(model);

        tbl_data.repaint();
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("Tahun");
        model.addColumn("Bulan");
        model.addColumn("Total Penjualan");
        model.addColumn("Total Pembelian");
        model.addColumn("Laba Bersih");
    }

    private void getDataPenjualan(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sqlPenjualan = "SELECT YEAR(tanggal_transaksi) AS Tahun, MONTH(tanggal_transaksi) AS Bulan, SUM(total_harga) AS TotalPenjualan "
                    + "FROM penjualan "
                    + "GROUP BY YEAR(tanggal_transaksi), MONTH(tanggal_transaksi) "
                    + "ORDER BY Tahun, Bulan";

            try (PreparedStatement stPenjualan = conn.prepareStatement(sqlPenjualan)) {
                ResultSet rsPenjualan = stPenjualan.executeQuery();

                while (rsPenjualan.next()) {
                    int tahun = rsPenjualan.getInt("Tahun");
                    int bulan = rsPenjualan.getInt("Bulan");
                    String namaBulan = getNamaBulan(bulan);
                    int totalPenjualan = rsPenjualan.getInt("TotalPenjualan");
                    String totalPenjualanRp = formatRupiah(totalPenjualan);

                    boolean dataDitemukan = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if (model.getValueAt(i, 0).equals(tahun)
                                && model.getValueAt(i, 1).equals(namaBulan)) {
                            model.setValueAt(totalPenjualanRp, i, 2); // Update Total Penjualan
                            dataDitemukan = true;
                            break;
                        }
                    }
                    if (!dataDitemukan) {
                        Object[] rowData = {tahun, namaBulan, totalPenjualanRp, "Rp. 0", "Rp. 0"};
                        model.addRow(rowData);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPembelian(DefaultTableModel model) {
        try {
            String sqlPembelian = "SELECT YEAR(tanggal_transaksi) AS Tahun, MONTH(tanggal_transaksi) AS Bulan, SUM(total_harga) AS TotalPembelian "
                    + "FROM pembelian "
                    + "GROUP BY YEAR(tanggal_transaksi), MONTH(tanggal_transaksi) "
                    + "ORDER BY Tahun, Bulan";

            try (PreparedStatement stPembelian = conn.prepareStatement(sqlPembelian)) {
                ResultSet rsPembelian = stPembelian.executeQuery();

                while (rsPembelian.next()) {
                    int tahun = rsPembelian.getInt("Tahun");
                    int bulan = rsPembelian.getInt("Bulan");
                    String namaBulan = getNamaBulan(bulan);
                    int totalPembelian = rsPembelian.getInt("TotalPembelian");
                    String totalPembelianRp = formatRupiah(totalPembelian);

                    boolean dataDitemukan = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if (model.getValueAt(i, 0).equals(tahun)
                                && model.getValueAt(i, 1).equals(namaBulan)) {
                            model.setValueAt(totalPembelianRp, i, 3); // Update Total Pembelian
                            dataDitemukan = true;
                            break;
                        }
                    }
                    if (!dataDitemukan) {
                        Object[] rowData = {tahun, namaBulan, "Rp. 0", totalPembelianRp, "Rp. 0"};
                        model.addRow(rowData);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String getNamaBulan(int bulan) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return namaBulan[bulan - 1];
    }

    private String formatRupiah(int amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(amount).replace("Rp", "Rp.").replace(",00", "");
    }

    private int parseRupiah(String rupiah) {
        try {

            if (rupiah == null || rupiah.equals("Rp. 0")) {
                return 0;
            }
            String cleanString = rupiah
                    .replace("Rp.", "")
                    .replace("Rp", "")
                    .replace(".", "")
                    .replace(",", "")
                    .replace(" ", "")
                    .trim();

            if (cleanString.isEmpty()) {
                return 0;
            }

            int result = Integer.parseInt(cleanString);
            return result;

        } catch (NumberFormatException e) {
            System.out.println("Error parsing rupiah: " + rupiah);
            System.out.println("Error detail: " + e.getMessage());
            return 0;
        }
    }

    private void calculateLabaBersih(DefaultTableModel model) {
        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                String totalPenjualanStr = (String) model.getValueAt(i, 2);
                String totalPembelianStr = (String) model.getValueAt(i, 3);

                int totalPenjualan = parseRupiah(totalPenjualanStr);
                int totalPembelian = parseRupiah(totalPembelianStr);

                int labaBersih = totalPenjualan - totalPembelian;

                String formattedLabaBersih = formatRupiah(labaBersih);
                model.setValueAt(formattedLabaBersih, i, 4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchData(DefaultTableModel model) {
        String kataKunci = txt_search.getText().trim().toLowerCase();
        model.setRowCount(0);

        if (kataKunci.isEmpty()) {
            return;
        }

        int bulan = -1;
        String[] namaBulan = {
            "januari", "februari", "maret", "april", "mei", "juni",
            "juli", "agustus", "september", "oktober", "november", "desember"
        };

        boolean bulanDitemukan = false;
        for (int i = 0; i < namaBulan.length; i++) {
            if (namaBulan[i].startsWith(kataKunci)) {
                bulan = i + 1;
                bulanDitemukan = true;
                break;
            }
        }

        if (!bulanDitemukan) {
            try {
                bulan = Integer.parseInt(kataKunci);
                if (bulan < 1 || bulan > 12) {
                    Logger.getLogger(FiturKeuangan.class.getName()).log(Level.WARNING, "Input tidak valid: " + kataKunci);
                    return;
                }
            } catch (NumberFormatException e) {
                Logger.getLogger(FiturKeuangan.class.getName()).log(Level.WARNING, "Input tidak valid: " + kataKunci);
                return;
            }
        }

        try {
            String sql = "SELECT "
                    + "  MONTH(penjualan.tanggal_transaksi) AS Bulan, "
                    + "  COALESCE(SUM(penjualan.total_harga), 0) AS TotalPenjualan, "
                    + "  COALESCE(SUM(pembelian.total_harga), 0) AS TotalPembelian, "
                    + "  (COALESCE(SUM(penjualan.total_harga), 0) - COALESCE(SUM(pembelian.total_harga), 0)) AS LabaBersih "
                    + "FROM penjualan "
                    + "LEFT JOIN pembelian ON MONTH(penjualan.tanggal_transaksi) = MONTH(pembelian.tanggal_transaksi) "
                    + "WHERE MONTH(penjualan.tanggal_transaksi) = ? "
                    + "GROUP BY MONTH(penjualan.tanggal_transaksi) "
                    + "ORDER BY Bulan";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, bulan);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    int bulanResult = rs.getInt("Bulan");
                    String namaBulanResult = getNamaBulan(bulanResult);
                    int totalPenjualan = rs.getInt("TotalPenjualan");
                    int totalPembelian = rs.getInt("TotalPembelian");
                    int labaBersih = rs.getInt("LabaBersih");

                    Object[] rowData = {namaBulanResult, totalPenjualan, totalPembelian, labaBersih};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
