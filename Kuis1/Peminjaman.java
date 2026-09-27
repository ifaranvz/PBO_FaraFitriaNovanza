package Kuis1;

// memanggil class arraylist untuk daftar dan localdate untuk tanggal
import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    // deklarasi atribut
    private String idPeminjaman;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Buku> daftarBuku;
 
    // constructor, hanya dgn 2 parameter karena yang dibutuhkan di awal cuma 2 data tesebut
    public Peminjaman(String idPeminjaman, LocalDate tanggalPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        // null karena buku baru di pinjam dan blm di kembalikan
        this.tanggalKembali = null;
        // inisialisasi list kosong untuk menampung data anggota dan buku peminjam
        this.daftarAnggota = new ArrayList<Anggota>();
        this.daftarBuku = new ArrayList<Buku>();
    }
 
    // getter dan setter
    public String getIdPeminjaman() {
        return idPeminjaman;
    }
 
    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }
 
    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }
 
    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
 
    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }
 
    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
 
    // method pinjamBuku
    // meminta objek anggota dan buku
    public void pinjamBuku(Anggota anggota, Buku buku) {
        // memanggil method cekKetersediaan di class buku
        if (buku.cekKetersediaan()) {
            // memasukkan anggota ke daftar anggota peminjam
            daftarAnggota.add(anggota);
            daftarBuku.add(buku);
            // memanggil method kurangiStok di class buku untuk otomatis mengurasi 1 stok 
            buku.kurangiStok();
            System.out.println(anggota.getNama() + " berhasil meminjam buku " + buku.getJudul());
        } else {
            System.out.println("Maaf, buku " + buku.getJudul() + " sedang tidak tersedia");
        }
    }
 
    // method kembalikanBuku
    public void kembalikanBuku() {
        // isi variable dengan tanggal hari ini saat method dijalankan
        tanggalKembali = LocalDate.now();
 
        // perulangan for each
        for (Buku buku : daftarBuku) {
            // stok buku ditambah 1 karena bukunya di kembalikan
            buku.tambahStok(1);
        }
 
        System.out.println("Buku telah dikembalikan pada tanggal " + tanggalKembali);
    }
 
    // method hitungDenda 
    public double hitungDenda() {
        // nilai awal 0
        double denda = 0;
 
        // jika tanggalkembali tidak sama dengan null
        if (tanggalKembali != null) {
            // batas kembali 7 hari
            LocalDate batasKembali = tanggalPinjam.plusDays(7);
 
            // jika tanggal kembali melebihi 7 hari
            if (tanggalKembali.isAfter(batasKembali)) {
                denda = 5000;
            }
        }
        // mengembalikan hasil perhitungan denda ke pemanggil method
        return denda;
    }
 
    // method tampilkanDetai untuk informasi peminjaman
    public void tampilkanDetail() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        // jika tanggal kembali masih null akan mencetak belum, jika tidak null akan menampilkan tanggal kembalinya
        System.out.println("Tanggal Kembali: " + (tanggalKembali == null ? "Belum dikembalikan" : tanggalKembali));
  
        System.out.println("Anggota Peminjam:");
        for (Anggota anggota : daftarAnggota) {
            // mengambil nama dgn getNama di class anggota
            System.out.println("- " + anggota.getNama());
        }
 
        System.out.println("Buku Dipinjam:");
        for (Buku buku : daftarBuku) {
            System.out.println("- " + buku.getJudul());
        }
 
        System.out.println("Denda: " + hitungDenda());
        System.out.println();
    }
}
