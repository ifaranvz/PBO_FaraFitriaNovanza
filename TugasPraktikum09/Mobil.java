package TugasPraktikum09;

public class Mobil implements Moveable {

    @Override
    public void berjalan() {
        System.out.println("Mobil sedang berjalan");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti");
    }

    public void startEngine() {
        System.out.println("Mesin mobil dinyalakan");
    }
}