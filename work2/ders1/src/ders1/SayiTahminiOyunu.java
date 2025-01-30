
package ders1;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminiOyunu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(10);
        int sayi;
        int sayac = 0;
        
        do{
            System.out.print("Lütfen 0 ile 10 arasında bir sayı giriniz : ");
            sayi = input.nextInt(); 
            sayac++;
        }
        while( sayi != r );
            
        
        System.out.print("Tebrikler " + sayac + ". denemede buldunuz!");

        
    }
    
}
