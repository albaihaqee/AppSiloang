package view;

import Config.Koneksi;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.BasicStroke;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JOptionPane;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.data.general.DefaultPieDataset;

public class FiturDashboard extends javax.swing.JPanel {

    private final Connection conn;

    public FiturDashboard() {
        initComponents();
        conn = Koneksi.getConnection();
        tampilDashboard();
        updateStockChart();
        updateChart();
        
        FlatSVGIcon dashboardIcon = new FlatSVGIcon("icons/dashboard.svg").derive(15, 15);
        dashboardIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> new Color(17, 97, 171)));
        lb_dashboard.setIcon(dashboardIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lb_jumlahProduk = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_totalTransaksi = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_totalPemasukan = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_jumlahPelanggan = new javax.swing.JLabel();
        pn_chart = new javax.swing.JPanel();
        pn_ringchart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Data Master > Dashboard");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Ringkasan");

        lb_dashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dashboard15px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_jmlproduk.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lb_jumlahProduk.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_jumlahProduk.setText("0");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Jumlah");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("Produk");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(lb_jumlahProduk))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel15)
                .addGap(10, 10, 10)
                .addComponent(lb_jumlahProduk)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_troli.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Transaksi");

        lb_totalTransaksi.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_totalTransaksi.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(lb_totalTransaksi))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(lb_totalTransaksi)
                .addGap(10, 10, 10))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(204, 0, 204));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_totPemasukan.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 204));
        jLabel12.setText("Total");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 204));
        jLabel13.setText("Pemasukan");

        lb_totalPemasukan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_totalPemasukan.setText("0");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Rp.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel17)
                            .addGap(3, 3, 3)
                            .addComponent(lb_totalPemasukan))
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(jLabel13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_totalPemasukan))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel17)))
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(102, 204, 0));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_jmlPelanggan.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 204, 0));
        jLabel14.setText("Jumlah");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 204, 0));
        jLabel16.setText("Pelanggan");

        lb_jumlahPelanggan.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_jumlahPelanggan.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(lb_jumlahPelanggan))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addComponent(lb_jumlahPelanggan)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pn_chartLayout = new javax.swing.GroupLayout(pn_chart);
        pn_chart.setLayout(pn_chartLayout);
        pn_chartLayout.setHorizontalGroup(
            pn_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_chartLayout.setVerticalGroup(
            pn_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_ringchartLayout = new javax.swing.GroupLayout(pn_ringchart);
        pn_ringchart.setLayout(pn_ringchartLayout);
        pn_ringchartLayout.setHorizontalGroup(
            pn_ringchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_ringchartLayout.setVerticalGroup(
            pn_ringchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Transaksi Terbaru");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lb_dashboard)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pn_chart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pn_ringchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lb_dashboard)))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_ringchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lb_dashboard;
    private javax.swing.JLabel lb_jumlahPelanggan;
    private javax.swing.JLabel lb_jumlahProduk;
    private javax.swing.JLabel lb_totalPemasukan;
    private javax.swing.JLabel lb_totalTransaksi;
    private javax.swing.JPanel pn_chart;
    private javax.swing.JPanel pn_ringchart;
    // End of variables declaration//GEN-END:variables

    private void tampilDashboard() {
        try {
            String sqlProduk = "SELECT COUNT(*) AS jumlah_produk FROM produk";
            PreparedStatement st = conn.prepareStatement(sqlProduk);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int jumlahProduk = rs.getInt("jumlah_produk");
                lb_jumlahProduk.setText(String.valueOf(jumlahProduk));
            }

            String sqlPelanggan = "SELECT COUNT(*) AS jumlah_pelanggan FROM pelanggan";
            PreparedStatement stm = conn.prepareStatement(sqlPelanggan);
            ResultSet set = stm.executeQuery();

            if (set.next()) {
                int jumlahPelanggan = set.getInt("jumlah_pelanggan");
                lb_jumlahPelanggan.setText(String.valueOf(jumlahPelanggan));
            }

            String sqlPenjualan = "SELECT COUNT(*) AS total_transaksi FROM penjualan";
            PreparedStatement pst = conn.prepareStatement(sqlPenjualan);
            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                int totalTransaksi = rst.getInt("total_transaksi");
                lb_totalTransaksi.setText(String.valueOf(totalTransaksi));
            }

            String sqlPemasukan = "SELECT SUM(laba_kotor) AS total_laba_kotor "
                    + "FROM (SELECT DATE_FORMAT(tanggal_transaksi, '%b') AS bulan, "
                    + "SUM(CASE WHEN jenis_transaksi = 'penjualan' THEN total_harga ELSE -total_harga END) AS laba_kotor "
                    + "FROM (SELECT tanggal_transaksi, total_harga, 'penjualan' AS jenis_transaksi FROM penjualan "
                    + "UNION ALL SELECT tanggal_transaksi, total_harga, 'pembelian' AS jenis_transaksi FROM pembelian) "
                    + "AS gabungan WHERE YEAR(tanggal_transaksi) = YEAR(CURDATE()) GROUP BY bulan) AS laba_per_bulan";

            PreparedStatement pstm = conn.prepareStatement(sqlPemasukan);
            ResultSet res = pstm.executeQuery();
            if (res.next()) {
                int totalPemasukan = res.getInt("total_laba_kotor");
                DecimalFormat formatter = new DecimalFormat("#,###");
                String formattedPemasukan = formatter.format(totalPemasukan);
                lb_totalPemasukan.setText(formattedPemasukan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error saat menampilkan dashboard: " + e.getMessage());
        }
    }

 private static final String[] BULAN_INDONESIA = {
    "Januari", "Februari", "Maret", "April", "Mei", "Juni",
    "Juli", "Agustus", "September", "Oktober", "November", "Desember"
};

private DefaultCategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    try {
        String query = "SELECT MONTH(tanggal_transaksi) AS bulan, COUNT(*) AS jumlah_penjualan "
                + "FROM penjualan WHERE YEAR(tanggal_transaksi) = YEAR(CURDATE()) "
                + "GROUP BY MONTH(tanggal_transaksi) "
                + "ORDER BY bulan";

        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rst = pst.executeQuery();

        while (rst.next()) {
            int bulan = rst.getInt("bulan");
            String namaBulan = BULAN_INDONESIA[bulan - 1]; // konversi angka ke nama bulan Indonesia
            dataset.addValue(rst.getInt("jumlah_penjualan"), "Penjualan", namaBulan);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saat mengambil data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return dataset;
}


    // 🔹 MEMBUAT GRAFIK DENGAN GRADIENT AREA YANG RAPAT & SMOOTH
 private JFreeChart createChart(CategoryDataset dataset) {
        // 1. Buat Line Chart dasar dengan tampilan yang lebih premium
        JFreeChart chart = ChartFactory.createLineChart(
                "Statistik Penjualan Bulanan", // Judul grafik
                "Bulan", // Label sumbu X
                "Jumlah Transaksi", // Label sumbu Y
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false
        );

        // 2. Anti-aliasing & latar belakang dengan gradien premium
        chart.setAntiAlias(true);
        chart.setTextAntiAlias(true);
        chart.setBorderVisible(false);

        // Background gradien dengan efek mewah
        GradientPaint chartBgGradient = new GradientPaint(
                0, 0, new Color(252, 252, 255),
                0, getHeight(), new Color(248, 250, 255)
        );
        chart.setBackgroundPaint(chartBgGradient);

        // Title panel dengan efek bayangan
        chart.getTitle().setPaint(new Color(40, 40, 80));
        chart.getTitle().setMargin(new RectangleInsets(12, 0, 15, 0));

        // 3. Kustomisasi Plot dengan efek tiga dimensi 
        CategoryPlot plot = chart.getCategoryPlot();

        // Background gradien dengan warna yang lebih modern
        GradientPaint plotBgGradient = new GradientPaint(
                0, 0, new Color(248, 250, 255),
                0, getHeight(), new Color(245, 248, 255)
        );
        plot.setBackgroundPaint(plotBgGradient);

        // Garis pinggir dan grid yang lebih menarik
        plot.setOutlineVisible(false);
        plot.setRangeGridlinePaint(new Color(230, 230, 240));
        plot.setDomainGridlinePaint(new Color(230, 230, 240));
        plot.setRangeGridlineStroke(new BasicStroke(0.8f));
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinesVisible(true);

        // Warna utama untuk chart (biru modern dengan sentuhan gradien)
        Color mainColor = new Color(41, 128, 255);
        Color accentColor = new Color(41, 185, 255);

        // Padding untuk chart
        plot.setInsets(new RectangleInsets(10, 10, 10, 10));

        // 4. Renderer: menggunakan kurva melengkung yang lebih natural dan lembut
        // Kelas khusus untuk garis melengkung yang lebih halus
        CategoryItemRenderer smoothRenderer = new LineAndShapeRenderer() {

            protected void drawPrimaryLine(Graphics2D g2, CategoryItemRendererState state,
                    Rectangle2D dataArea, CategoryPlot plot,
                    CategoryAxis domainAxis, ValueAxis rangeAxis,
                    CategoryDataset dataset, int row, int column) {

                // Hanya gambar garis jika ada data berikutnya
                if (column < dataset.getColumnCount() - 1) {
                    Number v1 = dataset.getValue(row, column);
                    Number v2 = dataset.getValue(row, column + 1);

                    if (v1 != null && v2 != null) {
                        double x1 = domainAxis.getCategoryMiddle(column, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
                        double y1 = rangeAxis.valueToJava2D(v1.doubleValue(), dataArea, plot.getRangeAxisEdge());

                        double x2 = domainAxis.getCategoryMiddle(column + 1, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
                        double y2 = rangeAxis.valueToJava2D(v2.doubleValue(), dataArea, plot.getRangeAxisEdge());

                        // Menghitung titik kontrol untuk kurva Bezier yang lebih natural
                        // Menggunakan tension factor untuk kurva yang lebih natural
                        double tension = 0.4; // Faktor ketegangan kurva (0-1)
                        double controlDistance = (x2 - x1) * tension;

                        double ctrlX1 = x1 + controlDistance;
                        double ctrlY1 = y1;
                        double ctrlX2 = x2 - controlDistance;
                        double ctrlY2 = y2;

                        // Membuat dan menggambar kurva Bezier cubic dengan shadow
                        Path2D path = new Path2D.Double();
                        path.moveTo(x1, y1);
                        path.curveTo(ctrlX1, ctrlY1, ctrlX2, ctrlY2, x2, y2);

                        // Tambahkan bayangan untuk efek 3D
                        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                        // Efek bayangan (shadow)
                        g2.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        g2.setPaint(new Color(mainColor.getRed(), mainColor.getGreen(), mainColor.getBlue(), 40));
                        g2.translate(0.5, 0.5);
                        g2.draw(path);
                        g2.translate(-0.5, -0.5);

                        // Garis utama dengan stroke yang lebih halus
                        g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

                        // Menggunakan gradient untuk garis
                        GradientPaint linePaint = new GradientPaint(
                                (float) x1, (float) y1, mainColor,
                                (float) x2, (float) y2, accentColor
                        );
                        g2.setPaint(linePaint);
                        g2.draw(path);
                    }
                }
            }

            @Override
            public void drawItem(Graphics2D g2, CategoryItemRendererState state,
                    Rectangle2D dataArea, CategoryPlot plot,
                    CategoryAxis domainAxis, ValueAxis rangeAxis,
                    CategoryDataset dataset, int row, int column,
                    int pass) {

                // Gambar garis terlebih dahulu
                if (pass == 0) {
                    drawPrimaryLine(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column);
                }

                // Gambar titik/marker
                if (pass == 1) {
                    Number v = dataset.getValue(row, column);
                    if (v != null) {
                        double x = domainAxis.getCategoryMiddle(column, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
                        double y = rangeAxis.valueToJava2D(v.doubleValue(), dataArea, plot.getRangeAxisEdge());

                        // Marker dengan efek bayangan dan multi-layer
                        Shape dot = new Ellipse2D.Double(x - 4, y - 4, 8, 8);

                        // Outer glow effect
                        g2.setPaint(new Color(mainColor.getRed(), mainColor.getGreen(), mainColor.getBlue(), 30));
                        g2.fill(new Ellipse2D.Double(x - 7, y - 7, 14, 14));

                        // Inner dot with gradient
                        RadialGradientPaint dotPaint = new RadialGradientPaint(
                                new Point2D.Double(x, y), 4f,
                                new float[]{0.0f, 1.0f},
                                new Color[]{
                                    new Color(255, 255, 255),
                                    mainColor
                                }
                        );
                        g2.setPaint(dotPaint);
                        g2.fill(dot);

                        // Dot border
                        g2.setStroke(new BasicStroke(1.0f));
                        g2.setPaint(new Color(mainColor.getRed(), mainColor.getGreen(), mainColor.getBlue(), 180));
                        g2.draw(dot);
                    }
                }
            }
        };

        // 5. Fill gradien di bawah kurva (efek 3D, lebih menarik)
        // Gradien dengan warna yang lebih menarik
        Color fillStartColor = new Color(41, 128, 255, 110);
        Color fillEndColor = new Color(41, 128, 255, 5);

        // Gradient bertingkat untuk area di bawah kurva
        AreaRenderer areaRenderer = new AreaRenderer() {
          
            public void drawItem(Graphics2D g2, CategoryItemRendererState state,
                    Rectangle2D dataArea, CategoryPlot plot,
                    CategoryAxis domainAxis, ValueAxis rangeAxis,
                    CategoryDataset dataset, int row, int column, int pass) {

                if (column < dataset.getColumnCount() - 1) {
                    Number v1 = dataset.getValue(row, column);
                    Number v2 = dataset.getValue(row, column + 1);

                    if (v1 != null && v2 != null) {
                        double x1 = domainAxis.getCategoryMiddle(column, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
                        double y1 = rangeAxis.valueToJava2D(v1.doubleValue(), dataArea, plot.getRangeAxisEdge());

                        double x2 = domainAxis.getCategoryMiddle(column + 1, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
                        double y2 = rangeAxis.valueToJava2D(v2.doubleValue(), dataArea, plot.getRangeAxisEdge());

                        // Titik kontrol untuk kurva Bezier yang lebih natural
                        double tension = 0.4;
                        double controlDistance = (x2 - x1) * tension;

                        double ctrlX1 = x1 + controlDistance;
                        double ctrlY1 = y1;
                        double ctrlX2 = x2 - controlDistance;
                        double ctrlY2 = y2;

                        // Membuat path untuk area
                        Path2D path = new Path2D.Double();
                        path.moveTo(x1, y1);
                        path.curveTo(ctrlX1, ctrlY1, ctrlX2, ctrlY2, x2, y2);
                        path.lineTo(x2, dataArea.getMaxY());
                        path.lineTo(x1, dataArea.getMaxY());
                        path.closePath();

                        // Menggunakan gradient linear untuk area
                        GradientPaint fillGradient = new GradientPaint(
                                0f, (float) y1, fillStartColor,
                                0f, (float) dataArea.getMaxY(), fillEndColor
                        );

                        g2.setPaint(fillGradient);
                        g2.fill(path);
                    }
                }
            }
        };

        // 6. Tooltips informatif saat hover dengan format yang lebih baik
        StandardCategoryToolTipGenerator tooltipGenerator = new StandardCategoryToolTipGenerator(
                "<html><b>{1}</b>: {2} transaksi</html>", NumberFormat.getIntegerInstance()
        );

        smoothRenderer.setDefaultToolTipGenerator(tooltipGenerator);

        // 7. Axis kustomisasi untuk tampilan yang lebih premium
        // Sumbu X (Domain)
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setLowerMargin(0.05);
        domainAxis.setUpperMargin(0.05);
        
        // Menggunakan STANDARD untuk label horizontal
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        
        // Menonaktifkan tick marks karena kita akan menggunakan titik biru
        domainAxis.setTickMarksVisible(false);
        
        // Mengatur alignment ke tengah
        if (domainAxis instanceof CategoryAxis) {
            CategoryAxis catAxis = (CategoryAxis) domainAxis;
            catAxis.setCategoryMargin(0.0);  // Mengurangi margin antar kategori
            catAxis.setMaximumCategoryLabelLines(1);
            catAxis.setCategoryLabelPositionOffset(5);  // Memberikan sedikit ruang untuk dot
        }
        
        domainAxis.setAxisLineVisible(true);
        domainAxis.setAxisLinePaint(new Color(200, 200, 210));
        
        // 8. Custom Domain Axis with blue circles for month labels
        CategoryAxis customDomainAxis = new CategoryAxis("Bulan") {
            public void drawCategoryLabels(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge) {
                // First draw original labels
                // Now draw blue circles above each month label
                CategoryPlot plot = (CategoryPlot) getPlot();
                if (plot == null) return;
                
                CategoryDataset dataset = plot.getDataset();
                if (dataset == null) return;
                
                // Define blue circle color
                Color dotColor = new Color(33, 150, 243); // Material blue color
                
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Get all category positions
                for (int categoryIndex = 0; categoryIndex < dataset.getColumnCount(); categoryIndex++) {
                    double x = getCategoryMiddle(categoryIndex, dataset.getColumnCount(), dataArea, edge);
                    double y = dataArea.getMaxY() + 5; // 5 pixels below the x-axis
                    
                    // Draw filled circle
                    Ellipse2D circle = new Ellipse2D.Double(x - 3, y, 6, 6);
                    g2.setPaint(dotColor);
                    g2.fill(circle);
                    
                    // Draw circle border for better visibility
                    g2.setPaint(new Color(0, 100, 200));
                    g2.setStroke(new BasicStroke(0.8f));
                    g2.draw(circle);
                }
            }
        };
        
        // Apply font and styling to custom domain axis
        customDomainAxis.setLabelFont(new Font("Segoe UI", Font.PLAIN, 12));
        customDomainAxis.setTickLabelFont(new Font("Segoe UI", Font.PLAIN, 11));
        customDomainAxis.setLabelPaint(new Color(70, 70, 90));
        customDomainAxis.setTickLabelPaint(new Color(70, 70, 90));
        customDomainAxis.setLowerMargin(0.05);
        customDomainAxis.setUpperMargin(0.05);
        customDomainAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        
        // Replace the default domain axis with our custom one
        plot.setDomainAxis(customDomainAxis);

        // Sumbu Y (Range)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setAxisLineVisible(true);
        rangeAxis.setAxisLinePaint(new Color(200, 200, 210));
        rangeAxis.setTickMarkInsideLength(2.0f);
        rangeAxis.setTickMarkOutsideLength(0.0f);
        rangeAxis.setMinorTickCount(2);
        rangeAxis.setMinorTickMarksVisible(true);

        // 9. Gunakan layered renderer untuk menggabungkan area dan garis
        // Area di bawah kurva terlebih dahulu
        plot.setRenderer(0, areaRenderer);
        // Kurva melengkung di atasnya
        plot.setRenderer(1, smoothRenderer);
        plot.setDataset(1, dataset);

        // 10. Font modern & bersih dengan warna yang menarik
        Font titleFont = new Font("Segoe UI", Font.BOLD, 16);
        Font labelFont = new Font("Segoe UI", Font.PLAIN, 12);
        Font tickFont = new Font("Segoe UI", Font.PLAIN, 11);

        chart.getTitle().setFont(titleFont);
        customDomainAxis.setLabelFont(labelFont);
        customDomainAxis.setTickLabelFont(tickFont);
        customDomainAxis.setLabelPaint(new Color(70, 70, 90));
        customDomainAxis.setTickLabelPaint(new Color(70, 70, 90));

        plot.getRangeAxis().setLabelFont(labelFont);
        plot.getRangeAxis().setTickLabelFont(tickFont);
        plot.getRangeAxis().setLabelPaint(new Color(70, 70, 90));
        plot.getRangeAxis().setTickLabelPaint(new Color(70, 70, 90));

        // 11. Border dan padding
        chart.setPadding(new RectangleInsets(10, 10, 10, 10));

        return chart;
    }
    

    private void updateChart() {
        // Dataset statis asli
        DefaultCategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(pn_chart.getWidth(), pn_chart.getHeight()));

        pn_chart.removeAll();
        pn_chart.setLayout(new BorderLayout());
        pn_chart.add(chartPanel, BorderLayout.CENTER);
        pn_chart.revalidate();
        pn_chart.repaint();
    }
    
    private DefaultPieDataset createStockDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            // Ambil nilai stok dari database
            String query = "SELECT stok FROM `produk` WHERE id_produk = 'SL001'";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                double currentStock = rst.getDouble("stok");
                double maxStock = 2000;

                // Gunakan nilai aktual
                double available = Math.min(currentStock, maxStock);
                double remaining = maxStock - available;

                dataset.setValue("Tersedia (" + (int)available + ")", available);
                dataset.setValue("Sisa Kapasitas (" + (int)remaining + ")", remaining);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat mengambil data stok: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return dataset;
    }
    private JFreeChart createRingChart(DefaultPieDataset dataset) {
         JFreeChart chart = ChartFactory.createRingChart(
            "Volume Stok Air", // Judul
            dataset,
            true,  // legenda
            true,  // tooltips
            false  // URL
        );

        // Anti-aliasing & styling dasar
        chart.setAntiAlias(true);
        chart.setTextAntiAlias(true);
        chart.setBorderVisible(false);

        // Background dengan gradien
        GradientPaint chartBgGradient = new GradientPaint(
            0, 0, new Color(252, 252, 255),
            0, 500, new Color(248, 250, 255)
        );
        chart.setBackgroundPaint(chartBgGradient);

        // Kustomisasi judul
        chart.getTitle().setPaint(new Color(40, 40, 80));
        chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, 16));

        // Konfigurasi RingPlot
        RingPlot plot = (RingPlot) chart.getPlot();
        plot.setSectionDepth(0.35);
        plot.setCircular(true);
        plot.setLabelGap(0.02);
        plot.setSectionOutlinesVisible(false);
        plot.setShadowPaint(new Color(200, 200, 200, 80));

        // Threshold dan warna dinamis
        double threshold = 500.0;
        for (Object keyObj : dataset.getKeys()) {
            String key = keyObj.toString();
            Number value = dataset.getValue(key);
            if (key.startsWith("Tersedia") && value != null) {
                // jika stok tersedia < 500 → merah, else biru
                if (value.doubleValue() < threshold) {
                    plot.setSectionPaint(key, new Color(244, 67, 54));   // Merah (#F44336)
                } else {
                    plot.setSectionPaint(key, new Color(33, 150, 243));  // Biru (#2196F3)
                }
            } else if (key.startsWith("Sisa Kapasitas")) {
                plot.setSectionPaint(key, new Color(224, 224, 224));    // Abu-abu
            }
        }

        // Label di dalam chart dengan format persentase
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
            "{0}", NumberFormat.getIntegerInstance(), new DecimalFormat("0.0%")
        ));
        plot.setLabelBackgroundPaint(new Color(255, 255, 255, 200));
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setLabelFont(new Font("Segoe UI", Font.PLAIN, 12));

        // Sisa konfigurasi
        plot.setBackgroundPaint(Color.white);
        plot.setOutlineVisible(false);
        plot.setNoDataMessage("Tidak ada data");

        return chart;
    }
    private void updateStockChart() {
        DefaultPieDataset dataset = createStockDataset();
        JFreeChart chart = createRingChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(pn_ringchart.getWidth(), pn_ringchart.getHeight()));

        pn_ringchart.removeAll();
        pn_ringchart.setLayout(new BorderLayout());
        pn_ringchart.add(chartPanel, BorderLayout.CENTER);
        pn_ringchart.revalidate();
        pn_ringchart.repaint();
    }

    public class AnimatedBarRenderer extends BarRenderer {

        private double fraction = 0.0;

        public void setFraction(double fraction) {
            this.fraction = fraction;
        }

        private void setWhiteSidebarIcons() {
            int iconSize = 35; // Ukuran ikon 40x40 piksel

            FlatSVGIcon jmlProdukIcon = new FlatSVGIcon("icons/jmlProduk.svg");
            jmlProdukIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
            jLabel5.setIcon(jmlProdukIcon.derive(iconSize, iconSize));

            FlatSVGIcon jmlPelanggan = new FlatSVGIcon("icons/jmlPelanggan.svg");
            jmlPelanggan.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
            jLabel9.setIcon(jmlPelanggan.derive(iconSize, iconSize));

            FlatSVGIcon totTransaksiIcon = new FlatSVGIcon("icons/totalTransaksi.svg");
            totTransaksiIcon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
            jLabel6.setIcon(totTransaksiIcon.derive(iconSize, iconSize));

            FlatSVGIcon totIncome = new FlatSVGIcon("icons/totalIncome.svg");
            totIncome.setColorFilter(new FlatSVGIcon.ColorFilter(color -> Color.WHITE));
            jLabel7.setIcon(totIncome.derive(iconSize, iconSize));
        }

    }
}
