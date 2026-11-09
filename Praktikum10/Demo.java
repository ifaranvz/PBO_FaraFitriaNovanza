package Praktikum10;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        Pegawai pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        System.out.println(pegawai1.nidn);
        pegawai1.mengajar();
    }
}