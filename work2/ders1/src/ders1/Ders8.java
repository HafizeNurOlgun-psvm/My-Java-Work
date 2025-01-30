
package ders1;

import java.util.Scanner;

public class Ders8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Türkçe notunuzu giriniz : ");
        double turkce = input.nextDouble();
        System.out.print("Türkçe ders saatinizi giriniz : ");
        int turkceSaat = input.nextInt();
        
        System.out.print("Matematik notunuzu giriniz : ");
        double mat = input.nextDouble();
        System.out.print("Matematik ders saatinizi giriniz : ");
        int matSaat = input.nextInt();
        
        System.out.print("Fen notunuzu giriniz : ");
        double fen = input.nextDouble();
        System.out.print("Fen ders saatinizi giriniz : ");
        int fenSaat = input.nextInt();
        
        System.out.print("Sosyal notunuzu giriniz : ");
        double sosyal = input.nextDouble();
        System.out.print("Sosyal ders saatinizi giriniz : ");
        int sosyalSaat = input.nextInt();
        
        System.out.print("Beden notunuzu giriniz : ");
        double beden = input.nextDouble();
        System.out.print("Beden ders saatinizi giriniz : ");
        int bedenSaat = input.nextInt();
        
        double turkceSaatNew = turkce * turkceSaat ;
        double matSaatNew = mat * matSaat ;
        double fenSaatNew = fen * fenSaat ;
        double sosyalSaatNew = sosyal * sosyalSaat ;
        double bedenSaatNew = beden * bedenSaat ;
        
        
        int tumSaatler = bedenSaat + sosyalSaat + fenSaat + matSaat + turkceSaat;
        
        double toplam = ( turkceSaatNew + matSaatNew + fenSaatNew + sosyalSaatNew + bedenSaatNew ) / tumSaatler ;
               
        if(toplam >= 50){
            System.out.println("Geçtiniz!! Orlamanız : " + toplam);
        } else{
            System.out.println("Kaldınız :( Orlamanız : " + toplam);

        }

    }
}
