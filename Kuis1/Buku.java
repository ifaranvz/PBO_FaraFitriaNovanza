package Kuis1;

public class Buku {
    // deklarasi atribut 
    private String idBuku;
    private String judul;
    private String penulis;
    private int stok;

    // constructor menginisialisasi nilai awal saat objek baru dibuat
    public Buku(String idBuku, String judul, String penulis, int stok) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
    }

    // getter dan setter
    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // method tampilkanInfo untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Stok: " + stok);
        System.out.println();
    }

    // method tambahStok untuk menambah stok buku
    public void tambahStok(int jumlah) {
        // artinya stok = stok + jumlah, jadi stok lama di tambah jumlah baru
        stok += jumlah;
    }

    // method kurangiStok untuk mengurangi 1 stok buku
    // karena setiap method pinjamBuku di panggil, method kurangiStok akan di panggil sekali
    public void kurangiStok() {
        if (stok > 0) {
            // artinya stok = stok - 1
            stok--;
        }
    }

    // method cekKetersediaan untuk mengecek stok buku masi ada atau tidak
    public boolean cekKetersediaan() {
        return stok > 0;
    }

}
