package Pertemuan_11;

// Kelas abstrak Bentuk, induk untuk bentuk lain (Lingkaran, Tabung)
public abstract class L1_Bentuk {
    protected double PHI = 3.14; // nilai phi
    protected int jari2;         // jari-jari

    // Konstruktor untuk set jari-jari
    public L1_Bentuk(int jari2) {
        this.jari2 = jari2;
    }

    // Method abstrak untuk menghitung luas (harus diisi di class turunan)
    public abstract double luas();

    // Getter jari-jari
    public int getJari2() {
        return jari2;
    }

    // Setter jari-jari
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
