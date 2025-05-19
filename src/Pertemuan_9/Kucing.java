package Pertemuan_9;

public class Kucing extends Hewan {
    private String warna;
    private String ras;

    public Kucing(String nama, String warna, String ras) {
        super(nama);
        this.warna = warna;
        this.ras = ras;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }
}


