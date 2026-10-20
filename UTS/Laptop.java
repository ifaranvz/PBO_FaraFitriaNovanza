package UTS;

public class Laptop extends Elektronik {
    public String prosesor;

    public Laptop() {
        prosesor = "-";
    }

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

    public String getInfo() {
        String info = super.getInfo();
        info += "Prosesor : " + prosesor + "\n";

        return info;
    }
}
