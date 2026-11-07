package Praktikum09;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nJenis Layar: " + jenisLayar +
               "\nVolume: " + volume;
    }
}