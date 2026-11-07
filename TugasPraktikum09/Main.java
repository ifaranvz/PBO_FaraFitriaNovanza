package TugasPraktikum09;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        System.out.println("=== Manusia ===");
        manusia.bernapas();
        manusia.berjalan();
        manusia.berhenti();

        System.out.println();

        Mobil mobil = new Mobil();
        System.out.println("=== Mobil ===");
        mobil.startEngine();
        mobil.berjalan();
        mobil.berhenti();
    }
}