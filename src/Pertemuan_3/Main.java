package Pertemuan_3;
import Pertemuan_3.Mahasiswa;

public class Main {
	public static void main(String[] args) {
		
		Mahasiswa m1 = new Mahasiswa();
		Mahasiswa m2 = new Mahasiswa();
		Mahasiswa m3 = new Mahasiswa();
		Mahasiswa m4 = new Mahasiswa();
		Mahasiswa m5 = new Mahasiswa();
		
		m1.nim="233040164";
		m1.ipk=4.00;
		
		System.out.println(m1.nim);
		System.out.println(m1.ipk);
		System.out.println(m1.statusPerwalian);
		m1.perwalian();
		System.out.println(m1.statusPerwalian);
		m1.perwalian();
		System.out.println(m1.statusPerwalian);
	}

}
