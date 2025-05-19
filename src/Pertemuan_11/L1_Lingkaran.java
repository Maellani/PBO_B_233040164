package Pertemuan_11;

// Kelas Lingkaran turunan dari Bentuk
public class L1_Lingkaran extends L1_Bentuk {

    // Konstruktor untuk mengatur jari-jari
    public L1_Lingkaran(int jari2) {
        super(jari2); // panggil konstruktor dari Bentuk
    }

    /*
     * Mengimplementasikan rumus luas lingkaran:
     * L = PHI * r * r
     */
    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }
}
