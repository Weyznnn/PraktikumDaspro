package jobsheet5;

import java.util.Scanner;

public class LayananWiFiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String satusCivAk;
        int jumlahSKS;
        System.out.println("Apa status anda? (Mahasiswa/Dosen)");
        satusCivAk = sc.nextLine();

        if (satusCivAk.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (Dosen)");
        } else if (satusCivAk.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS mahasiswa: ");
            jumlahSKS = sc.nextInt();
            if (jumlahSKS >= 12) {
                System.out.println("Akses WiFi diberikan (Mahasiswa Aktif)");
            }
            else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }
        else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
