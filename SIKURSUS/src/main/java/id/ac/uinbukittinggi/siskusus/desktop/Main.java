package id.ac.uinbukittinggi.siskusus.desktop;

import javax.swing.SwingUtilities;
import view.LoginFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new LoginFrame().setVisible(true));
    }
}