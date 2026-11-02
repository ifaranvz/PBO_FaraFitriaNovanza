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

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Prosesor : " + this.prosesor + "\n";

        return info;
    }

    @Override
    public void nyalakan() {
        System.out.println("Menekan tombol power");
        System.out.println("Sistem booting, " + getNama() + " menyala");
    }

    @Override
    public void matikan() {
        System.out.println("Menyimpan semua pekerjaan");
        System.out.println("Shutdown, " + getNama() + " mati");
    }
}