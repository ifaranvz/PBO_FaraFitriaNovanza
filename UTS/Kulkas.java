package UTS;

public class Kulkas extends Elektronik {
    public int suhu;

    // Constructor tanpa parameter
    public Kulkas() {
        suhu = 0;
    }

    // Constructor berparameter, memanggil super() berparameter
    public Kulkas(String nama, String merk, double harga, int suhu) {
        super(nama, merk, harga);
        this.suhu = suhu;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int n) {
        suhu = n;
    }

    // Overriding getInfo() dari Elektronik
    public String getInfo() {
        String info = super.getInfo();
        info += "Suhu  : " + suhu + " derajat Celcius\n";

        return info;
    }
}
