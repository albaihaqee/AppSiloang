package service;

import javax.swing.JPanel;

public interface ServiceReport {
    void cetakBarcode (JPanel pn, String barcode);
    void printBarcode (String barcode);
}
