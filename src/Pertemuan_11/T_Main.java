package Pertemuan_11;

public class T_Main {
    public static void main(String[] args) {
        T_Minuman kopi = new T_Kopi();
        T_Minuman teh = new T_Teh();

        System.out.println(" -Kopi ");
        kopi.sajikan();
        System.out.println(((T_SuhuMinum)kopi).suhuTerbaik());

        System.out.println("\n -Teh ");
        teh.sajikan();
        System.out.println(((T_SuhuMinum)teh).suhuTerbaik());
    }
}

