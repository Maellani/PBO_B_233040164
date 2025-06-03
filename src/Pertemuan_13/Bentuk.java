package Pertemuan_13;

public abstract class Bentuk {
    abstract void gambar();
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar Lingkaran");
    }
}

class Tabung extends Bentuk {
    void gambar() {
        System.out.println("Menggambar Tabung");
    }
}
