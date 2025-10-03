package jobsheet5;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();
        sc.close();

        if (angka%2==0) {
            System.out.print(String.format("%d merupakan angka genap", angka));
        }
        else {
            System.out.println(String.format("%d merupakan angka ganjil", angka));
        }
    }
}
