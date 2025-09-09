package ui;

import javax.swing.*;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class MainFrame extends JFrame {

    public MainFrame() {
        // Judul frame
        setTitle("Halaman Utama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("PESANAN");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton.setBounds(10, 91, 110, 43);
        getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("LAYANAN ");
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_1.setBounds(141, 91, 110, 43);
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("PELANGGAN");
        btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_2.setBounds(261, 91, 115, 43);
        getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("PENGGUNA");
        btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_3.setBounds(10, 145, 110, 43);
        getContentPane().add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("LAPORAN");
        btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_4.setBounds(141, 145, 110, 43);
        getContentPane().add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("PROFILE");
        btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_5.setBounds(261, 145, 115, 43);
        getContentPane().add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("KELUAR");
        btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnNewButton_6.setBounds(10, 205, 366, 47);
        getContentPane().add(btnNewButton_6);
        
        JLabel lblNewLabel = new JLabel("Laundry Apps");
        lblNewLabel.setForeground(new Color(0, 64, 128));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setBounds(20, 29, 129, 36);
        getContentPane().add(lblNewLabel);
    }

    // Untuk tes langsung MainFrame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
