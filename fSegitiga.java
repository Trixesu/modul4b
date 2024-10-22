package belajar.module4b;

import java.util.Scanner;

public class fSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sisi a : ");
        int sisiA = input.nextInt();
        
        System.out.print("Sisi b : ");
        int sisiB = input.nextInt();
        
        System.out.print("Sisi c : ");
        int sisiC = input.nextInt();
        
        if (sisiA + sisiB <= sisiC || sisiA + sisiC <= sisiB || sisiB + sisiC <= sisiA) {
            System.out.println("Bukan Segitiga");
        } else if (Math.pow(sisiC, 2) == (Math.pow(sisiA, 2)) + (Math.pow(sisiB, 2))) {
            System.out.println("Segitiga siku-siku");
        } else if (sisiA == sisiB || sisiA == sisiC || sisiB == sisiC){
            System.out.println("Segitiga sama kaki");
        } else if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Segitiga sama sisi");
        } else {
            System.out.println("Segitiga sembarang");
        }
        input.close();
    }
}
