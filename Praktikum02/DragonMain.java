package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        
        // instansiasi objek pertama yaitu dragon1
        Dragon dragon1 = new Dragon();
        System.out.println("Status awal dragon1:");
        dragon1.printStatus();

        // dragon1 bergerak 5 steps
        dragon1.move(5); 
        System.out.println("Setelah dragon1 bergerak ke atas 5 langkah:");
        dragon1.printStatus();

        // dragon1 ganti ke arah kanan
        dragon1.changeDirection(2); 
        // dragon 1 bergerak 3 steps
        dragon1.move(3);
        System.out.println("Setelah dragon1 bergerak ke kanan 3 langkah");
        dragon1.printStatus();

        // instansiasi objek kedua yaitu dragon2
        Dragon dragon2 = new Dragon();
        System.out.println("Status awal dragon2:");
        dragon2.printStatus();

        // dragon2 ganti ke arah kiri
        dragon2.changeDirection(4);
        // dragon2 bergerak 2 steps
        dragon2.move(2);
        System.out.println("Setelah dragon2 bergerak ke kiri 2 langkah");
        dragon2.printStatus();

        // kalau dragon2 bergerak ke arah (direction) yang salah
        dragon2.changeDirection(7);
        dragon2.printStatus();
    }
}
