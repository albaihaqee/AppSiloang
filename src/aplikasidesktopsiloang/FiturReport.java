package aplikasidesktopsiloang;

import Config.Koneksi;
import java.awt.BorderLayout;
import service.ServiceReport;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.swing.JRViewer;

public class FiturReport implements ServiceReport {
    
    private Connection conn;
    
    public FiturReport() {
        conn = Koneksi .getConnection();
    }

    @Override
    public void cetakBarcode(JPanel pn, String barcode) {
        try {
            String reportPath = "D:\\PROJECT CODING\\aplikasiDesktopSiloang\\src\\report\\CetakBarcode.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            if (barcode != null && !barcode.trim().isEmpty()) {
                parameters.put("barcode", barcode);
            }
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //Tampil Panel
            pn.setLayout(new BorderLayout());
            pn.repaint();
            pn.add(new JRViewer(print));
            pn.revalidate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void printBarcode(String barcode) {
        try {
            String reportPath = "D:\\PROJECT CODING\\aplikasiDesktopSiloang\\src\\report\\CetakBarcode.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            if (barcode != null && !barcode.trim().isEmpty()) {
                parameters.put("barcode", barcode);
            }
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
}
