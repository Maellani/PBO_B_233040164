package Pertemuan_4;

public class ObjekNull {
	    public static void main(String[] args) {
	        // Membuat objek l1 dengan jari-jari 5
	        Lingkaran l1 = new Lingkaran(5);
	        Lingkaran l2 = l1; // l2 mereferensikan objek yang sama dengan l1
	        Lingkaran l3 = new Lingkaran(7); // l3 adalah objek baru dengan jari-jari 7

	        // Menampilkan jari-jari masing-masing lingkaran
	        System.out.println(l1.getJari2()); // Output: 5
	        System.out.println(l2.getJari2()); // Output: 5
	        System.out.println(l3.getJari2()); // Output: 7

	        // Mengubah referensi l2 menjadi null
	        l2 = null;

	        // Menampilkan jari-jari l1 (masih valid)
	        System.out.println(l1.getJari2()); // Output: 5

	        // Memeriksa apakah l2 masih mereferensikan objek sebelum mengaksesnya
	        if (l2 != null) {
	            System.out.println(l2.getJari2()); // Tidak akan dieksekusi karena l2 == null
	        }

	        // Menampilkan jari-jari l3
	        System.out.println(l3.getJari2()); // Output: 7
	    }
	}

