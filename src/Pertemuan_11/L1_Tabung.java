package Pertemuan_11;

// Kelas Tabung turunan dari Bentuk dan punya atribut tinggi
public class L1_Tabung extends L1_Bentuk {
    private int tinggi; // atribut tambahan: tinggi tabung

    // Konstruktor tanpa parameter
    public L1_Tabung() {
        super(0); // jari-jari diset ke 0
    }

    // Konstruktor isi jari-jari dan tinggi
    public L1_Tabung(int jari2, int tinggi) {
        super(jari2);        // set jari-jari ke superclass
        this.tinggi = tinggi; // set tinggi tabung
    }

    // Implementasi luas permukaan tabung: 2 * PHI * r * (r + t)
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Ambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Ubah nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
