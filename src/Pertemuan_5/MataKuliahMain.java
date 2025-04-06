package Pertemuan_5;

public class MataKuliahMain {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Menampilkan daftar mata kuliah
        System.out.println("--- DAFTAR MATA KULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        // Menghitung IPK
        double totalNilai = (mk1.nilaiIndex() * mk1.getSks()) +
                            (mk2.nilaiIndex() * mk2.getSks()) +
                            (mk3.nilaiIndex() * mk3.getSks());
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalNilai / totalSks;

        // Menampilkan IPK
        System.out.println("\n--- NILAI IPK ---");
        System.out.println("IPK: " + ipk);
    }
}
