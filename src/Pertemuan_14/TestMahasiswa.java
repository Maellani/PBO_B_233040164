package Pertemuan_14;

public class TestMahasiswa {
 public static void main(String[] args) {
     Mahasiswa m1 = new Mahasiswa("233040082", "Amaliyah");
     Mahasiswa m2 = new Mahasiswa("233040103", "Dwi");
     Mahasiswa m3 = new Mahasiswa("233040164", "Maelani");

     m1.displayInfo();
     m2.displayInfo();
     m3.displayInfo();

     System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
 }
}
