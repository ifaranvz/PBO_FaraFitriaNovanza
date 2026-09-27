package Kuis1;

import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {

        // membuat objek buku
        Buku buku1 = new Buku("B001", "Motherhood", "Kanae Minato", 4);
        Buku buku2 = new Buku("B002", "Pasta Kacang Merah", "Durian Sukegawa", 3);
 
        // membuat objek anggota
        Anggota anggota1 = new Anggota("A001", "Fara", "Malang", "081234567890");
        Anggota anggota2 = new Anggota("A002", "Ira", "Malang", "080987654321");
 
        // peminjaman pertama, anggota1 pinjam buku1 dan buku2
        Peminjaman peminjaman1 = new Peminjaman("P001", LocalDate.of(2026, 9, 10));
        peminjaman1.pinjamBuku(anggota1, buku1);
        peminjaman1.pinjamBuku(anggota1, buku2);
 
        // anggota1 kembalikan buku telat, lebih dari 7 hari
        peminjaman1.setTanggalKembali(LocalDate.of(2026, 9, 20));
        peminjaman1.tampilkanDetail();
 
        // peminjaman kedua, anggota2 pinjam buku1
        Peminjaman peminjaman2 = new Peminjaman("P002", LocalDate.of(2026, 9, 15));
        peminjaman2.pinjamBuku(anggota2, buku1);
        peminjaman2.kembalikanBuku();
        peminjaman2.tampilkanDetail();
 
        // cek stok buku setelah semua peminjaman dan pengembalian
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
