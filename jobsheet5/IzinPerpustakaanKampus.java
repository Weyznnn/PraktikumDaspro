package jobsheet5;

import java.util.Scanner;

public class IzinPerpustakaanKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean membawaKartuMahasiswa, sudahRegistrasiOnline;
        System.out.println("Apakah membawa kartu mahasiswa? (true/false)");
        membawaKartuMahasiswa = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sudah registrasi online? (true/false)");
        sudahRegistrasiOnline = sc.nextBoolean();
        sc.close();

        if (sudahRegistrasiOnline&&membawaKartuMahasiswa) {
            System.out.println("Selamat datang di perpustakaan kampus!");
        }
        else {
            System.out.println("Tidak boleh masuk!. Mohon bawa KTM dan lakukan registrasi online ketika akan ke perpustakaan kampus");
        }
    }
}
