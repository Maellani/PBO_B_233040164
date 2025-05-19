package Pertemuan_11;

public class T_Teh extends T_Minuman implements T_SuhuMinum {

    @Override
    public void sajikan() {
        System.out.println("Seduh teh dalam air panas selama 3 menit, lalu sajikan.");
    }

    @Override
    public String suhuTerbaik() {
        return "Dapat disajikan hangat atau dingin.";
    }
}

