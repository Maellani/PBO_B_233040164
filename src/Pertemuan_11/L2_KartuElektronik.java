package Pertemuan_11;

//Kelas KartuElektronik mengimplementasikan interface Kartu
public class L2_KartuElektronik implements L2_Kartu {
 private String kodeBank; // atribut kode bank
 private String pin;      // atribut PIN

 // Konstruktor untuk mengisi kodeBank dan pin saat objek dibuat
 public L2_KartuElektronik(String kodeBank, String pin) {
     super();
     this.kodeBank = kodeBank;
     this.pin = pin;
 }

 // Implementasi method otentikasi: cek apakah input PIN sama dengan PIN yang tersimpan
 @Override
 public boolean otentikasi(String pinInput) {
     if (pin.equals(pinInput))
         return true;  // PIN cocok, otentikasi berhasil
     else
         return false; // PIN tidak cocok, otentikasi gagal
 }

 // Implementasi method encode, saat ini belum ada enkripsi, hanya mengembalikan null
 @Override
 public String encode(String pin) {
     // tempat untuk melakukan enkripsi PIN (belum diimplementasikan)
     return null;
 }
}
