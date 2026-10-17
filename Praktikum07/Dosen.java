package Praktikum07;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        System.out.println("Ini constructor class Dosen yang berparameter");
    }

    public String getInfo() {
        return "NIDN       : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
