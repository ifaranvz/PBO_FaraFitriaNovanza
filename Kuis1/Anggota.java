package Kuis1;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private String noTelepon;
 
    public Anggota(String idAnggota, String nama, String alamat, String noTelepon) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public String getNoTelepon() {
        return noTelepon;
    }
 
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
 
    public void tampilkanInfo() {
        System.out.println("ID Anggota: " + idAnggota);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No Telepon: " + noTelepon);
    }
 
    public void ubahData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
}