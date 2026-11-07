package Praktikum09;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return "Merk: " + merk +
               "\nHarga: " + harga +
               "\nWarna: " + warna;
    }
}