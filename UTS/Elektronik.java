package UTS;

public class Elektronik {
    private String nama;
    private String merk;
    private double harga;

    public Elektronik() {
        this.nama = "-";
        this.merk = "-";
        this.harga = 0;
    }

    public Elektronik(String nama, String merk, double harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfo() {
        String info = "";
        info += "Nama  : " + this.nama + "\n";
        info += "Merk  : " + this.merk + "\n";
        info += "Harga : " + this.harga + "\n";

        return info;
    }

}