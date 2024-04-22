/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts03;

import java.util.Scanner;
/**
 *
 * @author Irfan Habibi
 */
public class Uts03 {

    public static int sumDigits(long n) {
        int jumlah = 0; // Inisialisasi variabel jumlah untuk menyimpan jumlah digit

        while (n != 0) { // Melakukan loop sampai n sama dengan 0
            int digit = (int) (n % 10); // Mengambil digit terakhir dari n
            jumlah += digit; // Menambahkan digit ke jumlah
            n /= 10; // Menghapus digit terakhir dari n
        }

        return jumlah; // Mengembalikan jumlah digit
    }
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

        System.out.print("Masukan Sebuah Bilangan Bulat\t: "); // Meminta pengguna memasukkan bilangan bulat
        long n = masukan.nextLong(); // Membaca bilangan bulat yang dimasukkan pengguna

        int jumlahDigit = sumDigits(n); // Menghitung jumlah digit dari bilangan bulat yang dimasukkan pengguna

        // Menampilkan hasil perhitungan jumlah digit ke konsol
        System.out.println("Jumlah digit dalam bilangan " + n + " adalah " + jumlahDigit);

        masukan.close(); // Menutup objek Scanner
    }

}
