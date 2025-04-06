package Pertemuan_6;

import java.util.List;
import java.util.ArrayList;

public class KartuHasilStudi {
    private String semester;
    private Mahasiswa mahasiswa;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    //menyimpan daftar mata kuliah
    public KartuHasilStudi(String semester, Mahasiswa mahasiswa) {
        this.semester = semester;
        this.mahasiswa = mahasiswa;
        this.daftarMatakuliah = new ArrayList<>();
    }

    //Menambah matakuliah kedaftar
    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }

        return sb.toString();
    }

    //Manghitung IPS
    public void hitungIPS()
    {
        // Implementasi hitungIPS
        double totalSkor = 0;
        int totalSKS = 0;

        for (MataKuliah mk : daftarMatakuliah) {
            totalSkor += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS != 0) {
            this.ips = totalSkor / totalSKS;
        } else {
            this.ips = 0.0;
        }
    }

    /* Setter & Getter ----> mmengambil mengatur nilai*/
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<MataKuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public int getTotalSks() {
        int totalSks = 0;
        for (MataKuliah mk : daftarMatakuliah) {
            totalSks += mk.getSks();
        }
        return totalSks; // mengembalikan total sks setelah seluruh perhitungan selesai
    }
}