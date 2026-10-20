package UTS;

public class Laptop extends Elektronik {
    private String prosesor;

    public Laptop() {
        super();
        this.prosesor = "-";
    }

    public Laptop(String nama, String merk, double harga, String prosesor) {
        super(nama, merk, harga);
        this.prosesor = prosesor;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Prosesor : " + this.prosesor + "\n";

        return info;
    }

}