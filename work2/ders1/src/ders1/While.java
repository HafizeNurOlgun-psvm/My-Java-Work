
package ders1;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*int x = 0;
        while(x <= 6){
            System.out.println(x);
            x += 2;
        }
        System.out.println("------------------");


        System.out.print("Lütfen pozitif sayı giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;
        while(true){
            System.out.print("Lütfen pozitif sayı giriniz : ");
            sayi = scan.nextInt();        
            if(sayi % 2 == 1 && sayi >= 0){
                toplam =+sayi ;
                System.out.println("Girdiğiniz tüm tek sayıların toplamı : " + toplam);            
            }
        }*/
    
        System.out.print("2'nin kaçıncı sayıya kadar kuvvetlerini sıralayalım? : ");
        int x = scan.nextInt();
        int k = 1;
        int i = 1;
        while(i <= x){
            k *= 2;
            System.out.println(k);            
            i++;
        }
    
    }  
}
