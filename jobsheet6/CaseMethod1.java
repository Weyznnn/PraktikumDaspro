package jobsheet6;

import java.util.Scanner;

public class CaseMethod1 {
    public static void main(String[] args) {
        String namaMahasiswa, NIM, statusSemester = "TIDAK LULUS", statusMatKul1, statusMatkul2, nilaiHurufMatKul1, nilaiHurufMatKul2;
        int nilaiUTSMatKul1, nilaiUASMatKul1, nilaiTugasMatKul1, nilaiUTSMatKul2, nilaiUASMatKul2, nilaiTugasMatKul2, standarMatKul = 60, standarRataRata = 70;
        double persentasiUTS = 0.3, persentasiUAS = 0.4, persentasiTugas = 0.3;
        double nilaiAkhirMatKul1, nilaiAkhirMatKul2, rataRataNilaiAkhir;

        Scanner sc = new Scanner(System.in);
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        namaMahasiswa =  sc.nextLine();
        System.out.print("NIM  : ");
        NIM = sc.nextLine();
        System.out.println();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        nilaiUTSMatKul1 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        nilaiUASMatKul1 = sc.nextInt();
        System.out.print("Nilai TUGAS : ");
        nilaiTugasMatKul1 = sc.nextInt();
        System.out.println();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        nilaiUTSMatKul2 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        nilaiUASMatKul2 = sc.nextInt();
        System.out.print("Nilai TUGAS : ");
        nilaiTugasMatKul2 = sc.nextInt();
        System.out.println();
        sc.close();
        
        //proses penghitungan nilai akhir & Rata Rata
        nilaiAkhirMatKul1 = (nilaiUTSMatKul1*persentasiUTS)+(nilaiUASMatKul1*persentasiUAS)+(nilaiTugasMatKul1*persentasiTugas);
        nilaiAkhirMatKul2 = (nilaiUTSMatKul2*persentasiUTS)+(nilaiUASMatKul2*persentasiUAS)+(nilaiTugasMatKul2*persentasiTugas);
        rataRataNilaiAkhir = (nilaiAkhirMatKul1+nilaiAkhirMatKul2)/2;
        
        //pemilihan nilai huruf matkul1
        if (nilaiAkhirMatKul1>80) {
            nilaiHurufMatKul1 = "A";
        } else if (nilaiAkhirMatKul1>73) {
            nilaiHurufMatKul1 = "B+";
        } else if (nilaiAkhirMatKul1>65) {
            nilaiHurufMatKul1 = "B";
        } else if (nilaiAkhirMatKul1>60) {
            nilaiHurufMatKul1 = "C+";
        } else if (nilaiAkhirMatKul1>50) {
            nilaiHurufMatKul1 = "C";
        } else if (nilaiAkhirMatKul1>39) {
            nilaiHurufMatKul1 = "D";
        } else {
            nilaiHurufMatKul1 = "E";
        }

        //pemilihan nilai huruf matkul2
        if (nilaiAkhirMatKul2>80) {
            nilaiHurufMatKul2 = "A";
        } else if (nilaiAkhirMatKul2>73) {
            nilaiHurufMatKul2 = "B+";
        } else if (nilaiAkhirMatKul2>65) {
            nilaiHurufMatKul2 = "B";
        } else if (nilaiAkhirMatKul2>60) {
            nilaiHurufMatKul2 = "C+";
        } else if (nilaiAkhirMatKul2>50) {
            nilaiHurufMatKul2 = "C";
        } else if (nilaiAkhirMatKul2>39) {
            nilaiHurufMatKul2 = "D";
        } else {
            nilaiHurufMatKul2 = "E";
        }

        //pemilihan status
        if (nilaiAkhirMatKul1>=standarMatKul) {
            statusMatKul1 = "LULUS";
        } else {
            statusMatKul1 = "TIDAK LULUS";
        }
        if (nilaiAkhirMatKul2>=standarMatKul) {
                statusMatkul2 = "LULUS";
        } else {
            statusMatkul2 = "TIDAK LULUS";
        }
        
        if (statusMatKul1 == "LULUS" && statusMatkul2 == "LULUS") {
            if(rataRataNilaiAkhir>standarRataRata) {
                statusSemester = "LULUS";
            }
        }

        //output
        System.out.println("============= HASIL PENILAIAN AKADEMIK =============");
        System.out.println("Nama\t: "+namaMahasiswa);
        System.out.println("NIM\t: "+NIM+"\n");

        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t"+nilaiUTSMatKul1+"\t"+nilaiUASMatKul1+"\t"+nilaiTugasMatKul1+"\t"+nilaiAkhirMatKul1+"\t\t"+nilaiHurufMatKul1+"\t\t"+statusMatKul1);
        System.out.println("Struktur Data\t\t"+nilaiUTSMatKul2+"\t"+nilaiUASMatKul2+"\t"+nilaiTugasMatKul2+"\t"+nilaiAkhirMatKul2+"\t\t"+nilaiHurufMatKul2+"\t\t"+statusMatkul2+"\n");

        System.out.println("Rata-rata Nilai Akhir\t: "+rataRataNilaiAkhir);
        System.out.println("Status Semester\t\t: "+statusSemester+" (Rata-Rata < "+standarRataRata+")");
    }
}