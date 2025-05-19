package Pertemuan_11;

public class L2_InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank "IF111" dan PIN "123"
    	L2_KartuElektronik kartu = new L2_KartuElektronik("IF111", "123");

        // Menampilkan hasil otentikasi PIN "123" (harus true)
        System.out.println("Otentikasi:" + kartu.otentikasi("123"));
    }
}
