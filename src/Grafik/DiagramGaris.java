package Grafik;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

public class DiagramGaris extends javax.swing.JPanel {

    private DefaultCategoryDataset dataset;
    
    public DiagramGaris() {
        initComponents();
        this.dataset = new DefaultCategoryDataset();
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(240, 240, 240));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

public void setData(DefaultCategoryDataset data) {
        this.dataset = data; 
        this.removeAll(); 

        JFreeChart lineChart = createChart(dataset); // Menggunakan createChart() untuk menerapkan custom chart
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(890, 322));
        this.add(chartPanel, BorderLayout.CENTER);

        this.revalidate(); 
        this.repaint();            
    }

    public JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Grafik Penjualan", 
                "Bulan",            
                "Jumlah Penjualan", 
                dataset
        ); 

        setCustomChart(lineChart);                                                                                      
        return lineChart;
    }

    private void setCustomChart(JFreeChart chart){
        TextTitle title = new TextTitle(chart.getTitle().getText(), 
                new Font("SansSerif", Font.BOLD, 14));
        title.setPaint(Color.BLACK);
        chart.setTitle(title);

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));
        domainAxis.setTickLabelFont(new Font("SansSerif", Font.BOLD, 10));
        domainAxis.setLabelPaint(Color.BLACK);
        domainAxis.setTickLabelPaint(Color.BLACK);

        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));
        rangeAxis.setTickLabelFont(new Font("SansSerif", Font.BOLD, 10));
        rangeAxis.setLabelPaint(Color.BLACK);
        rangeAxis.setTickLabelPaint(Color.BLACK);

        plot.setBackgroundPaint(new Color(255,255,255));

        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(17, 97, 171));
        renderer.setSeriesStroke(0, new java.awt.BasicStroke(2.0f)); 

        Shape circle = new Ellipse2D.Double(-4, -4, 8, 8);  
        renderer.setSeriesShape(0, circle);
        renderer.setSeriesShapesVisible(0, true);  
        renderer.setSeriesShapesFilled(0, true);   

        renderer.setSeriesPaint(0, new Color(17, 97, 171)); 
    }
        
}
