package aplikasidesktopsiloang;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import view.FiturLogin;
import view.FiturProduk;
import view.FiturPelanggan;
import view.FiturPenjualan;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.Timer;
import view.FiturBarcode;
import view.FiturKategori;

public class MenuUtamaKasir extends javax.swing.JFrame {

    private String userID;
    private Connection conn;

    public MenuUtamaKasir(String userID) {
        initComponents();
        this.userID = userID;
        conn = Koneksi.getConnection();
        setUserInfo();
        setWhiteSidebarIcons();
        setBlueSidebarIcons();
        setButtonIcons();

        lb_profil.setIcon(new FlatSVGIcon("icons/profilDepot.svg", 35, 35));
    }

    public String getUserID() {
        return userID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        pn_profil = new javax.swing.JPanel();
        lb_profil = new javax.swing.JLabel();
        lb_admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_btnProduk = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        icon_produk = new javax.swing.JLabel();
        lb_produk = new javax.swing.JLabel();
        pn_btnPenjualan = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        icon_penjualan = new javax.swing.JLabel();
        lb_penjualan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_btnPelanggan = new javax.swing.JPanel();
        pn_line5 = new javax.swing.JPanel();
        icon_pelanggan = new javax.swing.JLabel();
        lb_pelanggan = new javax.swing.JLabel();
        pn_btnBarcode = new javax.swing.JPanel();
        pn_line7 = new javax.swing.JPanel();
        icon_barcode = new javax.swing.JLabel();
        lb_barcode = new javax.swing.JLabel();
        pn_btnKategori = new javax.swing.JPanel();
        pn_line9 = new javax.swing.JPanel();
        icon_kategori = new javax.swing.JLabel();
        lb_kategori = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_navbar = new javax.swing.JPanel();
        icon_barMenu = new javax.swing.JLabel();
        imageProfil1 = new aplikasidesktopsiloang.ImageProfil();
        lb_nameUser = new javax.swing.JLabel();
        lb_level = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_bell = new javax.swing.JButton();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA - Aplikasi Desktop SiLoang");

        pn_kiri.setBackground(new java.awt.Color(17, 97, 171));

        pn_profil.setBackground(new java.awt.Color(3, 78, 143));
        pn_profil.setPreferredSize(new java.awt.Dimension(150, 60));

        lb_profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_profile.png"))); // NOI18N

        lb_admin.setBackground(new java.awt.Color(255, 255, 255));
        lb_admin.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lb_admin.setForeground(new java.awt.Color(255, 255, 255));
        lb_admin.setText("S I L O A N G");

        javax.swing.GroupLayout pn_profilLayout = new javax.swing.GroupLayout(pn_profil);
        pn_profil.setLayout(pn_profilLayout);
        pn_profilLayout.setHorizontalGroup(
            pn_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_profilLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_profil)
                .addGap(11, 11, 11)
                .addComponent(lb_admin)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pn_profilLayout.setVerticalGroup(
            pn_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_profilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_profilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_admin)
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Data Master");

        pn_btnProduk.setBackground(new java.awt.Color(17, 97, 171));

        pn_line1.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        icon_produk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product.png"))); // NOI18N

        lb_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_produk.setForeground(new java.awt.Color(255, 255, 255));
        lb_produk.setText("Produk");
        lb_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_produkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_produkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_produkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnProdukLayout = new javax.swing.GroupLayout(pn_btnProduk);
        pn_btnProduk.setLayout(pn_btnProdukLayout);
        pn_btnProdukLayout.setHorizontalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_produk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_produk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnProdukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        pn_btnProdukLayout.setVerticalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_produk, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnProdukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPenjualan.setBackground(new java.awt.Color(17, 97, 171));

        pn_line2.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        icon_penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan.png"))); // NOI18N
        icon_penjualan.setText("jLabel6");

        lb_penjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_penjualan.setForeground(new java.awt.Color(255, 255, 255));
        lb_penjualan.setText("Penjualan");
        lb_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPenjualanLayout = new javax.swing.GroupLayout(pn_btnPenjualan);
        pn_btnPenjualan.setLayout(pn_btnPenjualanLayout);
        pn_btnPenjualanLayout.setHorizontalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        pn_btnPenjualanLayout.setVerticalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btnPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icon_penjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_penjualan))
                .addContainerGap())
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AppSiLoang v2.0.25");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Transaksi");

        pn_btnPelanggan.setBackground(new java.awt.Color(17, 97, 171));

        pn_line5.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line5Layout = new javax.swing.GroupLayout(pn_line5);
        pn_line5.setLayout(pn_line5Layout);
        pn_line5Layout.setHorizontalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line5Layout.setVerticalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        icon_pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pelanggan.png"))); // NOI18N
        icon_pelanggan.setText("jLabel9");

        lb_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        lb_pelanggan.setText("Pelanggan");
        lb_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPelangganLayout = new javax.swing.GroupLayout(pn_btnPelanggan);
        pn_btnPelanggan.setLayout(pn_btnPelangganLayout);
        pn_btnPelangganLayout.setHorizontalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        pn_btnPelangganLayout.setVerticalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icon_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_pelanggan))
                .addContainerGap())
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnBarcode.setBackground(new java.awt.Color(17, 97, 171));

        pn_line7.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line7Layout = new javax.swing.GroupLayout(pn_line7);
        pn_line7.setLayout(pn_line7Layout);
        pn_line7Layout.setHorizontalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line7Layout.setVerticalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        icon_barcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product.png"))); // NOI18N

        lb_barcode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_barcode.setForeground(new java.awt.Color(255, 255, 255));
        lb_barcode.setText("Barcode");
        lb_barcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_barcodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_barcodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_barcodeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnBarcodeLayout = new javax.swing.GroupLayout(pn_btnBarcode);
        pn_btnBarcode.setLayout(pn_btnBarcodeLayout);
        pn_btnBarcodeLayout.setHorizontalGroup(
            pn_btnBarcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBarcodeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_barcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_barcode)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnBarcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBarcodeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        pn_btnBarcodeLayout.setVerticalGroup(
            pn_btnBarcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBarcodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnBarcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_barcode, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_barcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnBarcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBarcodeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnKategori.setBackground(new java.awt.Color(17, 97, 171));

        pn_line9.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line9Layout = new javax.swing.GroupLayout(pn_line9);
        pn_line9.setLayout(pn_line9Layout);
        pn_line9Layout.setHorizontalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line9Layout.setVerticalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        icon_kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product.png"))); // NOI18N

        lb_kategori.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_kategori.setForeground(new java.awt.Color(255, 255, 255));
        lb_kategori.setText("Kategori");
        lb_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_kategoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_kategoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_kategoriMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKategoriLayout = new javax.swing.GroupLayout(pn_btnKategori);
        pn_btnKategori.setLayout(pn_btnKategoriLayout);
        pn_btnKategoriLayout.setHorizontalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icon_kategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_kategori)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        pn_btnKategoriLayout.setVerticalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_kiriLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_kiriLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5))
                            .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addComponent(pn_profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_navbar.setBackground(new java.awt.Color(255, 255, 255));
        pn_navbar.setPreferredSize(new java.awt.Dimension(1059, 60));

        icon_barMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_barMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logout.png"))); // NOI18N
        icon_barMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_barMenuMouseClicked(evt);
            }
        });

        imageProfil1.setBorderSize(0);
        imageProfil1.setImage(new javax.swing.ImageIcon(getClass().getResource("/aplikasidesktopsiloang/profile.png"))); // NOI18N

        lb_nameUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_nameUser.setForeground(new java.awt.Color(153, 153, 153));
        lb_nameUser.setText("Nama User");

        lb_level.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_level.setForeground(new java.awt.Color(153, 153, 153));
        lb_level.setText("Level");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("|");

        btn_bell.setBackground(new java.awt.Color(242, 242, 242));
        btn_bell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bellMouseClicked(evt);
            }
        });
        btn_bell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icon_barMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                .addComponent(btn_bell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_level, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_nameUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addComponent(imageProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_barMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_navbarLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_navbarLayout.createSequentialGroup()
                                .addComponent(lb_nameUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_level)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_bell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_kanan.add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_utama.setOpaque(false);
        pn_utama.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kelompok 1 Aplikasi Desktop | TIF GOL C - 2025");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_produkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseEntered
        pn_btnProduk.setBackground(new Color(28, 179, 228));
        pn_line1.setBackground(new Color(3, 78, 143));
    }//GEN-LAST:event_lb_produkMouseEntered

    private void lb_produkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseExited
        pn_btnProduk.setBackground(new Color(17, 97, 171));
        pn_line1.setBackground(new Color(17, 97, 171));
    }//GEN-LAST:event_lb_produkMouseExited

    private void lb_penjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseEntered
        pn_btnPenjualan.setBackground(new Color(28, 179, 228));
        pn_line2.setBackground(new Color(3, 78, 143));
    }//GEN-LAST:event_lb_penjualanMouseEntered

    private void lb_penjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseExited
        pn_btnPenjualan.setBackground(new Color(17, 97, 171));
        pn_line2.setBackground(new Color(17, 97, 171));
    }//GEN-LAST:event_lb_penjualanMouseExited

    private void lb_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturProduk());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_produkMouseClicked

    private void lb_penjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturPenjualan(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_penjualanMouseClicked

    private void icon_barMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_barMenuMouseClicked
        int confirmDialog = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Apakah Anda yakin ingin logout?",
                "Konfirmasi Logout",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        if (confirmDialog == javax.swing.JOptionPane.YES_OPTION) {
            // Jika user memilih Yes
            this.dispose(); // Menutup frame saat ini
            FiturLogin LoginFrame = new FiturLogin();
            LoginFrame.setVisible(true);
        }
    }//GEN-LAST:event_icon_barMenuMouseClicked

    private void lb_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturPelanggan(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_pelangganMouseClicked

    private void lb_pelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseEntered
        pn_btnPelanggan.setBackground(new Color(28, 179, 228));
        pn_line5.setBackground(new Color(3, 78, 143));
    }//GEN-LAST:event_lb_pelangganMouseEntered

    private void lb_pelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseExited
        pn_btnPelanggan.setBackground(new Color(17, 97, 171));
        pn_line5.setBackground(new Color(17, 97, 171));
    }//GEN-LAST:event_lb_pelangganMouseExited

    private void lb_barcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barcodeMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturBarcode(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_barcodeMouseClicked

    private void lb_barcodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barcodeMouseEntered
        pn_btnBarcode.setBackground(new Color(28, 179, 228));
        pn_line7.setBackground(new Color(3, 78, 143));
    }//GEN-LAST:event_lb_barcodeMouseEntered

    private void lb_barcodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barcodeMouseExited
        pn_btnBarcode.setBackground(new Color(17, 97, 171));
        pn_line7.setBackground(new Color(17, 97, 171));
    }//GEN-LAST:event_lb_barcodeMouseExited

    private void lb_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kategoriMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturKategori(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_kategoriMouseClicked

    private void lb_kategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kategoriMouseEntered
        pn_btnKategori.setBackground(new Color(28, 179, 228));
        pn_line9.setBackground(new Color(3, 78, 143));
    }//GEN-LAST:event_lb_kategoriMouseEntered

    private void lb_kategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kategoriMouseExited
        pn_btnKategori.setBackground(new Color(17, 97, 171));
        pn_line9.setBackground(new Color(17, 97, 171));
    }//GEN-LAST:event_lb_kategoriMouseExited

    private void btn_bellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bellMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bellMouseClicked

    private void btn_bellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bellActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtamaKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bell;
    private javax.swing.JLabel icon_barMenu;
    private javax.swing.JLabel icon_barcode;
    private javax.swing.JLabel icon_kategori;
    private javax.swing.JLabel icon_pelanggan;
    private javax.swing.JLabel icon_penjualan;
    private javax.swing.JLabel icon_produk;
    private aplikasidesktopsiloang.ImageProfil imageProfil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_admin;
    private javax.swing.JLabel lb_barcode;
    private javax.swing.JLabel lb_kategori;
    private javax.swing.JLabel lb_level;
    private javax.swing.JLabel lb_nameUser;
    private javax.swing.JLabel lb_pelanggan;
    private javax.swing.JLabel lb_penjualan;
    private javax.swing.JLabel lb_produk;
    private javax.swing.JLabel lb_profil;
    private javax.swing.JPanel pn_btnBarcode;
    private javax.swing.JPanel pn_btnKategori;
    private javax.swing.JPanel pn_btnPelanggan;
    private javax.swing.JPanel pn_btnPenjualan;
    private javax.swing.JPanel pn_btnProduk;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line5;
    private javax.swing.JPanel pn_line7;
    private javax.swing.JPanel pn_line9;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_profil;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void setUserInfo() {
        if (conn != null) {
            try {
                String sql = "SELECT nama, level FROM user WHERE id_user=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, userID);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    String nama = rs.getString("nama");
                    String level = rs.getString("level");

                    lb_nameUser.setText(nama);
                    lb_level.setText(level);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean sidebarVisible = true;
    private final int SIDEBAR_WIDTH = 250; // Sesuaikan dengan lebar sidebar yang sebenarnya
    private Timer animationTimer;

    public void toggleSidebar() {
        if (animationTimer != null && animationTimer.isRunning()) {
            return; // Mencegah klik berulang selama animasi berjalan
        }

        final int startX = pn_kiri.getX();
        final int targetX = sidebarVisible ? -SIDEBAR_WIDTH : 0;
        final int steps = 20; // Jumlah langkah animasi
        final int delay = 10; // Jeda antar langkah dalam milidetik
        final int increment = (targetX - startX) / steps;

        animationTimer = new Timer(delay, new ActionListener() {
            int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (step < steps) {
                    int newX = startX + (increment * step);
                    pn_kiri.setLocation(newX, pn_kiri.getY());

                    // Menyesuaikan posisi dan lebar panel utama
                    int mainPanelWidth = getWidth() - (sidebarVisible ? 0 : SIDEBAR_WIDTH);
                    pn_utama.setLocation(sidebarVisible ? 0 : SIDEBAR_WIDTH, pn_utama.getY());
                    pn_utama.setSize(mainPanelWidth, pn_utama.getHeight());

                    revalidate();
                    repaint();
                    step++;
                } else {
                    sidebarVisible = !sidebarVisible;
                    animationTimer.stop();
                }
            }
        });

        animationTimer.start();
    }

    private void setWhiteSidebarIcons() {
        int iconSize = 20;

        FlatSVGIcon produkIcon = new FlatSVGIcon("icons/produk.svg");
        produkIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
        icon_produk.setIcon(produkIcon.derive(iconSize, iconSize));

        FlatSVGIcon categoryIcon = new FlatSVGIcon("icons/category.svg");
        categoryIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
        icon_kategori.setIcon(categoryIcon.derive(iconSize, iconSize));

        FlatSVGIcon barcodeIcon = new FlatSVGIcon("icons/barcode.svg");
        barcodeIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
        icon_barcode.setIcon(barcodeIcon.derive(iconSize, iconSize));

        FlatSVGIcon pelangganIcon = new FlatSVGIcon("icons/pelanggan.svg");
        pelangganIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
        icon_pelanggan.setIcon(pelangganIcon.derive(iconSize, iconSize));

        FlatSVGIcon penjualanIcon = new FlatSVGIcon("icons/penjualan.svg");
        penjualanIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
        icon_penjualan.setIcon(penjualanIcon.derive(iconSize, iconSize));
    }

    private void setBlueSidebarIcons() {
        int iconSize = 20;

        FlatSVGIcon logoutIcon = new FlatSVGIcon("icons/menu.svg");
        logoutIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        icon_barMenu.setIcon(logoutIcon.derive(iconSize, iconSize));
    }

    private void setButtonIcons() {
        int iconSize = 18;
        Color iconColor = new Color(153, 153, 153);

        btn_bell.setIcon(createSVGIcon("icons/bell.svg", iconSize, iconColor));
        //btn_email.setIcon(createSVGIcon("icons/email.svg", iconSize, iconColor));
    }
    
    private FlatSVGIcon createSVGIcon(String path, int size, Color color) {
        FlatSVGIcon icon = new FlatSVGIcon(path).derive(size, size);
        icon.setColorFilter(new FlatSVGIcon.ColorFilter(c -> color));
        return icon;
    }
}
