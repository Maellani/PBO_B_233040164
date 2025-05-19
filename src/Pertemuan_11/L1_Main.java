package Pertemuan_11;

// Program utama untuk menampilkan hasil perhitungan
public class L1_Main {
    public static void main(String[] args) {
        // Buat objek lingkaran dengan jari-jari 10
    	L1_Lingkaran lingkaran = new L1_Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJari2());  // tampilkan jari-jari
        System.out.println("luas:" + lingkaran.luas());        // tampilkan luas lingkaran

        // Buat objek tabung dengan jari-jari 10 dan tinggi 5
        L1_Tabung tabung = new L1_Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi()); // tampilkan jari-jari dan tinggi
        System.out.println("luas:" + tabung.luas()); // tampilkan luas permukaan tabung
    }
}


/*JAWABAN PERTANYAAN:
1. Method abstrak di kelas Bentuk: public abstract double luas();

2. Perbedaan method luas:
	- Di kelas Bentuk, luas() adalah abstrak (tidak ada implementasi).
	- Di kelas Lingkaran, luas() menghitung luas lingkaran.
	- Di kelas Tabung, luas() menghitung luas permukaan tabung.

3. Jika luas() di Tabung dihapus atau tidak diimplementasikan:
	Akan muncul error kompilasi, karena Tabung adalah turunan dari kelas abstrak Bentuk dan wajib mengimplementasikan semua method abstraknya.
	
4. Kelas main sudah dibuat di atas, output-nya akan seperti ini:
		== Lingkaran ==
		jari2: 10
		luas:314.0
		== Tabung ==
		jari2: 10, Tinggi:5
		luas:942.0000000000001*/
		

			