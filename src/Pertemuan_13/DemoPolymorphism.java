package Pertemuan_13;

public class DemoPolymorphism {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(); // Polymorphism
        Bentuk b2 = new Tabung();    // Polymorphism

        b1.gambar(); // Output: Menggambar Lingkaran
        b2.gambar(); // Output: Menggambar Tabung
    }
}
