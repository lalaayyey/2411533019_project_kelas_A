package ui;

import javax.swing.*;
import java.awt.Panel;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    public MainFrame() {
        // Judul frame
        setTitle("Halaman Utama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Untuk tes langsung MainFrame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
