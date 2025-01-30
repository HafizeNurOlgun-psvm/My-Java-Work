
package ders1;

import java.util.Scanner;
import java.util.Random;

public class Continue_break {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    int random = r.nextInt(10);
    System.out.print("Lütfen 0 ile 9 arasından bir sayıyı giriniz : ");
    int sayi = input.nextInt();
    int sayac = 1;
    
    if(sayi !=random){
        while(sayi != random){
            System.out.print("Hatalı.. Lütfen tekrar 0 ile 9 arasından bir sayıyı giriniz : ");
            sayi = input.nextInt();
            sayac++;
        
            if(sayi == random){
                System.out.println("Tebrikler!! " + sayac + ". denemede doğru bildiniz!!!");
                break;
            }
        }
    } else {
            System.out.println("Tebrikler ilk denemede buldunuz!!!!");
            
        }

            
    
}}
