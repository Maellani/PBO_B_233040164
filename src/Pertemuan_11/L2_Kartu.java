package Pertemuan_11;

//Interface Kartu berisi dua method abstrak yang harus diimplementasikan
public interface L2_Kartu {
 // Method untuk otentikasi dengan input PIN, mengembalikan true/false
 public boolean otentikasi(String pin);

 // Method untuk encode PIN, mengembalikan String hasil encoding
 public String encode(String pin);
}
