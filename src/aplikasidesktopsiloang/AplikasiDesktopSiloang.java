package aplikasidesktopsiloang;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import view.FiturLogin;

public class AplikasiDesktopSiloang {
    public static void main(String[] args) {
        FiturLogin LoginFrame = new FiturLogin();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
        FlatLightLaf.setup();

        UIManager.put("TableHeader.background", new Color(3,78,143));
        UIManager.put("TableHeader.foreground", Color.WHITE);
        UIManager.put("Table.selectionBackground", new Color(17,97,171));
        UIManager.put("Table.alternateRowColor", new Color(240,240,240));
        UIManager.put("Component.focusedBorderColor", new Color(3,78,143));
    }
}    