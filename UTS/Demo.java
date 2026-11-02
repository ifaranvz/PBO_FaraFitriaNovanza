package UTS;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Laptop Gaming", "ASUS", 5000000, "Intel Core i7");
        Laptop laptop2 = new Laptop();

        Kulkas kulkas1 = new Kulkas("Kulkas 2 Pintu", "Sharp", 3000000, 5);
        Kulkas kulkas2 = new Kulkas();

        System.out.println(laptop1.getInfo());
        System.out.println(laptop2.getInfo());
        System.out.println(kulkas1.getInfo());
        System.out.println(kulkas2.getInfo());

        System.out.println("=== Laptop 1 ===");
        laptop1.nyalakan();
        laptop1.matikan();

        System.out.println("\n=== Kulkas 1 ===");
        kulkas1.nyalakan();
        kulkas1.matikan();

        Elektronik e = new Laptop("Laptop Kantor", "Lenovo", 7000000, "Intel Core i5");
        System.out.println("\n=== Lewat referensi Elektronik ===");
        System.out.println(e.getInfo());
        e.nyalakan();
        e.matikan();
    }
}