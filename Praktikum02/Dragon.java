package Praktikum02;

// class Dragon
public class Dragon {
    // atribut
    // x = horizontal, y = vertikal, direction = arah
    int x, y, direction;

    public Dragon() {
        // diberi nilai 0 (default)
        x = 0;
        y = 0;
        // di set ke 1 (atas) untuk default
        direction = 1; 
    }

    // ini method untuk mengubah arah dragon yang berdasarkan parameter newDirection
    public void changeDirection(int newDirection) {
        // hanya bisa input nilai 1, 2, 3 atau 4
        if (newDirection == 1 || newDirection == 2 || newDirection == 3 || newDirection == 4) {
            direction = newDirection;
        // ouput nya jika menginput nilai selain nilai tsb
        } else {
            System.out.println("Arah tidak valid!");
            System.out.println("Coba gunakan 1 (atas), 2 (kanan), 3 (bawah) atau 4 (kiri)");
        }
    }

    // ini method untuk mengubah posisi dragon dengan jumlah sesuai parameter steps
    public void move(int steps) {
        // dragon pindah ke atas, y berkurang
        if (direction == 1) {
            y -= steps;
        // dragon pindah ke kanan, x bertambah
        } else if (direction == 2) {
            x += steps;
        // dragon pindah ke bawah, y bertambah
        } else if (direction == 3) {
            y += steps;
        // dragon pindah ke kiri, x berkurang
        } else if (direction == 4) {
            x -= steps;
        }
    }

    // ini method untuk mencetak koordinat dan arah objek dragon
    public void printStatus() {
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        System.out.println("Arah: " + direction);
        System.out.println("=================");
    }
}
