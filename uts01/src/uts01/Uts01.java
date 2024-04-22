/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uts01;

import java.util.Random; // Mengimpor kelas Random dari paket java.util

/**
 *
 * @author Irfan Habibi
 */
public class Uts01 {
    public static void main(String[] args) {
        // Membuat Array dari bulan yang akan dikeluarkan
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", 
                              "Agustus", "September", "Oktober", "November", "Desember"};
        
        Random acakBulan = new Random(); // Membuat objek acakBulan dari kelas Random
        
        int urutanBulan = acakBulan.nextInt(12) + 1; // Menghasilkan nomor bulan acak antara 1 dan 12
        
        // Mencetak hasil pengacakan nomor bulan
        System.out.println("Hasil Melakukan pengacakan pada bilangan:");
        System.out.println("Nomor Bulan  : " + urutanBulan);
        // Mencetak nama bulan terkait dengan nomor bulan yang dihasilkan
        System.out.println("Nama Bulan   : " + namaBulan[urutanBulan - 1]);
    }
}
