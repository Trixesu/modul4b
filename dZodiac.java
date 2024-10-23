package belajar.module4b;

import java.util.Scanner;

public class dZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        
        System.out.print("Tanggal lahir : ");
        int tanggal = input.nextInt();
        
        System.out.print("Bulan lahir : ");
        int bulan = input.nextInt();
        
        String zodiac = "";
        String sifat = "";
                
        if ((tanggal >= 20 && bulan == 1)||(tanggal <= 18 && bulan == 2)) {
            zodiac = "Aquarius";
            sifat = "Analistis, Imajinatif, Unik dan Tidak kenal kompromi";
        } else if ((tanggal >= 19 && bulan == 2)||(tanggal <= 20 && bulan == 3)) {
            zodiac = "Pisces";
            sifat = "Penuh kasih sayang, Empati, Bijaksana dan Artistik";
        } else if ((tanggal >= 21 && bulan == 3) || (tanggal <= 19 && bulan == 4)) {
            zodiac = "Aries";
            sifat = "Bersemangat, Dinamis, Tanggap dan Kompetitif";
        } else if ((tanggal >= 20 && bulan == 4)||(tanggal <= 20 && bulan == 5)) {
            zodiac = "Taurus";
            sifat = "Kuat, Dapat diandalkan, Sensual dan Kreatif";
        } else if ((tanggal >= 21 && bulan == 5)||(tanggal <= 20 && bulan == 6)) {
            zodiac = "Gemini";
            sifat = "Serba bisa, Ekspresif, Selalu ingin tahu dan Baik hati";
        } else if ((tanggal >= 21 && bulan == 6)||(tanggal <= 22 && bulan == 7)) {
            zodiac = "Cancer";
            sifat = "Intuitif, Sentimental, Penyayang dan Protektif";
        } else if ((tanggal >= 23 && bulan == 7)||(tanggal <= 22 && bulan == 8)) {
            zodiac = "Leo";
            sifat = "Dramatis, Adaptif, Bersemangat dan Percaya diri";
        } else if ((tanggal >= 23 && bulan == 8)||(tanggal <= 22 && bulan == 9)) {
            zodiac = "Virgo";
            sifat = "Praktis, Setia, Lembut dan Analitis";
        } else if ((tanggal >= 23 && bulan == 9)||(tanggal <= 22 && bulan == 10)) {
            zodiac = "Libra";
            sifat = "Mudah bersosial, Adil, Diplomatis dan Ramah";
        } else if ((tanggal >= 23 && bulan == 10)||(tanggal <= 21 && bulan == 11)) {
            zodiac = "Scorpio";
            sifat = "Bersemangat, Keras kepala, Banyak akal dan Berani";
        } else if ((tanggal >= 22 && bulan == 11)||(tanggal <= 21 && bulan == 12)) {
            zodiac = "Sagitarius";
            sifat = "Ekstrovert, Optimis, Humoris dan Murah hati";
        } else if ((tanggal >= 22 && bulan == 12)||(tanggal <= 19 && bulan == 1)) {
            zodiac = "Capricorn";
            sifat = "Serius, Mandiri, Disiplin dan Ulet";
        } else {
            System.out.println("Tanggal dan bulan yang dimasukkan tidak valid");
        }
        
        System.out.println("Zodiakmu : "+zodiac);
        System.out.println("Sifatmu : "+sifat);
        input.close();
    }
}
