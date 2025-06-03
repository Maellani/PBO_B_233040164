package Pertemuan_14;

public class Mahasiswa {
 private final String nim; // final: tidak dapat diubah setelah inisialisasi
 private String nama;

 private static int totalMahasiswa = 0; // static: milik kelas, bukan objek
 public static final int MAX_SKS = 24;  // static final: konstanta global

 // Constructor: Menginisialisasi nim dan nama, serta menambah total mahasiswa
 public Mahasiswa(String nim, String nama) {
     this.nim = nim;
     this.nama = nama;
     totalMahasiswa++; // setiap objek baru menambah jumlah total mahasiswa
 }

 // Method untuk menampilkan informasi mahasiswa
 public void displayInfo() {
     System.out.println("NIM       : " + nim);
     System.out.println("Nama      : " + nama);
     System.out.println("Max SKS   : " + MAX_SKS);
     System.out.println("--------------------------");
 }

 // Method static untuk mendapatkan jumlah total mahasiswa
 public static int getTotalMahasiswa() {
     return totalMahasiswa;
 }
}
