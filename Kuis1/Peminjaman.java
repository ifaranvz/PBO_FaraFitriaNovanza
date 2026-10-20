package Kuis1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjaman;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Buku> daftarBuku;
 
    public Peminjaman(String idPeminjaman, LocalDate tanggalPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = null;
        this.daftarAnggota = new ArrayList<Anggota>();
        this.daftarBuku = new ArrayList<Buku>();
    }
 
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
 
    public void pinjamBuku(Anggota anggota, Buku buku) {
        if (buku.cekKetersediaan()) {
            daftarAnggota.add(anggota);
            daftarBuku.add(buku);
            buku.kurangiStok();
            System.out.println(anggota.getNama() + " berhasil meminjam buku " + buku.getJudul());
        } else {
            System.out.println("Maaf, buku " + buku.getJudul() + " sedang tidak tersedia");
        }
    }
 
    public void kembalikanBuku() {
        tanggalKembali = LocalDate.now();
 
        for (Buku buku : daftarBuku) {
            buku.tambahStok(1);
        }
 
        System.out.println("Buku telah dikembalikan pada tanggal " + tanggalKembali);
    }
 
    public double hitungDenda() {
        double denda = 0;
 
        if (tanggalKembali != null) {
            LocalDate batasKembali = tanggalPinjam.plusDays(7);
 
            if (tanggalKembali.isAfter(batasKembali)) {
                denda = 5000;
            }
        }
        return denda;
    }
 
    public void tampilkanDetail() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + (tanggalKembali == null ? "Belum dikembalikan" : tanggalKembali));
  
        System.out.println("Anggota Peminjam:");
        for (Anggota anggota : daftarAnggota) {
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
