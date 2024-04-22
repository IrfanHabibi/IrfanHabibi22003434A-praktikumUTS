/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts04;

/**
 *
 * @author Irfan Habibi
 */
public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubung;
    private double tinggi;

    // Konstruktor default
    public LimasSegiEmpat() {
        this.luasAlas = 1;
        this.luasSelubung = 1;
        this.tinggi = 1;
    }

    // Konstruktor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubung = luasSelubungBaru;
        this.tinggi = tinggiBaru;
    }

    // Menghitung luas limas
    public double getLuas() {
        return luasAlas + luasSelubung;
    }

    // Menghitung volume limas
    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    // Setter untuk luas selubung
    public void setLuasSelubung(double luasSelubungBaru) {
        this.luasSelubung = luasSelubungBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
    
    // Metode utama untuk menampilkan informasi limas
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        printInfoLimas(limas1);
        printInfoLimas(limas2);
        printInfoLimas(limas3);
    }
    
    // Metode untuk mencetak informasi limas
    public static void printInfoLimas(LimasSegiEmpat limas) {
        System.out.println("Limas segi empat dengan luas alas: " + limas.luasAlas +
                           ", luas selubung limas: " + limas.luasSelubung +
                           " dan tinggi: " + limas.tinggi +
                           ". Luasnya: " + limas.getLuas() +
                           ", sedangkan volumenya: " + limas.getVolume());
    }   
}