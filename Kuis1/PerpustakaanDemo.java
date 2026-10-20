package Kuis1;

import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {

        Buku buku1 = new Buku("B001", "Motherhood", "Kanae Minato", 4);
        Buku buku2 = new Buku("B002", "Pasta Kacang Merah", "Durian Sukegawa", 3);
 
        Anggota anggota1 = new Anggota("A001", "Fara", "Malang", "081234567890");
        Anggota anggota2 = new Anggota("A002", "Ira", "Malang", "080987654321");
 
        Peminjaman peminjaman1 = new Peminjaman("P001", LocalDate.of(2026, 9, 10));
        peminjaman1.pinjamBuku(anggota1, buku1);
        peminjaman1.pinjamBuku(anggota1, buku2);
 
        peminjaman1.setTanggalKembali(LocalDate.of(2026, 9, 20));
        peminjaman1.tampilkanDetail();
 
        Peminjaman peminjaman2 = new Peminjaman("P002", LocalDate.of(2026, 9, 15));
        peminjaman2.pinjamBuku(anggota2, buku1);
        peminjaman2.kembalikanBuku();
        peminjaman2.tampilkanDetail();
 
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
