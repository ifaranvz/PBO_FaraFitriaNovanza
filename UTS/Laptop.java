package UTS;

public class Laptop extends Elektronik {
    public String prosesor;

    // Constructor tanpa parameter
    public Laptop() {
        prosesor = "-";
    }

    // Constructor berparameter, memanggil super() berparameter
    public Laptop(String nama, String merk, double harga, String prosesor) {
        super(nama, merk, harga);
        this.prosesor = prosesor;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String n) {
        prosesor = n;
    }

    // Overriding getInfo() dari Elektronik
    public String getInfo() {
        String info = super.getInfo();
        info += "Prosesor : " + prosesor + "\n";

        return info;
    }
}
