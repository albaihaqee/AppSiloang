package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;

public class FiturPembelian extends javax.swing.JPanel {

    private final Connection conn;
    private String userID;
    private boolean isRefillGalon = false;

    public FiturPembelian(String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setupCustomTableStyle();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        setNumberinField();
        actionButton();
        setPlaceholderField();
        setButtonIcons();

        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/pembelian.svg").derive(15, 15);
        dashboardIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_pembelian.setIcon(dashboardIcon);

        FlatSVGIcon dashboardSVG = new FlatSVGIcon("icons/pembelian.svg").derive(15, 15);
        dashboardSVG.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        icon_pembelian.setIcon(dashboardSVG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_pembelian = new javax.swing.JLabel();
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
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        icon_pembelian = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_idPenjualan = new javax.swing.JLabel();
        lb_tanggalPenjualan = new javax.swing.JLabel();
        txt_tanggal = new com.toedter.calendar.JDateChooser();
        txt_idPembelian = new javax.swing.JTextField();
        lb_idPelanggan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dataSementara = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        txt_idSupplier = new javax.swing.JTextField();
        btn_setPelanggan = new javax.swing.JButton();
        lb_nama = new javax.swing.JLabel();
        txt_namaSupplier = new javax.swing.JTextField();
        lb_alamat = new javax.swing.JLabel();
        txt_alamatSupplier = new javax.swing.JTextField();
        txt_satuanProduk = new javax.swing.JTextField();
        lb_satuan = new javax.swing.JLabel();
        lb_produk = new javax.swing.JLabel();
        txt_namaProduk = new javax.swing.JTextField();
        txt_idProduk = new javax.swing.JTextField();
        btn_setProduk = new javax.swing.JButton();
        lb_idProduk = new javax.swing.JLabel();
        txt_teleponSupplier = new javax.swing.JTextField();
        lb_telepon = new javax.swing.JLabel();
        txt_hargaProduk = new javax.swing.JTextField();
        lb_hargaProduk = new javax.swing.JLabel();
        txt_bayar = new javax.swing.JTextField();
        lb_bayar = new javax.swing.JLabel();
        lb_subtotal = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lb_jumlah = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        lb_kembalian = new javax.swing.JLabel();
        lb_totalHarga = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        lb_total = new javax.swing.JLabel();
        lb_totalBeli = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_cancelSementara = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Transaksi > Pembelian");

        lb_pembelian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Pembelian SiLoang");

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
        lb_dataDetail.setText("Data Detail Pembelian SiLoang");

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
                        .addGap(377, 720, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lb_pembelian)
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
                        .addComponent(lb_pembelian)))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Transaksi > Pembelian");

        icon_pembelian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        icon_pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Pembelian SiLoang");

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

        lb_idPenjualan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idPenjualan.setText("ID");

        lb_tanggalPenjualan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_tanggalPenjualan.setText("Tanggal ");

        txt_idPembelian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_idPembelian.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_idPenjualan)
                .addGap(10, 10, 10)
                .addComponent(txt_idPembelian)
                .addGap(40, 40, 40)
                .addComponent(lb_tanggalPenjualan)
                .addGap(10, 10, 10)
                .addComponent(txt_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_idPenjualan)
                        .addComponent(lb_tanggalPenjualan)
                        .addComponent(txt_idPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        lb_idPelanggan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idPelanggan.setText("ID Supplier");

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
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        txt_idSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_idSupplier.setForeground(new java.awt.Color(102, 102, 102));

        btn_setPelanggan.setText("...");

        lb_nama.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_nama.setText("Nama");

        txt_namaSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_namaSupplier.setForeground(new java.awt.Color(102, 102, 102));

        lb_alamat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_alamat.setText("Alamat");

        txt_alamatSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_alamatSupplier.setForeground(new java.awt.Color(102, 102, 102));

        txt_satuanProduk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_satuanProduk.setForeground(new java.awt.Color(102, 102, 102));

        lb_satuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_satuan.setText("Satuan");

        lb_produk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_produk.setText("Produk");

        txt_namaProduk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_namaProduk.setForeground(new java.awt.Color(102, 102, 102));

        txt_idProduk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_idProduk.setForeground(new java.awt.Color(102, 102, 102));

        btn_setProduk.setText("...");

        lb_idProduk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idProduk.setText("ID Produk");

        txt_teleponSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_teleponSupplier.setForeground(new java.awt.Color(102, 102, 102));

        lb_telepon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_telepon.setText("Telepon");

        txt_hargaProduk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_hargaProduk.setForeground(new java.awt.Color(102, 102, 102));

        lb_hargaProduk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_hargaProduk.setText("Harga");

        txt_bayar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_bayar.setForeground(new java.awt.Color(102, 102, 102));
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bayarKeyPressed(evt);
            }
        });

        lb_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_bayar.setText("Bayar");

        lb_subtotal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_subtotal.setText("Subtotal");

        txt_subtotal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_subtotal.setForeground(new java.awt.Color(102, 102, 102));

        lb_jumlah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_jumlah.setText("Jumlah");

        txt_kembalian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_kembalian.setForeground(new java.awt.Color(102, 102, 102));

        lb_kembalian.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_kembalian.setText("Kembalian");

        lb_totalHarga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_totalHarga.setText("Total Harga");

        txt_totalHarga.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        txt_totalHarga.setForeground(new java.awt.Color(102, 102, 102));

        txt_jumlah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_jumlah.setForeground(new java.awt.Color(102, 102, 102));
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyPressed(evt);
            }
        });

        lb_total.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_total.setText("Total Beli");

        lb_totalBeli.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lb_totalBeli.setText("0");

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

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(icon_pembelian)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane2)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_alamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_idPelanggan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_telepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_alamatSupplier, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_teleponSupplier, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_namaSupplier, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(1, 1, 1))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(txt_idSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_setPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_satuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_produk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_idProduk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_hargaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(txt_idProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_setProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_namaProduk)
                                    .addComponent(txt_satuanProduk)
                                    .addComponent(txt_hargaProduk))
                                .addGap(3, 3, 3)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_kembalian)))
                                    .addComponent(lb_subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_jumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txt_subtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_jumlah, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_kembalian)))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addGroup(panelAddLayout.createSequentialGroup()
                                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_cancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(lb_totalHarga)
                                .addGap(217, 217, 217)
                                .addComponent(lb_total))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txt_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lb_totalBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
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
                        .addComponent(icon_pembelian)))
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_setPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nama)
                            .addComponent(txt_namaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_alamat)
                            .addComponent(txt_alamatSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_telepon)
                                    .addComponent(txt_teleponSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cancelSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_hargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_hargaProduk))))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_jumlah))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_subtotal)
                                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_bayar)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_kembalian)))
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_idPelanggan)
                                .addComponent(txt_idSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_idProduk)
                                        .addComponent(txt_idProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_setProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_produk)
                                    .addComponent(txt_namaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_satuan)
                                    .addComponent(txt_satuanProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_totalHarga)
                    .addComponent(lb_total))
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_totalBeli)
                        .addContainerGap())))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();

        txt_idPembelian.setText(setIDPembelian());
        txt_tanggal.setDate(new Date());

        txt_subtotal.setEnabled(false); //Gabisa diklik
        txt_kembalian.setEnabled(false); //Gabisa diklik
        txt_totalHarga.setEnabled(false); //Gabisa diklik   
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        showPanel();
        panelMain.removeAll();
        panelMain.add(panelView);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (btn_save.getText().equals("TAMBAH")) {
            btn_save.setText("SIMPAN");
        } else if (btn_save.getText().equals("SIMPAN")) {
            insertData();
            insertDataDetail();
            deleteDataSementara();
            resetForm();
            loadData();
            showPanel();
        } else if (btn_save.getText().equals("PERBARUI")) {
            updateData();
            resetForm();
            loadData();
            showPanel();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped

    private void txt_jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String jumlahText = txt_jumlah.getText();
            try {
                int jumlahBeli = Integer.parseInt(jumlahText);
                if (jumlahBeli < 0) {
                    JOptionPane.showMessageDialog(this, "Jumlah beli tidak bisa negatif!", "Input Error", JOptionPane.ERROR_MESSAGE);
                    txt_jumlah.setText("");
                } else {
                    int jumlahAsli = jumlahBeli;
                    int quantityTampil = jumlahBeli;

                    // Jika produk adalah refill galon, kalikan 19 untuk quantity tampil
                    if (isRefillGalon) {
                        quantityTampil *= 19;
                    }

                    // Proses dengan parameter yang benar
                    getSubtotal(jumlahAsli); // Hitung harga dengan jumlah asli
                    txt_totalHarga.setText(getTotalHarga());
                    insertDataSementara(jumlahAsli, quantityTampil); // Simpan dengan quantity yang sesuai
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Harap masukkan angka yang valid!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_txt_jumlahKeyPressed

    private void txt_bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getPembayaran();
        }
    }//GEN-LAST:event_txt_bayarKeyPressed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        getSubtotal();
        getUpdateTotalHargaDanBeli();
        updateDataSementara();
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_dataSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataSementaraMouseClicked
        btn_delete.setVisible(true);
        btn_cancelSementara.setVisible(true);
        dataTabelSementara();
    }//GEN-LAST:event_tbl_dataSementaraMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        deleteData();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancelSementara;
    private javax.swing.JButton btn_closeDetail;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_setPelanggan;
    private javax.swing.JButton btn_setProduk;
    private javax.swing.JLabel icon_pembelian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_alamat;
    private javax.swing.JLabel lb_bayar;
    private javax.swing.JLabel lb_dataDetail;
    private javax.swing.JLabel lb_hargaProduk;
    private javax.swing.JLabel lb_idPelanggan;
    private javax.swing.JLabel lb_idPenjualan;
    private javax.swing.JLabel lb_idProduk;
    private javax.swing.JLabel lb_jumlah;
    private javax.swing.JLabel lb_kembalian;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_pembelian;
    private javax.swing.JLabel lb_produk;
    private javax.swing.JLabel lb_satuan;
    private javax.swing.JLabel lb_subtotal;
    private javax.swing.JLabel lb_tanggalPenjualan;
    private javax.swing.JLabel lb_telepon;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_totalBeli;
    private javax.swing.JLabel lb_totalHarga;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel pn_detail;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTable tbl_dataDetail;
    private javax.swing.JTable tbl_dataSementara;
    private javax.swing.JTextField txt_alamatSupplier;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_hargaProduk;
    private javax.swing.JTextField txt_idPembelian;
    private javax.swing.JTextField txt_idProduk;
    private javax.swing.JTextField txt_idSupplier;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_namaProduk;
    private javax.swing.JTextField txt_namaSupplier;
    private javax.swing.JTextField txt_satuanProduk;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_subtotal;
    private com.toedter.calendar.JDateChooser txt_tanggal;
    private javax.swing.JTextField txt_teleponSupplier;
    private javax.swing.JTextField txt_totalHarga;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        pn_detail.setVisible(false);
    }

    private void loadDataSementara() {
        getDataSementara((DefaultTableModel) tbl_dataSementara.getModel());
        btn_delete.setVisible(false);
        btn_cancelSementara.setVisible(false);
    }

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturPembelian(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void resetForm() {
        txt_idPembelian.setText("");
        txt_tanggal.setDate(null);
        txt_jumlah.setText("");
        txt_subtotal.setText("0");
    }

    private void resetFormProduk() {
        txt_idProduk.setText("");
        txt_namaProduk.setText("");
        txt_satuanProduk.setText("");
        txt_hargaProduk.setText("");
        txt_jumlah.setText("");
        txt_subtotal.setText("0");
    }

    private void actionButton() {
        btn_setPelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSupplier();
            }
        });

        btn_setProduk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setProduk();
            }
        });

        tbl_data.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_detail.setVisible(true);

                int row = tbl_data.getSelectedRow();
                String id = tbl_data.getValueAt(row, 0).toString();
                getDataDetail((DefaultTableModel) tbl_dataDetail.getModel(), id);
            }
        });

        tbl_dataSementara.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 4) {
                    btn_delete.setVisible(true);
                    getSubtotal();
                    getUpdateTotalHargaDanBeli();
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

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID Pembelian");
        model.addColumn("Total Beli");
        model.addColumn("Total Harga");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Nama Supplier");
        model.addColumn("Nama Administrator");
    }

    private void setPlaceholderField() {
        txt_idSupplier.setText("ID");
        txt_namaSupplier.setText("Nama");
        txt_alamatSupplier.setText("Alamat");
        txt_teleponSupplier.setText("Telepon");
        txt_idProduk.setText("ID");
        txt_namaProduk.setText("Produk");
        txt_satuanProduk.setText("Satuan");
        txt_bayar.setText("Rp.0");
        txt_kembalian.setText("Rp.0");
        txt_hargaProduk.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_jumlah.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "0");
        txt_subtotal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_totalHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rp.0");
        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pembelian.id_pembelian, pembelian.total_beli, pembelian.total_harga, pembelian.tanggal_transaksi,\n"
                    + "supplier.nama_supplier, user.nama\n"
                    + "FROM pembelian\n"
                    + "INNER JOIN supplier ON supplier.id_supplier = pembelian.id_supplier\n"
                    + "INNER JOIN user ON user.id_user = pembelian.id_user ORDER BY pembelian.id_pembelian ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPembelian = rs.getString("id_pembelian");
                    int totalBeli = rs.getInt("total_beli");
                    int totalHarga = rs.getInt("total_harga");
                    String tanggalTransaksi = rs.getString("tanggal_transaksi");
                    String namaSupplier = rs.getString("nama_supplier");
                    String namaKasir = rs.getString("nama");

                    Object[] rowData = {
                        idPembelian,
                        totalBeli,
                        formatRupiah(totalHarga),
                        tanggalTransaksi,
                        namaSupplier,
                        namaKasir
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataDetail.getModel();
        model.addColumn("ID Pembelian");
        model.addColumn("ID Produk");
        model.addColumn("ID Kategori");
        model.addColumn("Nama Produk");
        model.addColumn("Jumlah");
        model.addColumn("Subtotal");
        model.addColumn("Status Pembayaran");
    }

    private void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);

        try {
            String sql = "SELECT detail_pembelian.id_pembelian, produk.id_produk, kategori.id_kategori, produk.nama_produk,\n"
                    + "detail_pembelian.jumlah, detail_pembelian.subtotal, detail_pembelian.status_bayar\n"
                    + "FROM detail_pembelian\n"
                    + "INNER JOIN produk ON produk.id_produk = detail_pembelian.id_produk\n"
                    + "INNER JOIN kategori ON kategori.id_kategori = produk.id_kategori\n"
                    + "WHERE detail_pembelian.id_pembelian = '" + id + "'"
                    + "ORDER BY detail_pembelian.id_pembelian ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPembelian = rs.getString("id_pembelian");
                    String idProduk = rs.getString("id_produk");
                    String idKategori = rs.getString("id_kategori");
                    String namaProduk = rs.getString("nama_produk");
                    int jumlahBeli = rs.getInt("jumlah");
                    int subtotal = rs.getInt("subtotal");
                    String statusPembayaran = rs.getString("status_bayar");

                    Object[] rowData = {
                        idPembelian,
                        idProduk,
                        idKategori,
                        namaProduk,
                        jumlahBeli,
                        formatRupiah(subtotal),
                        statusPembayaran
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setTabelModelSementara() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataSementara.getModel();
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Satuan");
        model.addColumn("Harga");
        model.addColumn("Jumlah Beli");
        model.addColumn("Subtotal");
    }

    private void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM pn_sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String idProduk = rs.getString("id_produk");
                    String namaProduk = rs.getString("nama_produk");
                    String satuanProduk = rs.getString("satuan");
                    int hargaBeli = rs.getInt("harga");
                    String jumlahBeli = rs.getString("jumlah_beli");
                    int subtotal = rs.getInt("subtotal");

                    // PERBAIKAN: Hitung jumlah asli untuk refill galon
                    int jumlahAsli = Integer.parseInt(jumlahBeli);
                    if (namaProduk.toLowerCase().contains("refill")
                            && satuanProduk.equals("Liter")
                            && jumlahAsli % 19 == 0) {
                        jumlahAsli = jumlahAsli / 19; // Kembalikan ke jumlah asli (19 ÷ 19 = 1)
                    }

                    Object[] rowData = {
                        idProduk,
                        namaProduk,
                        satuanProduk,
                        formatRupiah(hargaBeli),
                        jumlahBeli, // Tampilkan 19 liter di tabel
                        formatRupiah(subtotal),
                        jumlahAsli // Hidden column untuk edit (akan berisi 1)
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String setIDPembelian() {
        String urutan = null;

        try {
            String sql = "SELECT RIGHT(id_pembelian, 3) AS LastNumber "
                    + "FROM pembelian "
                    + "WHERE id_pembelian LIKE 'PM%' "
                    + "ORDER BY id_pembelian DESC "
                    + "LIMIT 1";

            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("PM%03d", nextNumber);
            } else {
                urutan = "PM001";
            }

            rs.close();
            st.close();

        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE, null, e);
            urutan = "PM001";
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
        txt_jumlah.addKeyListener(angkaSaja);
        txt_subtotal.addKeyListener(angkaSaja);
        txt_bayar.addKeyListener(angkaSaja);
        txt_kembalian.addKeyListener(angkaSaja);
    }

    private void setSupplier() {
        boolean closable = true;
        DataSupplier supplier = new DataSupplier(null, closable);
        supplier.setVisible(true);

        txt_idSupplier.setText(supplier.getIdSupplier());
        txt_namaSupplier.setText(supplier.getNamaSupplier());
        txt_alamatSupplier.setText(supplier.getAlamatSupplier());
        txt_teleponSupplier.setText(supplier.getTeleponSupplier());

        txt_idSupplier.setEnabled(false);
        txt_namaSupplier.setEnabled(false);
        txt_alamatSupplier.setEnabled(false);
        txt_teleponSupplier.setEnabled(false);
    }

    private void setProduk() {
        boolean closable = true;
        DataProdukPM produk = new DataProdukPM(null, closable);
        produk.setVisible(true);

        txt_idProduk.setText(produk.getIdProduk());
        txt_namaProduk.setText(produk.getNamaProduk());
        txt_satuanProduk.setText(produk.getSatuanProduk());
        txt_hargaProduk.setText(produk.getHargaProduk());

        txt_idProduk.setEnabled(false);
        txt_namaProduk.setEnabled(false);
        txt_satuanProduk.setEnabled(false);
        txt_hargaProduk.setEnabled(false);

        // 🔍 Tambahan logika deteksi refill galon
        String namaProduk = produk.getNamaProduk();
        String satuan = produk.getSatuanProduk();

        if (namaProduk != null && (namaProduk.equalsIgnoreCase("Refill Galon") || satuan.equalsIgnoreCase("liter"))) {
            isRefillGalon = true;
        } else {
            isRefillGalon = false;
        }
    }

    private void insertDataSementara(int jumlahAsli, int quantityTampil) {
        String idProduk = txt_idProduk.getText();
        String namaProduk = txt_namaProduk.getText();
        String satuanProduk = txt_satuanProduk.getText();
        String hargaBeli = txt_hargaProduk.getText();
        String subtotal = txt_subtotal.getText();
        String metodeBayar = "NULL";

        if (idProduk.isEmpty() || namaProduk.isEmpty() || satuanProduk.isEmpty()
                || hargaBeli.isEmpty() || subtotal.isEmpty() || metodeBayar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !",
                    "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String cleanHargaBeli = hargaBeli.replace("Rp.", "").replace(".", "").trim();
            String cleanSubtotal = subtotal.replace("Rp.", "").replace(".", "").trim();
            int hargaBeliInt = Integer.parseInt(cleanHargaBeli);
            int subtotalInt = Integer.parseInt(cleanSubtotal);

            String sql = "INSERT INTO pn_sementara (id_produk, nama_produk, satuan, "
                    + "harga, jumlah_beli, subtotal, metode_bayar) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idProduk);
            st.setString(2, namaProduk);
            st.setString(3, satuanProduk);
            st.setInt(4, hargaBeliInt);

            // PERBAIKAN: Gunakan quantityTampil untuk database (19 liter untuk refill galon)
            st.setString(5, String.valueOf(quantityTampil));
            st.setInt(6, subtotalInt);
            st.setString(7, metodeBayar);

            st.executeUpdate();
            getUpdateTotalHargaDanBeli();
            loadDataSementara();

            if (JOptionPane.showConfirmDialog(this, "Mau Tambah Produk?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetFormProduk();
                txt_subtotal.setText("Rp.0");
                txt_bayar.setText("Rp.0");
                txt_kembalian.setText("Rp.0");
                btn_setProduk.requestFocus();
            } else {
                resetFormProduk();
                txt_subtotal.setText("Rp.0");
                btn_save.requestFocus();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format angka tidak valid!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Method overload untuk backward compatibility
    private void insertDataSementara() {
        String jumlahBeli = txt_jumlah.getText();
        try {
            int jumlah = Integer.parseInt(jumlahBeli);
            insertDataSementara(jumlah, jumlah); // Untuk produk biasa
        } catch (NumberFormatException e) {
            insertDataSementara(0, 0);
        }
    }

    private void getSubtotal(int jumlahAsli) {
        try {
            String hargaText = txt_hargaProduk.getText();
            if (hargaText.isEmpty()) {
                txt_subtotal.setText("Rp. 0");
                getUpdateTotalHargaDanBeli();
                return;
            }

            // Gunakan jumlahAsli untuk perhitungan harga, bukan dari txt_jumlah
            int hargaBeli = Integer.parseInt(hargaText);
            int totalHarga = jumlahAsli * hargaBeli; // Hitung dengan jumlah asli

            txt_subtotal.setText(formatRupiah(totalHarga));
            int row = tbl_dataSementara.getSelectedRow();
            if (row >= 0) {
                tbl_dataSementara.setValueAt(totalHarga, row, 5); // Kolom 5 adalah kolom subtotal
            }
            getUpdateTotalHargaDanBeli();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid pada harga produk!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getSubtotal() {
        // Method lama untuk kompatibilitas, ambil dari txt_jumlah
        try {
            int jumlahBeli = Integer.parseInt(txt_jumlah.getText());
            getSubtotal(jumlahBeli);
        } catch (NumberFormatException e) {
            getSubtotal(0);
        }
    }

    private String getTotalHarga() {
        int totalHarga = 0;
        String sql = "SELECT SUM(subtotal) AS total_harga FROM pn_sementara";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalHarga = rs.getInt("total_harga");
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }

        DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance(new Locale("id", "ID"));
        return "Rp." + formatter.format(totalHarga);
    }

    private int getTotalBeli() {
        int totalBeli = 0;

        try {
            String sql = "SELECT SUM(jumlah_beli) AS total_beli FROM pn_sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalBeli = rs.getInt("total_beli");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalBeli;
    }

    private void getPembayaran() {
        try {
            String bayarStr = txt_bayar.getText().replace("Rp.", "").replace(".", "").trim();
            String totalStr = txt_totalHarga.getText().replace("Rp.", "").replace(".", "").trim();

            int bayar = Integer.parseInt(bayarStr);
            int totalHarga = Integer.parseInt(totalStr);

            if (bayar < totalHarga) {
                JOptionPane.showMessageDialog(this, "Uang Anda Kurang!",
                        "Pembayaran Gagal", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int kembalian = bayar - totalHarga;

            DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance(new Locale("id", "ID"));
            txt_kembalian.setText("Rp." + formatter.format(kembalian));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format angka tidak valid!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getUpdateTotalHargaDanBeli() {
        String totalHarga = getTotalHarga();
        txt_totalHarga.setText(String.valueOf(totalHarga));

        int totalBeli = getTotalBeli();
        lb_totalBeli.setText(String.valueOf(totalBeli));
    }

    private String formatRupiah(int amount) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return currencyFormat.format(amount).replace("Rp", "Rp.").replace(",00", "");
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
                    .trim();

            if (cleanString.isEmpty()) {
                return 0;
            }

            return Integer.parseInt(cleanString);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing rupiah: " + rupiah);
            System.out.println("Error detail: " + e.getMessage());
            return 0;
        }
    }

    private boolean cekIdSupplier(String idSupplier) {
        try {
            String sql = "SELECT id_supplier FROM supplier WHERE id_supplier = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idSupplier);
            ResultSet rs = st.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    private void insertData() {
        String idPembelian = txt_idPembelian.getText();
        String totalBeli = lb_totalBeli.getText();
        String totalHarga = txt_totalHarga.getText();
        String idSupplier = txt_idSupplier.getText();
        Date tanggal = txt_tanggal.getDate();

        if (tanggal == null) {
            JOptionPane.showMessageDialog(this, "Tanggal harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tanggalTransaksi = new SimpleDateFormat("yyyy-MM-dd").format(tanggal);

        if (idPembelian.isEmpty() || totalBeli.isEmpty() || totalHarga.isEmpty()
                || tanggalTransaksi.isEmpty() || idSupplier.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cekIdSupplier(idSupplier)) {
            try {
                String cleanTotalHarga = totalHarga.replace("Rp.", "")
                        .replace(".", "")
                        .trim();

                String sql = "INSERT INTO pembelian (id_pembelian, total_beli, total_harga, "
                        + "tanggal_transaksi, id_supplier, id_user) VALUES (?,?,?,?,?,?)";

                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, idPembelian);
                st.setInt(2, Integer.parseInt(totalBeli));
                st.setInt(3, Integer.parseInt(cleanTotalHarga));
                st.setString(4, tanggalTransaksi);
                st.setString(5, idSupplier);
                st.setString(6, userID);

                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    loadData();
                    showPanel();
                }
            } catch (SQLException e) {
                Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Format angka tidak valid!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID Supplier tidak ditemukan. Silakan periksa kembali!");
        }
    }

    private void insertDataDetail() {
        String idPembelian = txt_idPembelian.getText();

        try {
            String sql = "INSERT INTO detail_pembelian (id_pembelian, id_produk, jumlah, subtotal, status_bayar) "
                    + "SELECT ?, id_produk, jumlah_beli, subtotal, metode_bayar "
                    + "FROM pn_sementara";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idPembelian); // Set id_penjualan untuk semua produk
            st.executeUpdate();
            updateStokProduk();
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void dataTabelSementara() {
        int row = tbl_dataSementara.getSelectedRow();
        txt_idProduk.setEnabled(false);
        txt_namaProduk.setEnabled(false);
        txt_satuanProduk.setEnabled(false);
        txt_hargaProduk.setEnabled(false);

        // Ambil data dari tabel sementara
        txt_idProduk.setText(tbl_dataSementara.getValueAt(row, 0).toString());
        txt_namaProduk.setText(tbl_dataSementara.getValueAt(row, 1).toString());
        txt_satuanProduk.setText(tbl_dataSementara.getValueAt(row, 2).toString());
        txt_hargaProduk.setText(tbl_dataSementara.getValueAt(row, 3).toString());

    
        String namaProduk = tbl_dataSementara.getValueAt(row, 1).toString();
        String satuanProduk = tbl_dataSementara.getValueAt(row, 2).toString();
        String jumlahBeli = tbl_dataSementara.getValueAt(row, 4).toString();

        
        int jumlahAsli = Integer.parseInt(jumlahBeli);

        if (namaProduk.toLowerCase().contains("refill")
                && satuanProduk.equals("Liter")
                && jumlahAsli % 19 == 0) {
            jumlahAsli = jumlahAsli / 19; // 19 ÷ 19 = 1
            isRefillGalon = true; // 
        } else {
            isRefillGalon = false;
        }

        txt_jumlah.setText(String.valueOf(jumlahAsli)); // Tampilkan 1, bukan 19
        txt_subtotal.setText(tbl_dataSementara.getValueAt(row, 5).toString());
        txt_jumlah.requestFocus();
    }

    private void updateData() {
        String idProduk = txt_idProduk.getText();
        String jumlahBeli = txt_jumlah.getText();
        String subtotal = txt_subtotal.getText();

        if (idProduk.isEmpty() || jumlahBeli.isEmpty() || subtotal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE pn_sementara SET jumlah_beli=?, subtotal=? WHERE id_produk=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, jumlahBeli);
            st.setString(2, subtotal);
            st.setString(3, idProduk);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetFormProduk();
                loadDataSementara();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void updateDataSementara() {
        String idProduk = txt_idProduk.getText();
        String jumlahBeli = txt_jumlah.getText();
        String subtotal = txt_subtotal.getText();

        if (idProduk.isEmpty() || jumlahBeli.isEmpty() || jumlahBeli.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Total Harga dan Total Beli berhasil diperbarui !", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE pn_sementara SET jumlah_beli=?, subtotal=? WHERE id_produk=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, jumlahBeli);
            st.setString(2, subtotal);
            st.setString(3, idProduk);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetFormProduk();
                loadDataSementara();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void deleteData() {
        int selectedRow = tbl_dataSementara.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String id = tbl_dataSementara.getValueAt(selectedRow, 0).toString();
                    String sql = "DELETE FROM pn_sementara WHERE id_produk=?";
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.setString(1, id);
                    int rowDelete = st.executeUpdate();
                    if (rowDelete > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }

                    DefaultTableModel model = (DefaultTableModel) tbl_dataSementara.getModel();
                    model.removeRow(selectedRow);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data.", "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih baris yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        resetFormProduk();
        loadDataSementara();
    }

    private void deleteDataSementara() {
        try {
            String sql = "DELETE FROM pn_sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.executeUpdate();
            }
        } catch (Exception e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void searchData() {
        String kataKunci = txt_search.getText();

        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT pembelian.id_pembelian, pembelian.total_beli, pembelian.total_harga, pembelian.tanggal_transaksi,\n"
                    + "supplier.nama_supplier, user.nama\n"
                    + "FROM pembelian\n"
                    + "INNER JOIN supplier ON supplier.id_supplier = pembelian.id_supplier\n"
                    + "INNER JOIN user ON user.id_user = pembelian.id_user\n"
                    + "WHERE pembelian.id_pembelian LIKE ? OR supplier.nama_supplier LIKE ?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPembelian = rs.getString("id_pembelian");
                    int totalBeli = rs.getInt("total_beli");
                    int totalHarga = rs.getInt("total_harga");
                    String tanggalTransaksi = rs.getString("tanggal_transaksi");
                    String namaSupplier = rs.getString("nama_supplier");
                    String namaKasir = rs.getString("nama");

                    Object[] rowData = {idPembelian, totalBeli, totalHarga, tanggalTransaksi, namaSupplier, namaKasir};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void updateStokProduk() {
        try {
            String sql = "UPDATE produk "
                    + "JOIN detail_pembelian ON produk.id_produk = detail_pembelian.id_produk "
                    + "SET produk.stok = produk.stok + detail_pembelian.jumlah "
                    + "WHERE detail_pembelian.id_pembelian = ?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txt_idPembelian.getText()); // Ambil ID Pembelian dari form

            int rowsUpdated = st.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(FiturPembelian.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Gagal memperbarui stok produk.");
        }
    }

    private void setButtonIcons() {
        int iconSize = 18;
        Color iconColor = Color.WHITE;

        btn_add.setIcon(createSVGIcon("icons/add.svg", iconSize, iconColor));
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
