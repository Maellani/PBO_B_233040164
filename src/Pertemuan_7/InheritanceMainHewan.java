package Pertemuan_7;

public class InheritanceMainHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing("Kitty", "Putih", "Persia");
        System.out.println("Nama Kucing : " + k.getNama());
        System.out.println("Warna       : " + k.getWarna());
        System.out.println("Ras         : " + k.getRas());
    }
}


