package Kuis1;

public class Anggota {
    // deklarasi atribut 
    private String idAnggota;
    private String nama;
    private String alamat;
    private String noTelepon; // pake string karena kalo memakai int, angka awal 0 bisa hilang
 
    // constructor menginisialisasi nilai awal saat objek baru dibuat 
    public Anggota(String idAnggota, String nama, String alamat, String noTelepon) {
        // menyimpan data dari parameter ke dalam atribut
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    // getter dan setter
    // getter: mengambil/membaca nilai
    public String getIdAnggota() {
        // mengembalikan nilai atribut ke pemanggil method
        return idAnggota;
    }

    // setter: mengubah/mengisi nilai
    public void setIdAnggota(String idAnggota) {
        // this.idAnggota: atribut class Anggota
        // idAnggota: nilai baru dari parameter
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
 
    // method tampilkanInfo untuk menampilkan informasi anggota
    public void tampilkanInfo() {
        System.out.println("ID Anggota: " + idAnggota);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No Telepon: " + noTelepon);
    }
 
    // method ubahData untuk mengubah nama dan alamat anggota
    public void ubahData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
}