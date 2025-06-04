package view;

import Config.Koneksi;
import aplikasidesktopsiloang.FiturReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;  
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import service.ServiceReport;

public class FiturPenjualan extends javax.swing.JPanel {
    
    private final Connection conn;
    private String userID;
    private String idPelangganTerpilih;
    private String selectedTransactionId;
    private ServiceReport servisReport = new FiturReport();
    private Timer timer;

    public FiturPenjualan(String userID) {
        initComponents();
        
        conn = Koneksi.getConnection();
        this.userID = userID;
        idPelangganTerpilih = null;
        setupCustomTableStyle();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        setNumberinField();
        actionButton();
        setupEventListener();
        setPlaceholderField();
        setButtonIcons();
        
        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/penjualan.svg").derive(15, 15);
        dashboardIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_penjualan.setIcon(dashboardIcon);
        
        FlatSVGIcon dashboardSVG = new FlatSVGIcon("icons/penjualan.svg").derive(15, 15);
        dashboardSVG.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        icon_penjualan.setIcon(dashboardSVG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_penjualan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        pn_detail = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_dataDetail = new javax.swing.JTable();
        btn_closeDetail = new javax.swing.JButton();
        lb_dataDetail = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        icon_penjualan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_idPelanggan = new javax.swing.JLabel();
        txt_tanggal = new com.toedter.calendar.JDateChooser();
        lb_tanggalPenjualan = new javax.swing.JLabel();
        txt_idPenjualan = new javax.swing.JTextField();
        lb_idPenjualan = new javax.swing.JLabel();
        txt_rfidMember = new javax.swing.JTextField();
        lb_rfid = new javax.swing.JLabel();
        txt_namaPelanggan = new javax.swing.JTextField();
        btn_setPelanggan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dataSementara = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        lb_stok = new javax.swing.JLabel();
        lb_barcode = new javax.swing.JLabel();
        txt_barcode = new javax.swing.JTextField();
        btn_setProduk = new javax.swing.JButton();
        lb_namaProduk = new javax.swing.JLabel();
        lb_harga = new javax.swing.JLabel();
        txt_intDiskon = new javax.swing.JTextField();
        lb_subtotal = new javax.swing.JLabel();
        txt_diskon = new javax.swing.JTextField();
        lb_jumlah = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_cancelSementara = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_total = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_namaProduk = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        txt_hargaJual = new javax.swing.JTextField();
        lb_diskon = new javax.swing.JLabel();
        lb_totalHarga = new javax.swing.JLabel();
        lb_subtotal3 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lb_bayar = new javax.swing.JLabel();
        lb_kembali = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Transaksi > Penjualan");

        lb_penjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Penjualan SiLoang");

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

        txt_search.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        tbl_dataDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_dataDetail.setRowHeight(30);
        jScrollPane3.setViewportView(tbl_dataDetail);

        btn_closeDetail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_closeDetail.setForeground(new java.awt.Color(17, 97, 171));
        btn_closeDetail.setText("X");
        btn_closeDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeDetailActionPerformed(evt);
            }
        });

        lb_dataDetail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dataDetail.setText("Data Detail Penjualan SiLoang");

        javax.swing.GroupLayout pn_detailLayout = new javax.swing.GroupLayout(pn_detail);
        pn_detail.setLayout(pn_detailLayout);
        pn_detailLayout.setHorizontalGroup(
            pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(pn_detailLayout.createSequentialGroup()
                .addComponent(lb_dataDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_closeDetail))
        );
        pn_detailLayout.setVerticalGroup(
            pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_detailLayout.createSequentialGroup()
                .addGroup(pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_closeDetail)
                    .addComponent(lb_dataDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
        );

        btn_print.setBackground(new java.awt.Color(255, 0, 0));
        btn_print.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btn_print.setText("PRINT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(377, 731, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_print)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lb_penjualan)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lb_penjualan)))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Transaksi > Penjualan");

        icon_penjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        icon_penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Penjualan SiLoang");

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb_idPelanggan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idPelanggan.setText("Pelanggan");

        lb_tanggalPenjualan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_tanggalPenjualan.setText("Tanggal ");

        txt_idPenjualan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_idPenjualan.setForeground(new java.awt.Color(102, 102, 102));

        lb_idPenjualan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idPenjualan.setText("ID Transaksi");

        txt_rfidMember.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_rfidMember.setForeground(new java.awt.Color(102, 102, 102));
        txt_rfidMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rfidMemberKeyReleased(evt);
            }
        });

        lb_rfid.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_rfid.setText("RFID");

        txt_namaPelanggan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_namaPelanggan.setForeground(new java.awt.Color(102, 102, 102));

        btn_setPelanggan.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_idPenjualan)
                    .addComponent(lb_idPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(lb_tanggalPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_idPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_namaPelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(btn_setPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rfid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_rfidMember, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tanggalPenjualan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_idPelanggan)
                                .addComponent(lb_rfid))
                            .addComponent(lb_idPenjualan))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_idPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_rfidMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_setPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        tbl_dataSementara.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_dataSementara.setRowHeight(30);
        tbl_dataSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataSementaraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_dataSementara);

        btn_edit.setBackground(new java.awt.Color(0, 0, 255));
        btn_edit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.setPreferredSize(new java.awt.Dimension(99, 27));

        lb_stok.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_stok.setText("Stok");

        lb_barcode.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_barcode.setText("Barcode");

        txt_barcode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_barcode.setForeground(new java.awt.Color(102, 102, 102));
        txt_barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_barcodeKeyReleased(evt);
            }
        });

        btn_setProduk.setText("...");
        btn_setProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setProdukActionPerformed(evt);
            }
        });

        lb_namaProduk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_namaProduk.setText("Nama Produk");

        lb_harga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_harga.setText("Harga");

        txt_intDiskon.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_intDiskon.setForeground(new java.awt.Color(102, 102, 102));
        txt_intDiskon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_subtotal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_subtotal.setText("Subtotal");

        txt_diskon.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_diskon.setForeground(new java.awt.Color(102, 102, 102));

        lb_jumlah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_jumlah.setText("Jumlah");

        txt_totalHarga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_totalHarga.setForeground(new java.awt.Color(102, 102, 102));

        txt_total.setEditable(false);
        txt_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_total.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total.setBorder(null);

        btn_delete.setBackground(new java.awt.Color(255, 0, 51));
        btn_delete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delete.png"))); // NOI18N
        btn_delete.setText("HAPUS");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_cancelSementara.setBackground(new java.awt.Color(255, 153, 0));
        btn_cancelSementara.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_cancelSementara.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelSementara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_cancelSementara.setText("BATAL");
        btn_cancelSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelSementaraActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lb_total.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_total.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_total)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_total)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txt_namaProduk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_namaProduk.setForeground(new java.awt.Color(102, 102, 102));

        txt_jumlah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_jumlah.setForeground(new java.awt.Color(102, 102, 102));

        txt_stok.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_stok.setForeground(new java.awt.Color(102, 102, 102));

        txt_hargaJual.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_hargaJual.setForeground(new java.awt.Color(102, 102, 102));

        lb_diskon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_diskon.setText("Diskon");

        lb_totalHarga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_totalHarga.setText("Total Harga");

        lb_subtotal3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_subtotal3.setText("%");

        txt_subtotal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_subtotal.setForeground(new java.awt.Color(102, 102, 102));

        lb_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_bayar.setText("Bayar");

        lb_kembali.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_kembali.setText("Kembali");

        txt_kembalian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_kembalian.setForeground(new java.awt.Color(102, 102, 102));

        txt_bayar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_bayar.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_barcode))
                                .addGap(10, 10, 10)
                                .addComponent(btn_setProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_namaProduk)
                                    .addComponent(txt_namaProduk))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_hargaJual)
                                    .addComponent(lb_harga))
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txt_stok))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lb_stok)))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_jumlah)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(icon_penjualan)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txt_total, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelAddLayout.createSequentialGroup()
                                                .addComponent(txt_intDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(lb_subtotal3)
                                                .addGap(10, 10, 10)
                                                .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(404, Short.MAX_VALUE))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(icon_penjualan)))
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_total)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_barcode)
                            .addComponent(lb_jumlah)
                            .addComponent(lb_namaProduk)
                            .addComponent(lb_stok)
                            .addComponent(lb_harga))
                        .addGap(4, 4, 4)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_namaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btn_setProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_subtotal)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_bayar)
                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_intDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_diskon)
                    .addComponent(lb_subtotal3)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kembali)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_totalHarga))
                .addGap(13, 13, 13))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txt_idPenjualan.setText(setIDPenjualan());
        txt_tanggal.setDate(new Date());
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        showPanel();
        panelMain.removeAll();
        panelMain.add(panelView);
        panelMain.repaint();
        panelMain.revalidate();
        
        resetForm();
        resetPembayaran();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if(btn_save.getText().equals("TAMBAH"))
            {
                btn_save.setText("SIMPAN");
            }
        else if(btn_save.getText().equals("SIMPAN"))
            {
                insertData();
                deleteDataSementara();
                resetForm();
                loadData();
                showPanel();
            }
        else if(btn_save.getText().equals("PERBARUI"))
            {
                resetForm();
                resetFormProduk();
                resetPembayaran();
                loadData();
                showPanel();
            }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped

    private void tbl_dataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataSementaraMouseClicked
        btn_delete.setVisible(true);
        btn_cancelSementara.setVisible(true);
        dataTabelSementara();
    }//GEN-LAST:event_tbl_dataSementaraMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        deleteDataSementara();
        resetFormProduk();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_cancelSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelSementaraActionPerformed
        loadDataSementara();
        resetFormProduk();
    }//GEN-LAST:event_btn_cancelSementaraActionPerformed

    private void btn_closeDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeDetailActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_closeDetailActionPerformed

    private void txt_barcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_barcodeKeyReleased
        getProduk();
    }//GEN-LAST:event_txt_barcodeKeyReleased

    private void txt_rfidMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rfidMemberKeyReleased
        String rfid = txt_rfidMember.getText().trim();
        timer.restart();
        //getRFIDMember(rfid);
    }//GEN-LAST:event_txt_rfidMemberKeyReleased

    private void btn_setProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setProdukActionPerformed
        setProduk();
    }//GEN-LAST:event_btn_setProdukActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        btn_print.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        int selectedRow = tbl_data.getSelectedRow(); 
    
        if (selectedRow != -1) {
            String idPenjualan = tbl_data.getValueAt(selectedRow, 0).toString();
            servisReport.printStruk(idPenjualan);
        }
    }//GEN-LAST:event_btn_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancelSementara;
    private javax.swing.JButton btn_closeDetail;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_setPelanggan;
    private javax.swing.JButton btn_setProduk;
    private javax.swing.JLabel icon_penjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_barcode;
    private javax.swing.JLabel lb_bayar;
    private javax.swing.JLabel lb_dataDetail;
    private javax.swing.JLabel lb_diskon;
    private javax.swing.JLabel lb_harga;
    private javax.swing.JLabel lb_idPelanggan;
    private javax.swing.JLabel lb_idPenjualan;
    private javax.swing.JLabel lb_jumlah;
    private javax.swing.JLabel lb_kembali;
    private javax.swing.JLabel lb_namaProduk;
    private javax.swing.JLabel lb_penjualan;
    private javax.swing.JLabel lb_rfid;
    private javax.swing.JLabel lb_stok;
    private javax.swing.JLabel lb_subtotal;
    private javax.swing.JLabel lb_subtotal3;
    private javax.swing.JLabel lb_tanggalPenjualan;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_totalHarga;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pn_detail;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTable tbl_dataDetail;
    private javax.swing.JTable tbl_dataSementara;
    private javax.swing.JTextField txt_barcode;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_diskon;
    private javax.swing.JTextField txt_hargaJual;
    private javax.swing.JTextField txt_idPenjualan;
    private javax.swing.JTextField txt_intDiskon;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_namaPelanggan;
    private javax.swing.JTextField txt_namaProduk;
    private javax.swing.JTextField txt_rfidMember;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField txt_subtotal;
    private com.toedter.calendar.JDateChooser txt_tanggal;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totalHarga;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        btn_print.setVisible(false);
        pn_detail.setVisible(false);
    }
    
    private void loadDataSementara() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataSementara.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT s.id_produk, p.barcode, s.nama_produk, s.harga, p.stok, s.satuan, s.jumlah_beli, s.subtotal, s.metode_bayar " +
                         "FROM pn_sementara s " +
                         "JOIN produk p ON p.id_produk = s.id_produk";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("id_produk"),
                    rs.getString("barcode"),
                    rs.getString("nama_produk"),
                    rs.getInt("harga"),
                    rs.getInt("stok"), 
                    rs.getString("satuan"),
                    rs.getInt("jumlah_beli"),
                    rs.getInt("subtotal")
                };
                model.addRow(rowData);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturPenjualan(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txt_idPenjualan.setText("");
        txt_tanggal.setDate(null);
        txt_namaPelanggan.setText("");
        txt_rfidMember.setText("");
    }
    
    private void resetFormProduk() {
        txt_barcode.setText("");
        txt_namaProduk.setText("");
        txt_hargaJual.setText("");
        txt_stok.setText("");
        txt_jumlah.setText("");
    }
    
    private void resetPembayaran() {
        txt_subtotal.setText("");
        txt_intDiskon.setText("");
        txt_diskon.setText("");
        txt_totalHarga.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_total.setText("0");
    }
    
    private void actionButton() {
        btn_setPelanggan.addActionListener(e -> setPelanggan());
        btn_setProduk.addActionListener(e -> setProduk());

        tbl_data.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_detail.setVisible(true);
                int row = tbl_data.getSelectedRow();
                String id = tbl_data.getValueAt(row, 0).toString();
                getDataDetail((DefaultTableModel) tbl_dataDetail.getModel(), id);
            }
        });

        tbl_dataSementara.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                btn_delete.setVisible(true);
            }
        });

        tbl_dataSementara.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dataTabelSementara();
            }
        });

        timer = new Timer(300, e -> {
            String rfid = txt_rfidMember.getText().trim().replaceAll("[^\\d]", "");
            if (!rfid.isEmpty() && rfid.length() >= 10) {
                getRFIDMember(rfid);
                txt_rfidMember.setText("");
            }
        });
        timer.setRepeats(false);

        txt_rfidMember.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                timer.restart();
            }
        });

        for (KeyListener kl : txt_barcode.getKeyListeners()) {
            txt_barcode.removeKeyListener(kl);
        }

        txt_barcode.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    getProduk();
                    evt.consume();
                }
            }
        });

        txt_jumlah.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (cekStokProdukYangDipilih()) {
                        updateJumlah();
                    }
                }
            }
        });

        txt_bayar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                formatBayarRupiah();
                hitungKembalian();
            }
        });
    }
    
    private void setupEventListener() {
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tbl_data.getSelectedRow();
                if (row >= 0) {
                    String idPenjualan = tbl_data.getValueAt(row, 0).toString();
                    selectedTransactionId = idPenjualan;
                    DefaultTableModel detailModel = (DefaultTableModel) tbl_dataDetail.getModel();
                    getDataDetail(detailModel, idPenjualan);
                }
            }
        });
        
        txt_intDiskon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hitungDiskon();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hitungDiskon();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hitungDiskon();
            }
        });
        
        txt_bayar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hitungKembalian();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hitungKembalian();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hitungKembalian();
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
            UIManager.put("Table.selectionForeground", Color.BLACK);
            UIManager.put("Table.alternateRowColor", new Color(240, 240, 240));

            // Untuk tbl_data
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
                            comp.setForeground(Color.BLACK); 
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

            // Untuk tbl_dataDetail
            if (tbl_dataDetail != null) {
                tbl_dataDetail.getTableHeader().setBackground(headerColor);
                tbl_dataDetail.getTableHeader().setForeground(Color.WHITE);
                tbl_dataDetail.setFocusable(false);
                tbl_dataDetail.setRowSelectionAllowed(true);
                tbl_dataDetail.setColumnSelectionAllowed(false);
                tbl_dataDetail.setRowHeight(30);
                tbl_dataDetail.setShowGrid(false);
                tbl_dataDetail.setShowHorizontalLines(false);
                tbl_dataDetail.setShowVerticalLines(false);
                tbl_dataDetail.setIntercellSpacing(new Dimension(0, 0));
                tbl_dataDetail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, 
                            boolean isSelected, boolean hasFocus, int row, int column) {
                        Component comp = super.getTableCellRendererComponent(table, value, 
                                isSelected, false, row, column);
                        if (isSelected) {
                            comp.setBackground(selectionColor);
                            comp.setForeground(Color.BLACK); 
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
                tbl_dataDetail.repaint();
            }

            // Untuk tbl_dataSementara
            if (tbl_dataSementara != null) {
                tbl_dataSementara.getTableHeader().setBackground(headerColor);
                tbl_dataSementara.getTableHeader().setForeground(Color.WHITE);
                tbl_dataSementara.setFocusable(false);
                tbl_dataSementara.setRowSelectionAllowed(true);
                tbl_dataSementara.setColumnSelectionAllowed(false);
                tbl_dataSementara.setRowHeight(30);
                tbl_dataSementara.setShowGrid(false);
                tbl_dataSementara.setShowHorizontalLines(false);
                tbl_dataSementara.setShowVerticalLines(false);
                tbl_dataSementara.setIntercellSpacing(new Dimension(0, 0));
                tbl_dataSementara.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, 
                            boolean isSelected, boolean hasFocus, int row, int column) {
                        Component comp = super.getTableCellRendererComponent(table, value, 
                                isSelected, false, row, column);
                        if (isSelected) {
                            comp.setBackground(selectionColor);
                            comp.setForeground(Color.BLACK); 
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
                tbl_dataSementara.repaint();
            }

        } catch (Exception e) {
            System.err.println("Error saat mengatur custom style tabel: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void setPlaceholderField() {
        txt_rfidMember.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Scan RFID disini");
        txt_barcode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Scan barcode disini");
        txt_namaPelanggan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Pelanggan");
        txt_namaProduk.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Produk");
        txt_hargaJual.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga");
        txt_stok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Stok");
        txt_jumlah.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jumlah");
        txt_intDiskon.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "0");
        txt_subtotal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_diskon.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_totalHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_bayar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Bayar");
        txt_kembalian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kembali");
        txt_total.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
    }
        
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        model.addColumn("ID Penjualan");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Total Beli");
        model.addColumn("Total Harga");
        model.addColumn("Bayar");
        model.addColumn("Diskon");
        model.addColumn("Kembali");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Nama Kasir");
    }
    
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        String sql = "SELECT p.id_penjualan, p.tanggal_transaksi, "
                   + "COALESCE(SUM(dp.jumlah), 0) AS total_beli, "
                   + "p.total_harga, p.bayar, p.diskon, p.kembali, "
                   + "c.nama_pelanggan, u.nama AS nama_kasir "
                   + "FROM penjualan p "
                   + "JOIN pelanggan c ON c.id_pelanggan = p.id_pelanggan "
                   + "JOIN user u ON u.id_user = p.id_user "
                   + "JOIN detail_penjualan dp ON dp.id_penjualan = p.id_penjualan "
                   + "GROUP BY p.id_penjualan, p.tanggal_transaksi, p.total_harga, "
                   + "p.bayar, p.diskon, p.kembali, c.nama_pelanggan, u.nama "
                   + "ORDER BY p.id_penjualan";

        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_penjualan"),
                    rs.getDate("tanggal_transaksi"),
                    rs.getInt("total_beli"), // Sekarang menampilkan total kuantitas
                    "Rp." + formatRupiah(rs.getInt("total_harga")),
                    "Rp." + formatRupiah(rs.getInt("bayar")),
                    "Rp." + formatRupiah(rs.getInt("diskon")),
                    "Rp." + formatRupiah(rs.getInt("kembali")),
                    rs.getString("nama_pelanggan"),
                    rs.getString("nama_kasir")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiturPenjualan.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataDetail.getModel();
        model.setRowCount(0);
        model.addColumn("ID Penjualan");
        model.addColumn("ID Produk");
        model.addColumn("Barcode");
        model.addColumn("Nama Produk");
        model.addColumn("Kategori");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Subtotal");
        model.addColumn("Metode Pembayaran");
    }
    
    private void getDataDetail(DefaultTableModel model, String idPenjualan) {
        model.setRowCount(0);
        String sql = "SELECT d.id_penjualan, pr.id_produk, pr.barcode, "
                    + "pr.nama_produk, k.nama_kategori, "
                    + "pr.harga_jual AS harga, d.jumlah, d.subtotal, d.metode_bayar "
                    + "FROM detail_penjualan d "
                    + "JOIN produk pr ON pr.id_produk = d.id_produk "
                    + "JOIN kategori k ON k.id_kategori = pr.id_kategori "
                    + "WHERE d.id_penjualan = ? "
                    + "ORDER BY pr.id_produk";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idPenjualan);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("id_penjualan"),
                        rs.getString("id_produk"),
                        rs.getString("barcode"),
                        rs.getString("nama_produk"),
                        rs.getString("nama_kategori"),
                        "Rp." + formatRupiah(rs.getInt("harga")),
                        rs.getInt("jumlah"),
                        "Rp." + formatRupiah(rs.getInt("subtotal")),
                        rs.getString("metode_bayar") // Kolom ini akan menampilkan "Point" atau "Cash"
                    });
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiturPenjualan.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataSementara.getModel();
        model.setRowCount(0);
        model.addColumn("ID Produk");
        model.addColumn("Barcode");
        model.addColumn("Nama Produk");
        model.addColumn("Harga");
        model.addColumn("Stok");
        model.addColumn("Satuan");
        model.addColumn("Jumlah");
        model.addColumn("Subtotal");
    }
    
    private void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT s.id_produk, p.barcode, s.nama_produk, s.harga, p.stok, s.satuan, s.jumlah_beli, s.subtotal " +
                         "FROM pn_sementara s " +
                         "JOIN produk p ON p.id_produk = s.id_produk";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("id_produk"),
                    rs.getString("barcode"),
                    rs.getString("nama_produk"),
                    "Rp." + formatRupiah(rs.getInt("total_harga")),
                    rs.getInt("stok"),
                    rs.getString("satuan"),
                    rs.getInt("jumlah_beli"),
                    "Rp." + formatRupiah(rs.getInt("subtotal"))
                };
                model.addRow(rowData);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIDPenjualan(){
        String urutan = null;
        
        try {
            String sql = "SELECT RIGHT(id_penjualan, 3) AS LastNumber " +
                         "FROM penjualan " +
                         "WHERE id_penjualan LIKE 'PN%' " +
                         "ORDER BY id_penjualan DESC " +
                         "LIMIT 1";
            
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("PN%03d", nextNumber);
            } else {
                urutan = "PN001";
            }
        
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
            urutan = "PN001";
        } 
        return urutan;
    }
    
    private void setNumberinField() {
        KeyAdapter angkaSaja = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume(); // Abaikan karakter non-angka
                }
            }
        };
        txt_subtotal.addKeyListener(angkaSaja);
        txt_intDiskon.addKeyListener(angkaSaja);
        txt_diskon.addKeyListener(angkaSaja);
        txt_totalHarga.addKeyListener(angkaSaja);
        txt_bayar.addKeyListener(angkaSaja);
        txt_kembalian.addKeyListener(angkaSaja);
    }
    
    private void setPelanggan() {
        boolean closable = true;
        DataPelanggan pelanggan = new DataPelanggan(null, closable);
        pelanggan.setVisible(true);

        String namaPelanggan = pelanggan.getNamaPelanggan();
        String idPelanggan = pelanggan.getIdPelanggan();

        if (namaPelanggan != null && !namaPelanggan.isEmpty()) {
            txt_namaPelanggan.setText(namaPelanggan);
        }

        if (idPelanggan != null && !idPelanggan.isEmpty()) {
            idPelangganTerpilih = idPelanggan;
        } else {
            idPelangganTerpilih = null;
        }
    }
    
    private void setPelangganFromRFID(String idPelanggan, String namaPelanggan) {
        if (namaPelanggan != null && !namaPelanggan.isEmpty()) {
            txt_namaPelanggan.setText(namaPelanggan);
        }

        if (idPelanggan != null && !idPelanggan.isEmpty()) {
            idPelangganTerpilih = idPelanggan;
        } else {
            idPelangganTerpilih = null;
        }
    }
     private void setEnableField() {
         txt_barcode.setEnabled(false);
         btn_setProduk.setEnabled(false);
         txt_namaProduk.setEnabled(false);
         txt_hargaJual.setEnabled(false);
         txt_stok.setEnabled(false);
         txt_jumlah.setEnabled(false);
         txt_subtotal.setEnabled(false);
         txt_intDiskon.setEnabled(false);
         txt_diskon.setEnabled(false);
         txt_totalHarga.setEnabled(false);
         txt_bayar.setEnabled(false);
         txt_kembalian.setEnabled(false);
     }

    private void setProduk() {
        DataProdukPN dialogProduk = new DataProdukPN(null, true);
        dialogProduk.setVisible(true);

        String selectedProductId = dialogProduk.getIdProduk();

        if (selectedProductId != null && !selectedProductId.isEmpty()) {
            try {
                String query = "SELECT * FROM produk WHERE id_produk = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, selectedProductId);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String idProduk = rs.getString("id_produk");
                    String namaProduk = rs.getString("nama_produk");
                    double harga = rs.getDouble("harga_jual");
                    int stok = rs.getInt("stok");
                    String satuan = rs.getString("satuan");

                    // Default jumlah pembelian adalah 1
                    int jumlah = 1;
                    double subtotal = harga * jumlah;

                    // Default metode bayar adalah "Cash"
                    String metodeBayar = "Cash";

                    String queryCek = "SELECT * FROM pn_sementara WHERE id_produk = ?";
                    PreparedStatement psCek = conn.prepareStatement(queryCek);
                    psCek.setString(1, idProduk);
                    ResultSet rsCek = psCek.executeQuery();

                    if (rsCek.next()) {
                        int jumlahLama = rsCek.getInt("jumlah_beli");
                        String metodeBayarLama = rsCek.getString("metode_bayar");

                        jumlah = jumlahLama + 1;

                        // Jika metode bayar sebelumnya adalah Point, maka subtotal tetap sesuai aturan Point
                        if ("Point".equals(metodeBayarLama)) {
                            subtotal = 0.0;
                            metodeBayar = "Point";
                        } else {
                            subtotal = harga * jumlah;
                            metodeBayar = metodeBayarLama;
                        }

                        String queryUpdate = "UPDATE pn_sementara SET jumlah_beli = ?, subtotal = ?, metode_bayar = ? WHERE id_produk = ?";
                        PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);
                        psUpdate.setInt(1, jumlah);
                        psUpdate.setDouble(2, subtotal);
                        psUpdate.setString(3, metodeBayar);
                        psUpdate.setString(4, idProduk);
                        psUpdate.executeUpdate();
                        psUpdate.close();
                    } else {
                        String queryInsert = "INSERT INTO pn_sementara (id_produk, nama_produk, satuan, harga, jumlah_beli, subtotal, metode_bayar) " +
                                            "VALUES (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement psInsert = conn.prepareStatement(queryInsert);
                        psInsert.setString(1, idProduk);
                        psInsert.setString(2, namaProduk);
                        psInsert.setString(3, satuan);
                        psInsert.setDouble(4, harga);
                        psInsert.setInt(5, jumlah);
                        psInsert.setDouble(6, subtotal);
                        psInsert.setString(7, metodeBayar);
                        psInsert.executeUpdate();
                        psInsert.close();
                    }

                    rsCek.close();
                    psCek.close();
                    loadDataSementara();
                    hitungTotal();
                }

                rs.close();
                ps.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void getRFIDMember(String rfidMember) {
        try {
            String sql = "SELECT * FROM pelanggan WHERE rfid_member = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, rfidMember);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String idPelanggan = rs.getString("id_pelanggan");
                String namaPelanggan = rs.getString("nama_pelanggan");
                int point = rs.getInt("point");
                String alamat = rs.getString("alamat");
                String tglGabung = rs.getString("tanggal_bergabung");

                StringBuilder message = new StringBuilder();
                message.append("DATA MEMBERSHIP\n");
                message.append("--------------------------------\n");
                message.append("ID Pelanggan : ").append(idPelanggan).append("\n");
                message.append("Nama Pelanggan : ").append(namaPelanggan).append("\n");
                message.append("Point : ").append(point).append("\n");
                message.append("Alamat : ").append(alamat).append("\n");
                message.append("Tanggal Bergabung : ").append(tglGabung).append("\n");

                txt_namaPelanggan.setText(namaPelanggan);

                if (point >= 10) {
                    int option = JOptionPane.showConfirmDialog(
                        this,
                        message.toString() + "\nPoint anda cukup untuk 1 Refill Galon gratis.\nTukar sekarang?",
                        "Konfirmasi Tukar Point",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    if (option == JOptionPane.YES_OPTION) {
                        getFreeRefillGalon(idPelanggan, point, rfidMember);
                        setEnableField();
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(
                        this,
                        message.toString() + "\nPoint anda belum cukup untuk tukar Refill Galon.",
                        "Info Member",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Kartu RFID tidak terdaftar di database.",
                    "Kartu Tidak Dikenali",
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
    
    private String getIdPelangganByName(String namaPelanggan) {
        String idPelanggan = null;
        String sql = "SELECT id_pelanggan FROM pelanggan WHERE nama_pelanggan = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, namaPelanggan);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    idPelanggan = rs.getString("id_pelanggan");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiturPenjualan.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
        return idPelanggan;
    }

    private void getFreeRefillGalon(String idPelanggan, int currentPoint, String rfidMember) {
        try {
            String queryProduk = "SELECT * FROM produk WHERE id_produk = 'SL001'";
            PreparedStatement psProduk = conn.prepareStatement(queryProduk);
            ResultSet rsProduk = psProduk.executeQuery();

            if (rsProduk.next()) {
                String idProduk = rsProduk.getString("id_produk");
                String namaProduk = rsProduk.getString("nama_produk");
                double harga = rsProduk.getDouble("harga_jual");
                String satuan = rsProduk.getString("satuan");

                int jumlah = 1;
                double subtotal = 0.0; 
                String metodeBayar = "Point"; 

                String queryCek = "SELECT * FROM pn_sementara WHERE id_produk = ?";
                PreparedStatement psCek = conn.prepareStatement(queryCek);
                psCek.setString(1, idProduk);
                ResultSet rsCek = psCek.executeQuery();

                if (rsCek.next()) {
                    int jumlahLama = rsCek.getInt("jumlah_beli");
                    jumlah = jumlahLama + 1;

                    String queryUpdate = "UPDATE pn_sementara SET jumlah_beli = ?, subtotal = ?, metode_bayar = ? WHERE id_produk = ?";
                    PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);
                    psUpdate.setInt(1, jumlah);
                    psUpdate.setDouble(2, subtotal);
                    psUpdate.setString(3, metodeBayar);
                    psUpdate.setString(4, idProduk);
                    psUpdate.executeUpdate();
                    psUpdate.close();
                } else {
                    String queryInsert = "INSERT INTO pn_sementara (id_produk, nama_produk, satuan, harga, jumlah_beli, subtotal, metode_bayar) " +
                                       "VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement psInsert = conn.prepareStatement(queryInsert);
                    psInsert.setString(1, idProduk);
                    psInsert.setString(2, namaProduk);
                    psInsert.setString(3, satuan);
                    psInsert.setDouble(4, harga);
                    psInsert.setInt(5, jumlah);
                    psInsert.setDouble(6, subtotal);
                    psInsert.setString(7, metodeBayar);
                    psInsert.executeUpdate();
                    psInsert.close();
                }

                rsCek.close();
                psCek.close();

                int newPoint = currentPoint - 10;
                String queryUpdatePoint = "UPDATE pelanggan SET point = ? WHERE rfid_member = ?";
                PreparedStatement psUpdatePoint = conn.prepareStatement(queryUpdatePoint);
                psUpdatePoint.setInt(1, newPoint);
                psUpdatePoint.setString(2, rfidMember); // PERBAIKAN: gunakan rfidMember parameter
                psUpdatePoint.executeUpdate();
                psUpdatePoint.close();

                loadDataSementara();
                hitungTotal();

                JOptionPane.showMessageDialog(
                    this,
                    "Refill Galon gratis berhasil ditambahkan!\nPoint tersisa: " + newPoint,
                    "Berhasil",
                    JOptionPane.INFORMATION_MESSAGE
                );

            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Produk Refill Galon (SL001) tidak ditemukan di database!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }

            rsProduk.close();
            psProduk.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error menambahkan refill galon gratis: " + e.getMessage());
        }
    }
   
    private void getProduk() {
        try {
            String barcode = txt_barcode.getText().trim();

            if (barcode.isEmpty()) {
                return;
            }

            String query = "SELECT * FROM produk WHERE barcode = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, barcode);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String idProduk = rs.getString("id_produk");
                String namaProduk = rs.getString("nama_produk");
                double harga = rs.getDouble("harga_jual");
                int stok = rs.getInt("stok");
                String satuan = rs.getString("satuan");
                String barcodeProduk = rs.getString("barcode");

                int jumlah = 1;
                double subtotal = harga * jumlah;

                String metodeBayar = "Cash";

                String queryCek = "SELECT * FROM pn_sementara WHERE id_produk = ?";
                PreparedStatement psCek = conn.prepareStatement(queryCek);
                psCek.setString(1, idProduk);
                ResultSet rsCek = psCek.executeQuery();

                if (rsCek.next()) {
                    int jumlahLama = rsCek.getInt("jumlah_beli");
                    String metodeBayarLama = rsCek.getString("metode_bayar");

                    jumlah = jumlahLama + 1;

                    if ("Point".equals(metodeBayarLama)) {
                        subtotal = 0.0; 
                        metodeBayar = "Point";
                    } else {
                        subtotal = harga * jumlah;
                        metodeBayar = metodeBayarLama;
                    }

                    String queryUpdate = "UPDATE pn_sementara SET jumlah_beli = ?, subtotal = ?, metode_bayar = ? WHERE id_produk = ?";
                    PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);
                    psUpdate.setInt(1, jumlah);
                    psUpdate.setDouble(2, subtotal);
                    psUpdate.setString(3, metodeBayar);
                    psUpdate.setString(4, idProduk);
                    psUpdate.executeUpdate();
                    psUpdate.close();
                } else {
                    String queryInsert = "INSERT INTO pn_sementara (id_produk, nama_produk, satuan, harga, jumlah_beli, subtotal, metode_bayar) " +
                                         "VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement psInsert = conn.prepareStatement(queryInsert);
                    psInsert.setString(1, idProduk);
                    psInsert.setString(2, namaProduk);
                    psInsert.setString(3, satuan);
                    psInsert.setDouble(4, harga);
                    psInsert.setInt(5, jumlah);
                    psInsert.setDouble(6, subtotal);
                    psInsert.setString(7, metodeBayar);
                    psInsert.executeUpdate();
                    psInsert.close();
                }

                rsCek.close();
                psCek.close();

                txt_barcode.setText("");
                loadDataSementara();
                hitungTotal();

            } else {
                JOptionPane.showMessageDialog(this, "Produk dengan barcode " + barcode + " tidak ditemukan", 
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
                txt_barcode.setText("");
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void dataTabelSementara() {
        int row = tbl_dataSementara.getSelectedRow();
        if (row != -1) {
            String idProduk = tbl_dataSementara.getValueAt(row, 0).toString();
            String barcode = tbl_dataSementara.getValueAt(row, 1).toString();
            String namaProduk = tbl_dataSementara.getValueAt(row, 2).toString();
            String harga = tbl_dataSementara.getValueAt(row, 3).toString();
            String stok = tbl_dataSementara.getValueAt(row, 4).toString();
            String satuan = tbl_dataSementara.getValueAt(row, 5).toString();
            String jumlah = tbl_dataSementara.getValueAt(row, 6).toString();

            txt_barcode.setText(barcode);
            txt_namaProduk.setText(namaProduk);
            txt_hargaJual.setText(harga);
            txt_stok.setText(stok);
            txt_jumlah.setText(jumlah);

            txt_jumlah.requestFocus();
            txt_jumlah.selectAll();
        }
    }
    
    private void hitungDiskon() {
        try {
            String subtotalText = txt_subtotal.getText().replace("Rp.", "").replace(".", "").trim();
            double subtotal = Double.parseDouble(subtotalText);
            String discountText = txt_intDiskon.getText().trim();
            if (!discountText.isEmpty()) {
                double discountPercentage = Double.parseDouble(discountText);
                discountPercentage = Math.min(discountPercentage, 100);
                double discountAmount = (discountPercentage / 100) * subtotal;
                txt_diskon.setText("Rp." + formatRupiah(discountAmount));
                double totalAfterDiscount = subtotal - discountAmount;
                txt_totalHarga.setText("Rp." + formatRupiah(totalAfterDiscount));
                txt_total.setText("Rp." + formatRupiah(totalAfterDiscount)); 
            } else {
                txt_diskon.setText("Rp.0");
                txt_totalHarga.setText(txt_subtotal.getText());
                txt_total.setText(txt_subtotal.getText()); 
            }
        } catch (NumberFormatException e) {
            txt_diskon.setText("Rp.0");
            txt_totalHarga.setText(txt_subtotal.getText());
            txt_total.setText(txt_subtotal.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error calculating discount: " + e.getMessage(), 
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void hitungTotal() {
        try {
            String query = "SELECT SUM(subtotal) AS total FROM pn_sementara";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                double total = rs.getDouble("total");

                if (total == 0.0) {
                    txt_subtotal.setText("Rp.0");
                    txt_total.setText("Rp.0");
                    txt_totalHarga.setText("Rp.0");
                    txt_intDiskon.setText("0");
                    txt_bayar.setText("Rp.0");
                    txt_kembalian.setText("Rp.0");
                } else {
                    txt_subtotal.setText("Rp." + formatRupiah(total));
                    setDiskonOtomatis();
                    if (!txt_intDiskon.getText().trim().isEmpty()) {
                        hitungDiskon();
                    } else {
                        txt_total.setText("Rp." + formatRupiah(total));
                        txt_totalHarga.setText("Rp." + formatRupiah(total));
                    }
                }
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void hitungKembalian() {
        try {
            String totalText = txt_totalHarga.getText().replace("Rp.", "").replace(".", "");
            String bayarText = txt_bayar.getText().replace("Rp.", "").replace(".", "");

            if (!bayarText.isEmpty()) {
                double total = Double.parseDouble(totalText);
                double bayar = Double.parseDouble(bayarText);
                double kembalian = bayar - total;

                if (kembalian >= 0) {
                    txt_kembalian.setText("Rp." + formatRupiah(kembalian));
                } else {
                    txt_kembalian.setText("Rp.0");
                }
            } else {
                txt_kembalian.setText("Rp.0");
            }
        } catch (NumberFormatException e) {
            txt_kembalian.setText("Rp.0");
        }
    }
    
    private void setDiskonOtomatis() {
        try {
            String subtotalText = txt_subtotal.getText().replace("Rp.", "").replace(".", "").trim();
            double subtotal = Double.parseDouble(subtotalText);

            if (subtotal > 200000) {
                txt_intDiskon.setText("10");
            } else if (subtotal > 100000) {
                txt_intDiskon.setText("5");
            } else if (subtotal > 50000) {
                txt_intDiskon.setText("2");
            } else {
                txt_intDiskon.setText("0");
            }
        } catch (NumberFormatException e) {
            txt_intDiskon.setText("0");
        }
    }
    
    private void addPointPelanggan(String idPelanggan) {
        if (idPelanggan == null || idPelanggan.isEmpty()) {
            return;
        }

        String sql = "UPDATE pelanggan SET point = point + 1 WHERE id_pelanggan = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idPelanggan);
            int result = st.executeUpdate();
            if (result > 0) {
                System.out.println("Point pelanggan berhasil ditambah.");
            } else {
                System.out.println("Gagal menambah point, ID pelanggan tidak ditemukan.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean checkIdPenjualan(String idPenjualan) {
        String sql = "SELECT COUNT(*) FROM penjualan WHERE id_penjualan = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idPenjualan);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiturPenjualan.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private String formatRupiah(double nominal) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(nominal).replace(",", ".");
    }
    
    private void formatBayarRupiah() {
        String text = txt_bayar.getText();
        String numbersOnly = text.replaceAll("[^0-9]", "");

        if (!numbersOnly.isEmpty()) {
            try {
                long number = Long.parseLong(numbersOnly);
                String formatted = "Rp." + formatRupiah(number);

                if (!text.equals(formatted)) {
                    int caretPos = txt_bayar.getCaretPosition();
                    txt_bayar.setText(formatted);

                    try {
                        txt_bayar.setCaretPosition(formatted.length());
                    } catch (IllegalArgumentException ex) {
                        txt_bayar.setCaretPosition(0);
                    }
                }
            } catch (NumberFormatException ex) {
            }
        }
    }
    
    private void updateJumlah() {
        try {
            String barcode = txt_barcode.getText().trim();
            int jumlahBaru = Integer.parseInt(txt_jumlah.getText().trim());

            String checkSql = "SELECT ps.id_produk, ps.harga " +
                             "FROM pn_sementara ps " +
                             "INNER JOIN produk p ON ps.id_produk = p.id_produk " +
                             "WHERE p.barcode = ?";

            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setString(1, barcode);
            ResultSet rs = checkPs.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, 
                    "Data dengan barcode " + barcode + " tidak ditemukan di tabel penjualan sementara", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                checkPs.close();
                return;
            }

            String idProduk = rs.getString("id_produk");
            double harga = rs.getDouble("harga");
            double subtotalBaru = harga * jumlahBaru;

            checkPs.close();

            String updateSql = "UPDATE pn_sementara SET jumlah_beli = ?, subtotal = ? WHERE id_produk = ?";
            PreparedStatement updatePs = conn.prepareStatement(updateSql);
            updatePs.setInt(1, jumlahBaru);
            updatePs.setDouble(2, subtotalBaru);
            updatePs.setString(3, idProduk);

            int result = updatePs.executeUpdate();

            if (result > 0) {
                loadDataSementara(); 
                hitungTotal();

                txt_jumlah.setText(String.valueOf(jumlahBaru));

                JOptionPane.showMessageDialog(this, 
                    "Jumlah berhasil diupdate menjadi " + jumlahBaru, 
                    "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Gagal mengupdate data", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }

            updatePs.close();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Format jumlah tidak valid. Masukkan angka yang benar.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                "Database Error: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("General Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void updateStokProdukDanAksesoris() {
        try {
            conn.setAutoCommit(false);

            String updateStokSQL = 
                "UPDATE produk p " +
                "JOIN pn_sementara ps ON p.id_produk = ps.id_produk " +
                "SET p.stok = CASE " +
                "   WHEN p.id_produk = 'SL001' THEN p.stok - (ps.jumlah_beli * 19) " +
                "   ELSE p.stok - ps.jumlah_beli " +
                "END";

            PreparedStatement stProduk = conn.prepareStatement(updateStokSQL);
            stProduk.executeUpdate();

            String sumGalonSQL = "SELECT SUM(jumlah_beli) AS total_galon FROM pn_sementara WHERE id_produk BETWEEN 'SL001' AND 'SL007'";
            PreparedStatement sumSt = conn.prepareStatement(sumGalonSQL);
            ResultSet rs = sumSt.executeQuery();

            if (rs.next()) {
                int totalGalon = rs.getInt("total_galon");
                if (totalGalon > 0) {
                    String updateTisuSQL = "UPDATE produk SET stok = stok - ? WHERE id_produk = 'SL008'";
                    PreparedStatement stTisu = conn.prepareStatement(updateTisuSQL);
                    stTisu.setInt(1, totalGalon);
                    stTisu.executeUpdate();
                }
            }

            String sumRefillSQL = "SELECT SUM(jumlah_beli) AS total_refill FROM pn_sementara WHERE id_produk = 'SL001'";
            PreparedStatement sumRefillSt = conn.prepareStatement(sumRefillSQL);
            ResultSet rsRefill = sumRefillSt.executeQuery();

            if (rsRefill.next()) {
                int totalRefill = rsRefill.getInt("total_refill");
                if (totalRefill > 0) {
                    String updateTutupSQL = "UPDATE produk SET stok = stok - ? WHERE id_produk = 'SL009'";
                    PreparedStatement stTutup = conn.prepareStatement(updateTutupSQL);
                    stTutup.setInt(1, totalRefill);
                    stTutup.executeUpdate();
                }
            }

            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
            throw new RuntimeException("Error updating product stock: " + e.getMessage());
        }
    }

    private boolean cekStokProdukYangDipilih() {
        try {
            String barcode = txt_barcode.getText().trim();
            String jumlahStr = txt_jumlah.getText().trim();

            if (barcode.isEmpty() || jumlahStr.isEmpty()) {
                return true;
            }

            int jumlahBeli;
            try {
                jumlahBeli = Integer.parseInt(jumlahStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka yang valid.", "Validasi Input", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            if (jumlahBeli <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah harus lebih dari 0.", "Validasi Input", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            String cekProdukSQL = "SELECT id_produk, nama_produk, stok, satuan FROM produk WHERE barcode = ?";
            PreparedStatement st = conn.prepareStatement(cekProdukSQL);
            st.setString(1, barcode);
            ResultSet rs = st.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Produk dengan barcode " + barcode + " tidak ditemukan.", "Produk Tidak Ditemukan", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            String idProduk = rs.getString("id_produk");
            String namaProduk = rs.getString("nama_produk");
            int stokTersedia = rs.getInt("stok");
            String satuan = rs.getString("satuan");

            int stokDibutuhkan = "SL001".equals(idProduk) ? jumlahBeli * 19 : jumlahBeli;

            int stokSudahDiambil = 0;
            for (int i = 0; i < tbl_dataSementara.getRowCount(); i++) {
                String idProdukKeranjang = tbl_dataSementara.getValueAt(i, 1).toString();
                if (idProduk.equals(idProdukKeranjang)) {
                    int jumlahBeliKeranjang = Integer.parseInt(tbl_dataSementara.getValueAt(i, 6).toString());
                    stokSudahDiambil += "SL001".equals(idProduk) ? jumlahBeliKeranjang * 19 : jumlahBeliKeranjang;
                }
            }

            int totalStokDibutuhkan = stokDibutuhkan + stokSudahDiambil;

            if (totalStokDibutuhkan > stokTersedia) {
                JOptionPane.showMessageDialog(this,
                    "Stok tidak mencukupi untuk produk: " + namaProduk + "\n" +
                    "Stok tersedia: " + stokTersedia + " " + satuan + "\n" +
                    "Stok sudah di keranjang: " + stokSudahDiambil + " " + satuan + "\n" +
                    "Stok akan ditambah: " + stokDibutuhkan + " " + satuan + "\n" +
                    "Total stok dibutuhkan: " + totalStokDibutuhkan + " " + satuan,
                    "Stok Tidak Mencukupi", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            if (idProduk.matches("SL00[1-7]")) {
                String cekStokTisuSQL = "SELECT stok FROM produk WHERE id_produk = 'SL008'";
                PreparedStatement stTisu = conn.prepareStatement(cekStokTisuSQL);
                ResultSet rsTisu = stTisu.executeQuery();

                if (rsTisu.next()) {
                    int stokTisu = rsTisu.getInt("stok");
                    int tisuSudahDiambil = 0;
                    for (int i = 0; i < tbl_dataSementara.getRowCount(); i++) {
                        String idProdukKeranjang = tbl_dataSementara.getValueAt(i, 1).toString();
                        if (idProdukKeranjang.matches("SL00[1-7]")) {
                            tisuSudahDiambil += Integer.parseInt(tbl_dataSementara.getValueAt(i, 6).toString());
                        }
                    }
                    int totalTisuDibutuhkan = jumlahBeli + tisuSudahDiambil;

                    if (totalTisuDibutuhkan > stokTisu) {
                        JOptionPane.showMessageDialog(this,
                            "Stok tisu tidak mencukupi!\n" +
                            "Stok tersedia: " + stokTisu + " pcs\n" +
                            "Stok sudah di keranjang: " + tisuSudahDiambil + " pcs\n" +
                            "Stok akan ditambah: " + jumlahBeli + " pcs\n" +
                            "Total stok dibutuhkan: " + totalTisuDibutuhkan + " pcs",
                            "Stok Tisu Tidak Mencukupi", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                }
            }

            if ("SL001".equals(idProduk)) {
                String cekStokTutupSQL = "SELECT stok FROM produk WHERE id_produk = 'SL009'";
                PreparedStatement stTutup = conn.prepareStatement(cekStokTutupSQL);
                ResultSet rsTutup = stTutup.executeQuery();

                if (rsTutup.next()) {
                    int stokTutup = rsTutup.getInt("stok");
                    int tutupSudahDiambil = 0;
                    for (int i = 0; i < tbl_dataSementara.getRowCount(); i++) {
                        String idProdukKeranjang = tbl_dataSementara.getValueAt(i, 1).toString();
                        if ("SL001".equals(idProdukKeranjang)) {
                            tutupSudahDiambil += Integer.parseInt(tbl_dataSementara.getValueAt(i, 6).toString());
                        }
                    }
                    int totalTutupDibutuhkan = jumlahBeli + tutupSudahDiambil;

                    if (totalTutupDibutuhkan > stokTutup) {
                        JOptionPane.showMessageDialog(this,
                            "Stok tutup galon tidak mencukupi!\n" +
                            "Stok tersedia: " + stokTutup + " pcs\n" +
                            "Stok sudah di keranjang: " + tutupSudahDiambil + " pcs\n" +
                            "Stok akan ditambah: " + jumlahBeli + " pcs\n" +
                            "Total stok dibutuhkan: " + totalTutupDibutuhkan + " pcs",
                            "Stok Tutup Tidak Mencukupi", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                }
            }

            return true;

        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat validasi stok: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void insertDataSementara(String idProduk) {
        try {
            String sqlProduk = "SELECT * FROM produk WHERE id_produk = ?";
            PreparedStatement stProduk = conn.prepareStatement(sqlProduk);
            stProduk.setString(1, idProduk);
            ResultSet rs = stProduk.executeQuery();

            if (rs.next()) {
                int harga = rs.getInt("harga_jual");
                int jumlah = 1;
                int subtotal = harga * jumlah;

                String sql = "INSERT INTO pn_sementara (id_produk, barcode, nama_produk, harga, stok, satuan, jumlah_beli, subtotal) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, idProduk);
                st.setString(2, rs.getString("barcode"));
                st.setString(3, rs.getString("nama_produk"));
                st.setInt(4, harga);
                st.setInt(5, rs.getInt("stok"));
                st.setString(6, rs.getString("satuan"));
                st.setInt(7, jumlah);
                st.setInt(8, subtotal);
                st.executeUpdate();
            }

            loadDataSementara();
            txt_barcode.setText("");
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void insertDataDetail(String idPenjualan) {
        try {
            String sql = "INSERT INTO detail_penjualan (id_penjualan, id_produk, id_kategori, jumlah, subtotal, metode_bayar) " +
                         "SELECT ?, ps.id_produk, p.id_kategori, ps.jumlah_beli, ps.subtotal, ps.metode_bayar " +
                         "FROM pn_sementara ps " +
                         "JOIN produk p ON ps.id_produk = p.id_produk";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPenjualan);
                int result = st.executeUpdate();
                if (result > 0) {
                    String clearSQL = "DELETE FROM pn_sementara";
                    try (PreparedStatement stClear = conn.prepareStatement(clearSQL)) {
                        stClear.executeUpdate();
                    }
                    refreshDetailView(idPenjualan);
                } else {
                    System.out.println("Warning: No detail records were inserted");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
            if (e.getMessage().contains("foreign key constraint")) {
                System.out.println("Foreign key constraint error - detail records may be referencing non-existent master record");
                throw new RuntimeException("Error in insertDataDetail: Foreign key violation - make sure master record exists");
            } else {
                throw new RuntimeException("Error in insertDataDetail: " + e.getMessage());
            }
        }
    }
    
    private void refreshDetailView(String idPenjualan) {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_dataDetail.getModel();
            getDataDetail(model, idPenjualan);
        } catch (Exception e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, "Error refreshing detail view", e);
        }
    } 
    
    private void insertData() {
        String idPenjualan = txt_idPenjualan.getText().trim();
        Date tanggal = txt_tanggal.getDate();

        if (idPenjualan.isEmpty() || tanggal == null) { 
            JOptionPane.showMessageDialog(this, "ID penjualan dan tanggal harus diisi.", "Validasi", JOptionPane.ERROR_MESSAGE);
            if (idPenjualan.isEmpty()) {
                txt_idPenjualan.requestFocus();
            } else {
                txt_tanggal.requestFocus();
            }
            return;
        }

        String namaPelanggan = txt_namaPelanggan.getText().trim();
        if ((idPelangganTerpilih == null || idPelangganTerpilih.isEmpty()) && 
            (namaPelanggan == null || namaPelanggan.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Pilih pelanggan terlebih dahulu.", "Validasi", JOptionPane.ERROR_MESSAGE);
            txt_namaPelanggan.requestFocus();
            return;
        }

        if ((idPelangganTerpilih == null || idPelangganTerpilih.isEmpty()) && 
            namaPelanggan != null && !namaPelanggan.isEmpty()) {
            idPelangganTerpilih = getIdPelangganByName(namaPelanggan);
        }

        if (tbl_dataSementara.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tambahkan produk ke keranjang terlebih dahulu.", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String totalHargaStr = txt_totalHarga.getText().replaceAll("[^0-9]", "");
        String bayarStr = txt_bayar.getText().replaceAll("[^0-9]", "");

        if (bayarStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah pembayaran.", "Validasi", JOptionPane.ERROR_MESSAGE);
            txt_bayar.requestFocus();
            return;
        }

        int totalHarga = Integer.parseInt(totalHargaStr);
        int bayar = Integer.parseInt(bayarStr);

        if (bayar < totalHarga) {
            JOptionPane.showMessageDialog(this, "Jumlah pembayaran kurang dari total belanja.", "Validasi", JOptionPane.ERROR_MESSAGE);
            txt_bayar.requestFocus();
            return;
        }

        String tgl = new SimpleDateFormat("yyyy-MM-dd").format(tanggal);
        int totalBeli = 0;
        for (int i = 0; i < tbl_dataSementara.getRowCount(); i++) {
            totalBeli += Integer.parseInt(tbl_dataSementara.getValueAt(i, 6).toString());
        }
        int kembalian = bayar - totalHarga;

        try {
            if (checkIdPenjualan(idPenjualan)) {
                JOptionPane.showMessageDialog(this, "ID Penjualan " + idPenjualan + " sudah ada dalam database.", "Validasi", JOptionPane.ERROR_MESSAGE);
                txt_idPenjualan.requestFocus();
                return;
            }

            conn.setAutoCommit(false);

            String sql = "INSERT INTO penjualan " +
                    "(id_penjualan, total_beli, total_harga, " +
                    "tanggal_transaksi, id_pelanggan, id_user, " +
                    "bayar, diskon, kembali) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPenjualan);
                st.setInt(2, totalBeli);
                st.setInt(3, totalHarga);
                st.setString(4, tgl);
                st.setString(5, idPelangganTerpilih);
                st.setString(6, userID);
                st.setInt(7, bayar);

                String diskonText = txt_diskon.getText().replace("Rp.", "").replace(".", "");
                int diskonValue = diskonText.isEmpty() ? 0 : Integer.parseInt(diskonText);
                st.setInt(8, diskonValue);
                st.setInt(9, kembalian);

                int result = st.executeUpdate();

                if (result > 0) {
                    updateStokProdukDanAksesoris();
                    insertDataDetail(idPenjualan); 
                    conn.commit();

                    addPointPelanggan(idPelangganTerpilih);
                    
                    resetForm();
                    resetFormProduk();
                    resetPembayaran();
                    loadData();

                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Message", JOptionPane.INFORMATION_MESSAGE);
                    servisReport.printStruk(idPenjualan);
                } else {
                    throw new SQLException("Gagal menyimpan data penjualan");
                }
            }
        } catch (SQLException ex) {
            try {
                conn.rollback();
            } catch(SQLException e) {
                Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
            }
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void deleteDataSementara() {
        int row = tbl_dataSementara.getSelectedRow();
        if (row != -1) {
            String idProduk = tbl_dataSementara.getValueAt(row, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin ingin menghapus produk ini?", 
                    "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String query = "DELETE FROM pn_sementara WHERE id_produk = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, idProduk);
                    ps.executeUpdate();

                    loadDataSementara();
                    hitungTotal();
                    resetFormProduk();

                    JOptionPane.showMessageDialog(this, "Produk berhasil dihapus", 
                            "Informasi", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), 
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void searchData() {
        String kataKunci = txt_search.getText();

        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT p.id_penjualan, p.tanggal_transaksi, "
                       + "COALESCE(SUM(dp.jumlah), 0) AS total_beli, "
                       + "p.total_harga, p.bayar, p.diskon, p.kembali, "
                       + "c.nama_pelanggan, u.nama AS nama_kasir "
                       + "FROM penjualan p "
                       + "JOIN pelanggan c ON c.id_pelanggan = p.id_pelanggan "
                       + "JOIN user u ON u.id_user = p.id_user "
                       + "JOIN detail_penjualan dp ON dp.id_penjualan = p.id_penjualan "
                       + "WHERE p.id_penjualan LIKE ? OR c.nama_pelanggan LIKE ? "
                       + "GROUP BY p.id_penjualan, p.tanggal_transaksi, p.total_harga, "
                       + "p.bayar, p.diskon, p.kembali, c.nama_pelanggan, u.nama "
                       + "ORDER BY p.id_penjualan";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("id_penjualan"),
                        rs.getDate("tanggal_transaksi"),
                        rs.getInt("total_beli"),
                        "Rp." + formatRupiah(rs.getInt("total_harga")),
                        "Rp." + formatRupiah(rs.getInt("bayar")),
                        "Rp." + formatRupiah(rs.getInt("diskon")),
                        "Rp." + formatRupiah(rs.getInt("kembali")),
                        rs.getString("nama_pelanggan"),
                        rs.getString("nama_kasir")
                    });
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setButtonIcons() {
        int iconSize = 18;  
        Color iconColor = Color.WHITE;  

        btn_add.setIcon(createSVGIcon("icons/add.svg", iconSize, iconColor));
        btn_print.setIcon(createSVGIcon("icons/print.svg", iconSize, iconColor));
        btn_delete.setIcon(createSVGIcon("icons/delete.svg", iconSize, iconColor));
        btn_cancel.setIcon(createSVGIcon("icons/cancel.svg", iconSize, iconColor));
        btn_edit.setIcon(createSVGIcon("icons/edit.svg", iconSize, iconColor));
        btn_save.setIcon(createSVGIcon("icons/save.svg", iconSize, iconColor));
        btn_cancelSementara.setIcon(createSVGIcon("icons/cancel.svg", iconSize, iconColor));
    }

    private FlatSVGIcon createSVGIcon(String path, int size, Color color) {
        FlatSVGIcon icon = new FlatSVGIcon(path).derive(size, size);
        icon.setColorFilter(new FlatSVGIcon.ColorFilter(c -> color));
        return icon;
    }
}
