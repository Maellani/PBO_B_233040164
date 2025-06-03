package Pertemuan_14;

public class Counter {
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++; // Menambah jumlah setiap kali objek dibuat
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
