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
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class FiturKeuangan extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;

    public FiturKeuangan(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setupCustomTableStyle();
        setPlaceholderComboBox();
        setTabelModelBulanan();
        setButtonIcons();
        loadDataBulanan();

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
        cb_filter = new javax.swing.JComboBox<>();
        btn_excel = new javax.swing.JButton();

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

        txt_search.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        cb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Filter", "Harian", "Mingguan", "Bulanan" }));
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
                .addGap(9, 9, 9)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_search))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked

    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        String input = txt_search.getText().trim();

        if (!input.isEmpty()) {
            int bulan = getBulanDariNama(input);
            if (bulan != -1) {
                int tahun = LocalDate.now().getYear(); // atau ambil dari input kalau ada
                searchData(bulan, tahun);
            } else {
                System.out.println("Nama bulan tidak valid. Contoh: Januari, Februari, dst.");
            }
        }
    }//GEN-LAST:event_txt_searchKeyTyped

    private void cb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_filterActionPerformed
        String filter = cb_filter.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        if (filter.equals("Harian")) {
            loadDataHarian();
        } else if (filter.equals("Mingguan")) {
            loadDataMingguan();
        } else if (filter.equals("Bulanan")) {
            loadDataBulanan();
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
    
    private void loadDataHarian() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModelHarian();
        }

        try {
            String sql = "SELECT tanggal, total_penjualan, total_pembelian, laba_bersih, tanggal_update FROM view_laporan_harian ORDER BY tanggal";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Date tanggal = rs.getDate("tanggal");
                    int totalPenjualan = rs.getInt("total_penjualan");
                    int totalPembelian = rs.getInt("total_pembelian");
                    int labaBersih = rs.getInt("laba_bersih");

                    String totalPenjualanRp = formatRupiah(totalPenjualan);
                    String totalPembelianRp = formatRupiah(totalPembelian);
                    String labaBersihRp = formatRupiah(labaBersih);
                    Date tanggalUpdate = rs.getDate("tanggal_update");

                    Object[] rowData = {
                        tanggal,
                        totalPenjualanRp,
                        totalPembelianRp,
                        labaBersihRp,
                        tanggalUpdate
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setTabelModelHarian() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("Tanggal");
        model.addColumn("Total Penjualan");
        model.addColumn("Total Pembelian");
        model.addColumn("Laba Bersih");
        model.addColumn("Tanggal Update");
    }
    
    private void loadDataMingguan() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModelMingguan();
        }

        try {
            String sql = "SELECT tahun, minggu_ke, periode, total_penjualan, total_pembelian, laba_bersih, tanggal_update FROM view_laporan_mingguan ORDER BY tahun, minggu_ke";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    int tahun = rs.getInt("tahun");
                    int mingguKe = rs.getInt("minggu_ke");
                    String periode = rs.getString("periode");
                    int totalPenjualan = rs.getInt("total_penjualan");
                    int totalPembelian = rs.getInt("total_pembelian");
                    int labaBersih = rs.getInt("laba_bersih");

                    String totalPenjualanRp = formatRupiah(totalPenjualan);
                    String totalPembelianRp = formatRupiah(totalPembelian);
                    String labaBersihRp = formatRupiah(labaBersih);
                    Date tanggalUpdate = rs.getDate("tanggal_update");

                    Object[] rowData = {
                        tahun,
                        mingguKe,
                        periode,
                        totalPenjualanRp,
                        totalPembelianRp,
                        labaBersihRp,
                        tanggalUpdate
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setTabelModelMingguan() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("Tahun");
        model.addColumn("Minggu Ke");
        model.addColumn("Periode");
        model.addColumn("Total Penjualan");
        model.addColumn("Total Pembelian");
        model.addColumn("Laba Bersih");
        model.addColumn("Tanggal Update");
    }
    
    private void loadDataBulanan() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        if (model.getColumnCount() == 0) {
            setTabelModelBulanan();
        }

        try {
            String sql = "SELECT tahun, bulan, total_penjualan, total_pembelian, laba_bersih, tanggal_update "
                       + "FROM view_laporan_keuangan ORDER BY tahun, bulan";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    int tahun = rs.getInt("tahun");
                    int bulan = rs.getInt("bulan");
                    String namaBulan = getNamaBulan(bulan);

                    int totalPenjualan = rs.getInt("total_penjualan");
                    int totalPembelian = rs.getInt("total_pembelian");
                    int labaBersih = rs.getInt("laba_bersih");

                    String totalPenjualanRp = formatRupiah(totalPenjualan);
                    String totalPembelianRp = formatRupiah(totalPembelian);
                    String labaBersihRp = formatRupiah(labaBersih);

                    Date tanggalUpdate = rs.getDate("tanggal_update");

                    Object[] rowData = {
                        tahun,
                        namaBulan,
                        totalPenjualanRp,
                        totalPembelianRp,
                        labaBersihRp,
                        tanggalUpdate
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelBulanan() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("Tahun");
        model.addColumn("Bulan");
        model.addColumn("Total Penjualan");
        model.addColumn("Total Pembelian");
        model.addColumn("Laba Bersih");
        model.addColumn("Tanggal Update");
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
    
    private String getNamaBulan(int bulan) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        if (bulan >= 1 && bulan <= 12) {
            return namaBulan[bulan - 1];
        } else {
            return "Bulan Tidak Valid";
        }
    }
    
    private int getBulanDariNama(String namaBulan) {
        String[] namaBulanArray = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        for (int i = 0; i < namaBulanArray.length; i++) {
            if (namaBulanArray[i].equalsIgnoreCase(namaBulan)) {
               return i + 1;
            }
        }
        return -1;
    }
    
    private String formatRupiah(int amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String hasil = nf.format(amount);
        hasil = hasil.replace("Rp", "Rp.").replace(",00", "").replace(" ", "");

        return hasil;
    }
    
    private void exportToExcel() {
        try {
            if (tbl_data.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Tidak ada data untuk diekspor!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Simpan Laporan Excel");

            String filterType = cb_filter.getSelectedItem().toString();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", new Locale("id", "ID")).format(new java.util.Date());
            String defaultFileName = "Laporan_Keuangan_" + filterType + "_" + timestamp + ".xlsx";
            fileChooser.setSelectedFile(new java.io.File(defaultFileName));

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".xlsx")) {
                    filePath += ".xlsx";
                }

                createExcelReport(filePath, filterType);

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
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void createExcelReport(String filePath, String filterType) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Laporan Keuangan " + filterType);

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

        CellStyle currencyStyle = workbook.createCellStyle();
        currencyStyle.setAlignment(HorizontalAlignment.RIGHT);
        currencyStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(currencyStyle);

        CellStyle totalStyle = workbook.createCellStyle();
        org.apache.poi.ss.usermodel.Font totalFont = workbook.createFont();
        totalFont.setBold(true);
        totalStyle.setFont(totalFont);
        totalStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        totalStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        totalStyle.setAlignment(HorizontalAlignment.RIGHT);
        totalStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        setBorderStyle(totalStyle);

        int rowNum = 0;

        org.apache.poi.ss.usermodel.Row titleRow = sheet.createRow(rowNum++);
        Cell titleCell = titleRow.createCell(0);
        titleCell.setCellValue("LAPORAN KEUANGAN " + filterType.toUpperCase() + " - SILOANG");
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
        dateCell.setCellValue("Tanggal Cetak: " +
            LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss")));

        rowNum++;

        org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(rowNum++);
        for (int i = 0; i < tbl_data.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(tbl_data.getColumnName(i));
            cell.setCellStyle(headerStyle);
        }

        long[] totals = new long[getTotalColumnCount(filterType)];
        int[] totalColumnIndexes = getTotalColumnIndexes(filterType);

        for (int i = 0; i < tbl_data.getRowCount(); i++) {
            org.apache.poi.ss.usermodel.Row row = sheet.createRow(rowNum++);
            for (int j = 0; j < tbl_data.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                Object value = tbl_data.getValueAt(i, j);

                if (value != null) {
                    if (isCurrencyColumn(j, filterType)) {
                        String strValue = value.toString();
                        if (strValue.startsWith("Rp.")) {
                            String numericValue = strValue.replace("Rp.", "").replace(".", "").trim();
                            try {
                                long numValue = Long.parseLong(numericValue);
                                for (int k = 0; k < totalColumnIndexes.length; k++) {
                                    if (totalColumnIndexes[k] == j) {
                                        totals[k] += numValue;
                                        break;
                                    }
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                        cell.setCellValue(value.toString());
                        cell.setCellStyle(currencyStyle);
                    } else {
                        cell.setCellValue(value.toString());
                        cell.setCellStyle(dataStyle);
                    }
                }
            }
        }

        if (totals.length > 0) {
            rowNum++;
            org.apache.poi.ss.usermodel.Row totalRow = sheet.createRow(rowNum++);

            Cell totalLabelCell = totalRow.createCell(0);
            totalLabelCell.setCellValue("TOTAL");
            totalLabelCell.setCellStyle(totalStyle);

            for (int i = 0; i < totalColumnIndexes.length; i++) {
                int colIndex = totalColumnIndexes[i];
                Cell totalCell = totalRow.createCell(colIndex);
                String totalValue = formatRupiah((int) totals[i]);
                totalCell.setCellValue(totalValue);
                totalCell.setCellStyle(totalStyle);
            }

            for (int j = 1; j < tbl_data.getColumnCount(); j++) {
                boolean isTotalColumn = false;
                for (int totalColIndex : totalColumnIndexes) {
                    if (totalColIndex == j) {
                        isTotalColumn = true;
                        break;
                    }
                }
                if (!isTotalColumn) {
                    Cell cell = totalRow.createCell(j);
                    cell.setCellValue("-");
                    cell.setCellStyle(totalStyle);
                }
            }
        }

        for (int i = 0; i < tbl_data.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
            if (sheet.getColumnWidth(i) < 3000) {
                sheet.setColumnWidth(i, 3000);
            }
            if (isCurrencyColumn(i, filterType) && sheet.getColumnWidth(i) > 5000) {
                sheet.setColumnWidth(i, 5000);
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

    private boolean isCurrencyColumn(int columnIndex, String filterType) {
        switch (filterType) {
            case "Harian":
                return columnIndex >= 1 && columnIndex <= 3;
            case "Mingguan":
                return columnIndex >= 3 && columnIndex <= 5;
            case "Bulanan":
                return columnIndex >= 2 && columnIndex <= 4;
            default:
                return false;
        }
    }

    private int getTotalColumnCount(String filterType) {
        return 3;
    }

    private int[] getTotalColumnIndexes(String filterType) {
        switch (filterType) {
            case "Harian":
                return new int[]{1, 2, 3};
            case "Mingguan":
                return new int[]{3, 4, 5};
            case "Bulanan":
                return new int[]{2, 3, 4};
            default:
                return new int[]{};
        }
    }

    private void searchData(int bulan, int tahun) {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);

        if (model.getColumnCount() == 0) {
            setTabelModelBulanan();
        }

        try {
            String sql = "SELECT tahun, bulan, total_penjualan, total_pembelian, laba_bersih, tanggal_update "
                       + "FROM view_laporan_keuangan WHERE bulan = ? AND tahun = ? ORDER BY tahun, bulan";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, bulan);
                st.setInt(2, tahun);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    int tahunResult = rs.getInt("tahun");
                    int bulanResult = rs.getInt("bulan");
                    String namaBulan = getNamaBulan(bulanResult);

                    String totalPenjualan = formatRupiah(rs.getInt("total_penjualan"));
                    String totalPembelian = formatRupiah(rs.getInt("total_pembelian"));
                    String labaBersih = formatRupiah(rs.getInt("laba_bersih"));
                    String tanggalUpdate = rs.getString("tanggal_update");

                    Object[] rowData = {
                        tahunResult,
                        namaBulan,
                        totalPenjualan,
                        totalPembelian,
                        labaBersih,
                        tanggalUpdate
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturKeuangan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setButtonIcons() {
        int iconSize = 18;  
        Color iconColor = Color.WHITE;  

        //btn_pdf.setIcon(createSVGIcon("icons/pdf.svg", iconSize, iconColor));
        btn_excel.setIcon(createSVGIcon("icons/excel.svg", iconSize, iconColor));
    }

    private FlatSVGIcon createSVGIcon(String path, int size, Color color) {
        FlatSVGIcon icon = new FlatSVGIcon(path).derive(size, size);
        icon.setColorFilter(new FlatSVGIcon.ColorFilter(c -> color));
        return icon;
    }

}
