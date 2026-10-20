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

    public String getInfo() {
        String info = super.getInfo();
        info += "Suhu  : " + this.suhu + " derajat Celcius\n";

        return info;
    }

}