package Pertemuan_11;

public class T_Kopi extends T_Minuman implements T_SuhuMinum {

    @Override
    public void sajikan() {
        System.out.println("Menyeduh kopi dengan air panas dan sajikan dalam cangkir.");
    }

    @Override
    public String suhuTerbaik() {
        return "Disajikan pada suhu sekitar 80°C.";
    }
}

