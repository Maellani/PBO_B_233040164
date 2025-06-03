package Pertemuan_14;

public class DatabaseConnection {
    public static String connectionString;

    // Static block untuk inisialisasi yang hanya terjadi sekali
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block dijalankan: Inisialisasi connectionString berhasil.");
    }
}
