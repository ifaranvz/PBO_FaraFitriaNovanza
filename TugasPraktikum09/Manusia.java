package TugasPraktikum09;

public class Manusia implements Moveable {

    @Override
    public void berjalan() {
        System.out.println("Manusia sedang berjalan");
    }

    @Override
    public void berhenti() {
        System.out.println("Manusia berhenti berjalan");
    }

    public void bernapas() {
        System.out.println("Manusia sedang bernapas");
    }
}