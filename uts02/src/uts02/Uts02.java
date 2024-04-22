/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts02;

import java.util.Scanner;

/**
 *
 * @author Irfan Habibi
 */
public class Uts02 {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk mendapatkan input dari pengguna
        
        int bilangan; // Deklarasi variabel bilangan untuk menyimpan setiap bilangan yang dimasukkan oleh pengguna
        int jumlahInput = 0; // Inisialisasi variabel jumlahInput untuk menghitung jumlah total input
        int jumlahBilanganPositif = 0; // Inisialisasi variabel jumlahBilanganPositif untuk menghitung jumlah bilangan positif
        int jumlahBilanganNegatif = 0; // Inisialisasi variabel jumlahBilanganNegatif untuk menghitung jumlah bilangan negatif
        double total = 0; // Inisialisasi variabel total untuk menghitung total dari semua bilangan yang dimasukkan
        
        System.out.print("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: "); // Meminta pengguna untuk memasukkan bilangan
        
        while ((bilangan = masukan.nextInt()) != 0) { // Melakukan loop sampai pengguna memasukkan nilai 0
            if (bilangan > 0) { // Jika bilangan lebih besar dari 0, maka itu adalah bilangan positif
                jumlahBilanganPositif++; // Menambahkan 1 ke jumlah bilangan positif
            } else if (bilangan < 0) { // Jika bilangan kurang dari 0, maka itu adalah bilangan negatif
                jumlahBilanganNegatif++; // Menambahkan 1 ke jumlah bilangan negatif
            }
            
            if (bilangan != 0) { // Jika bilangan tidak sama dengan 0, maka itu adalah bilangan yang valid
                total += bilangan; // Menambahkan bilangan ke total
                jumlahInput++; // Menambahkan 1 ke jumlah input
            }
        }
        
        if (jumlahInput == 0) { // Jika tidak ada input yang dimasukkan
            System.out.println("Tidak ada nilai yang diinputkan."); // Cetak pesan bahwa tidak ada nilai yang dimasukkan
        } else { // Jika ada input yang dimasukkan
            double hasilRataRata = total / jumlahInput; // Menghitung nilai rata-rata
            
            // Mencetak hasil perhitungan
            System.out.println("Jumlah bilangan positif adalah " + jumlahBilanganPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahBilanganNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.printf("Nilai rata-rata %.2f\n", hasilRataRata);
        }
    }   
}
