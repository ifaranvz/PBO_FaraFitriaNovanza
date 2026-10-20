package UTS;

public class Elektronik {
    public String nama;
    public String merk;
    public double harga;

    public Elektronik() {
        nama = "-";
        merk = "-";
        harga = 0;
    }

    public Elektronik(String nama, String merk, double harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        String info = "";
        info += "Nama  : " + nama + "\n";
        info += "Merk  : " + merk + "\n";
        info += "Harga : " + harga + "\n";

        return info;
    }
}
