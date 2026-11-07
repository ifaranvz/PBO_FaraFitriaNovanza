package Praktikum09;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.harga = 3500000;
        kulkas.warna = "Silver";
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.harga = 5000000;
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 10;
        tv.naikkanVolume();

        System.out.println("=== Info Kulkas ===");
        System.out.println(kulkas.getInfo());

        System.out.println();

        System.out.println("=== Info TV ===");
        System.out.println(tv.getInfo());
    }
}