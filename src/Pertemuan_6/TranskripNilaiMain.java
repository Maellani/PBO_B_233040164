package Pertemuan_6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create Objek Matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, "Fajar Darmawan, S.T., M.Kom");
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Dr. Ir. Leony Lidya, M.T.");
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Siroj Nur Ulum, S.T., M.T.");

        // Create Objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("20222", mhs);
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Create Objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}
