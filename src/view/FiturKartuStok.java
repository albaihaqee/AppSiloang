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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FiturKartuStok extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturKartuStok(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setPlaceholderComboBox();
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
        cb_filter = new javax.swing.JComboBox<>();
        btn_excel = new javax.swing.JButton();

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

        txt_search.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        cb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Filter", "Penjualan", "Pembelian", "Stok Opname" }));
        cb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_filterActionPerformed(evt);
            }
        });

        btn_excel.setBackground(new java.awt.Color(51, 204, 0));
        btn_excel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_excel.setForeground(new java.awt.Color(255, 255, 255));
        btn_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_excel.setText("EXCEL");
        btn_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excelActionPerformed(evt);
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
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btn_excel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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

    private void cb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_filterActionPerformed
         String filter = cb_filter.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        switch (filter) {
            case "Penjualan":
                loadDataPenjualan();
                break;
            case "Pembelian":
                loadDataPembelian();
                break;
            case "Stok Opname":
                loadDataStokOpname();
                break;
            default:
                loadData();
                break;
        }
    }//GEN-LAST:event_cb_filterActionPerformed

    private void btn_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excelActionPerformed
        exportToExcel();
    }//GEN-LAST:event_btn_excelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excel;
    private javax.swing.JComboBox<String> cb_filter;
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

    private void loadDataPenjualan() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModel();
        }

        String sql = "SELECT ks.tanggal, ks.id_produk, p.nama_produk, p.satuan, ks.stok_masuk, ks.stok_keluar, " +
                     "(SELECT SUM(k.stok_masuk) - SUM(k.stok_keluar) " +
                     " FROM kartu_stok k WHERE k.id_produk = ks.id_produk AND k.tanggal <= ks.tanggal) AS stok_akhir, " +
                     "ks.keterangan, u.nama AS petugas " +
                     "FROM kartu_stok ks " +
                     "JOIN produk p ON ks.id_produk = p.id_produk " +
                     "JOIN user u ON ks.id_user = u.id_user " +
                     "WHERE ks.keterangan LIKE 'Penjualan%' " +
                     "ORDER BY ks.tanggal ASC";

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
        } catch (SQLException e) {
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error loading Penjualan data: " + e.getMessage());
        }
    }

        private void loadDataPembelian() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModel();
        }

        String sql = "SELECT ks.tanggal, ks.id_produk, p.nama_produk, p.satuan, ks.stok_masuk, ks.stok_keluar, " +
                     "(SELECT SUM(k.stok_masuk) - SUM(k.stok_keluar) " +
                     " FROM kartu_stok k WHERE k.id_produk = ks.id_produk AND k.tanggal <= ks.tanggal) AS stok_akhir, " +
                     "ks.keterangan, u.nama AS petugas " +
                     "FROM kartu_stok ks " +
                     "JOIN produk p ON ks.id_produk = p.id_produk " +
                     "JOIN user u ON ks.id_user = u.id_user " +
                     "WHERE ks.keterangan LIKE 'Pembelian%' " +
                     "ORDER BY ks.tanggal ASC";

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
        } catch (SQLException e) {
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error loading Pembelian data: " + e.getMessage());
        }
    }

        private void loadDataStokOpname() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModel();
        }

        String sql = "SELECT ks.tanggal, ks.id_produk, p.nama_produk, p.satuan, ks.stok_masuk, ks.stok_keluar, " +
                     "(SELECT SUM(k.stok_masuk) - SUM(k.stok_keluar) " +
                     " FROM kartu_stok k WHERE k.id_produk = ks.id_produk AND k.tanggal <= ks.tanggal) AS stok_akhir, " +
                     "ks.keterangan, u.nama AS petugas " +
                     "FROM kartu_stok ks " +
                     "JOIN produk p ON ks.id_produk = p.id_produk " +
                     "JOIN user u ON ks.id_user = u.id_user " +
                     "WHERE ks.keterangan LIKE 'Stok Opname%' " +
                     "ORDER BY ks.tanggal ASC";

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
        } catch (SQLException e) {
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error loading Stok Opname data: " + e.getMessage());
        }
    }
    
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
    
    private void setPlaceholderComboBox() {
        if(cb_filter.getSelectedItem().equals("Pilih Filter")){
            cb_filter.setForeground(new Color(153,153,153));
        }
        
        cb_filter.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    if(cb_filter.getSelectedItem().equals("Pilih Filter")){
                        cb_filter.setForeground(new Color(153,153,153));
                    }else{
                        cb_filter.setForeground(new Color(0,0,0));
                    }
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
        model.setColumnCount(0);
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
    
    private void exportToExcel() {
        try {
            if (tbl_data.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Tidak ada data untuk diekspor!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Simpan Laporan Kartu Stok");

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", new Locale("id", "ID")).format(new java.util.Date());
            String defaultFileName = "Laporan_Kartu_Stok_" + timestamp + ".xlsx";
            fileChooser.setSelectedFile(new java.io.File(defaultFileName));

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".xlsx")) {
                    filePath += ".xlsx";
                }

                createExcelKartuStok(filePath);

                JOptionPane.showMessageDialog(this,
                        "Laporan berhasil diekspor ke:\n" + filePath,
                        "Export Berhasil",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Terjadi kesalahan saat mengekspor: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FiturKartuStok.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void createExcelKartuStok(String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Kartu Stok");

        CellStyle headerStyle = workbook.createCellStyle();
        org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setColor(IndexedColors.WHITE.getIndex());
        headerStyle.setFont(headerFont);
        headerStyle.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(headerStyle);

        CellStyle dataStyle = workbook.createCellStyle();
        dataStyle.setAlignment(HorizontalAlignment.LEFT);
        dataStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(dataStyle);

        CellStyle centerStyle = workbook.createCellStyle();
        centerStyle.setAlignment(HorizontalAlignment.CENTER);
        centerStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(centerStyle);

        CellStyle numberStyle = workbook.createCellStyle();
        numberStyle.setAlignment(HorizontalAlignment.RIGHT);
        numberStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(numberStyle);

        int rowNum = 0;

        org.apache.poi.ss.usermodel.Row titleRow = sheet.createRow(rowNum++);
        Cell titleCell = titleRow.createCell(0);
        titleCell.setCellValue("LAPORAN KARTU STOK - SILOANG");
        CellStyle titleStyle = workbook.createCellStyle();
        org.apache.poi.ss.usermodel.Font titleFont = workbook.createFont();
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) 16);
        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleCell.setCellStyle(titleStyle);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, tbl_data.getColumnCount() - 1));

        rowNum++;
        org.apache.poi.ss.usermodel.Row dateRow = sheet.createRow(rowNum++);
        Cell dateCell = dateRow.createCell(0);
        dateCell.setCellValue("Tanggal Cetak: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", new Locale("id", "ID"))));

        rowNum++;
        org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(rowNum++);
        for (int i = 0; i < tbl_data.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(tbl_data.getColumnName(i));
            cell.setCellStyle(headerStyle);
        }

        for (int i = 0; i < tbl_data.getRowCount(); i++) {
            org.apache.poi.ss.usermodel.Row row = sheet.createRow(rowNum++);
            for (int j = 0; j < tbl_data.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                Object value = tbl_data.getValueAt(i, j);
                if (value instanceof Number) {
                    cell.setCellValue(((Number) value).doubleValue());
                    cell.setCellStyle(numberStyle);
                } else {
                    cell.setCellValue(value != null ? value.toString() : "");
                    cell.setCellStyle(dataStyle);
                }
            }
        }

        for (int i = 0; i < tbl_data.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
            if (sheet.getColumnWidth(i) < 3000) {
                sheet.setColumnWidth(i, 3000);
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        }

        workbook.close();
    }
    
    private void setBorderStyle(CellStyle style) {
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
    }

    private boolean isNumericColumn(int columnIndex) {
        // Disesuaikan dengan indeks kolom numerik di tabel kartu stok
        return columnIndex >= 3 && columnIndex <= 5;
    }

    private int[] getTotalColumnIndexesKartuStok() {
        return new int[]{3, 4, 5}; // Kolom Masuk, Keluar, Sisa
    }

    private int getTotalColumnCountKartuStok() {
        return getTotalColumnIndexesKartuStok().length;
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
