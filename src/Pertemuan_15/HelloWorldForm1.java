package Pertemuan_15;
// Latihan 1-1
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {
    private JLabel label;

    public HelloWorldForm1() {
        label = new JLabel();
        label.setText("Hello world!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
