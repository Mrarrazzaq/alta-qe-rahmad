package Kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Angka Pertama ");
        int a = scan.nextInt();
        System.out.println("Masukan Angka Kedua ");
        int b = scan.nextInt();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                Penjumlahan tambah = new Penjumlahan(a, b);
                System.out.println("Hasil Penjumlahan " + a + " + " + b + " adalah " + tambah.hitung1());
                break;
            case 2:
                Pengurangan kurang = new Pengurangan(a, b);
                System.out.println("Hasil Pengurangan " + a + " - " + b + " adalah " + kurang.hitung2());
                break;
            case 3:
                Perkalian kali = new Perkalian(a, b);
                System.out.println("Hasil Perkalian " + a + " * " + b + " adalah " + kali.hitung3());
                break;
            case 4:
                Pembagian bagi = new Pembagian(a, b);
                System.out.println("Hasil Pembagian " + a + " / " + b + " adalah " + bagi.hitung4());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scan.close();
    }
}
