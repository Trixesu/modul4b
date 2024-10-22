package belajar.module4b;

import java.util.Scanner;

public class bTokoBaju {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ukuran baju (S, M, L, XL, XXL) : ");
        String ukuranBaju = input.nextLine();
        
        System.out.print("Jumlah baju : ");
        int jumlahBaju = input.nextInt();
        
        int harga = 0;
        
        if (ukuranBaju.equals("S")) {
            harga = 30000;
        } else if (ukuranBaju.equals("M")) {
            harga = 38000;
        } else if (ukuranBaju.equals("L")) {
            harga = 45000;
        } else if (ukuranBaju.equals("XL")) {
            harga = 50000;
        } else if (ukuranBaju.equals("XXL")) {
            harga = 60000; 
        } else {
            System.out.println("Ukuran tidak valid");
        }
        
        int totalHarga = jumlahBaju * harga;
        System.out.println("Harga baju ukuran "+ukuranBaju+" : Rp "+harga);
        System.out.println("Total harga : Rp "+totalHarga);
        input.close();
    }
}