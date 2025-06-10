package Pertemuan_15;
//Latihan 2-1
import javax.swing.*;
import java.awt.event.*;

public class ProgramStudiKasus {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Penjumlahan");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat text field
        JTextField field1 = new JTextField();
        field1.setBounds(50, 20, 200, 30);
        frame.add(field1);

        JTextField field2 = new JTextField();
        field2.setBounds(50, 60, 200, 30);
        frame.add(field2);

        // Membuat tombol
        JButton btnJumlah = new JButton("Jumlah");
        btnJumlah.setBounds(100, 100, 100, 30);
        frame.add(btnJumlah);

        // Aksi tombol
        btnJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int nilai1 = Integer.parseInt(field1.getText());
                    int nilai2 = Integer.parseInt(field2.getText());
                    int hasil = nilai1 + nilai2;
                    JOptionPane.showMessageDialog(frame, "Jumlah: " + hasil);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}
