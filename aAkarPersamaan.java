package belajar.module4b;

import java.util. Scanner;

public class aAkarPersamaan {
    public static void main(String[] args) {
        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);
        
        System.out.println(" Koefisien x2 (a) : ");
        a = dataKuadrat.nextDouble();
        System.out.println(" Koefisien x (b) : ");
        b = dataKuadrat.nextDouble();
        System.out.println(" Konstanta (c) : ");
        
        c = dataKuadrat.nextDouble();
        D = b* b - (4*a*c);
        
        if (D <0 ){
            System.out.println("Tidak mempunyai akar nyata/real");
        } else if (D == 0 ) {
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni : "+x1);
        } else {
            x1 = (-b + Math.sqrt(D))/ (2*a);
            x2 = (-b - Math.sqrt(D))/ (2*a);
            System.out.println("Akar pertama : "+x1);
            System.out.println("Akar kedua : "+x2);
        }
    }
}