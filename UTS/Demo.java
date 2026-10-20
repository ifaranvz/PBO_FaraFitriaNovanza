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

    }
}