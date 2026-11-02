package UTS;

public class Kulkas extends Elektronik {
    private int suhu;

    public Kulkas() {
        super();
        this.suhu = 0;
    }

    public Kulkas(String nama, String merk, double harga, int suhu) {
        super(nama, merk, harga);
        this.suhu = suhu;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Suhu  : " + this.suhu + " derajat Celcius\n";

        return info;
    }

    @Override
    public void nyalakan() {
        System.out.println("Menghubungkan kulkas ke listrik");
        System.out.println("Kompresor menyala, suhu diatur ke " + this.suhu + " derajat Celcius");
    }

    @Override
    public void matikan() {
        System.out.println("Mencabut kabel dari listrik");
        System.out.println("Kompresor berhenti, " + getNama() + " mati");
    }
}