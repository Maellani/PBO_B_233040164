package Pertemuan_15;
//Latihan 1-2
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;

    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Halo Dunia!");

        add(label);
        setTitle("Program pertama");

        setSize(600, 300);
    }
}
