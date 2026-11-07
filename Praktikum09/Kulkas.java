package Praktikum09;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nJumlah Pintu: " + jumlahPintu;
    }
}