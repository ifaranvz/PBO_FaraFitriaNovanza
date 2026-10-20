package Kuis1;

public class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int stok;

    public Buku(String idBuku, String judul, String penulis, int stok) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
    }

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

    public void tampilkanInfo() {
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Stok: " + stok);
        System.out.println();
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    public boolean cekKetersediaan() {
        return stok > 0;
    }

}
