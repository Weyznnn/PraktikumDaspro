package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();
        sc.close();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silaka cetak KRS dan minta tanda tangan DPA");
        }
        else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}
