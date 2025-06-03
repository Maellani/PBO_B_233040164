package Pertemuan_11;

//T_Kopi adalah kelas turunan dari T_Minuman dan mengimplementasikan interface T_SuhuMinum.
public class T_Kopi extends T_Minuman implements T_SuhuMinum {

	//Mengimplementasikan method sajikan() dari T_Minuman.
    @Override
    public void sajikan() {
        System.out.println("Menyeduh kopi dengan air panas dan sajikan dalam cangkir.");
    }

    //Mengimplementasikan method suhuTerbaik() dari interface T_SuhuMinum.
    @Override
    public String suhuTerbaik() {
        return "Disajikan pada suhu sekitar 80°C.";
    }
}

