package ders1;

import java.util.Scanner;

public class Ders2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen ekrana vize notunuzu giriniz: ");
        double vizeSinavi=input.nextDouble();
        System.out.print("Lütfen ekrana vize notunuzu giriniz: ");
        double finalSinavi=input.nextDouble();
        
        String sonuc = (((vizeSinavi + finalSinavi) / 2) < 50) ? "Kaldınız" : "Geçtiniz";
        System.out.println(sonuc);
    }
}
