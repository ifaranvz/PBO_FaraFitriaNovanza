package Praktikum10;

public class Demo {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("111", "Budi");
        Dosen dosen = (Dosen) pegawai;
        dosen.mengajar();
    }
}