package UTS;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Laptop Gaming", "ASUS", 12000000, "Intel Core i7");
        Kulkas kulkas1 = new Kulkas("Kulkas 2 Pintu", "Sharp", 3500000, 5);

        System.out.println(laptop1.getInfo());
        System.out.println(kulkas1.getInfo());
    }
}
