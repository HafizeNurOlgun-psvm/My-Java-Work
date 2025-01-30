
package ders1;

import java.util.Scanner;

public class UcakBileti2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        
        
        System.out.print("Gideceğiniz yer kaç km? : ");
        int km = input.nextInt();
        
        
        System.out.print("Kaç yaşındasınız? : ");
        int yas = input.nextInt();
        
        Scanner scan = new Scanner(System.in);        

        System.out.print("Tek yön mü çift yön mü? : ");
        String bilet = scan.nextLine();
        
        if( bilet.equals("Tek") || bilet.equals("tek") || bilet.equals("TEK") ){
            if( yas>0 && yas<=12 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.5) +" tl");
            } 
            else if( yas>12 && yas<=24 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.1) +" tl");
            }
            else if( yas>65 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.3) +" tl");
            }
            else{
                System.out.println("Lütfen geçerli bir yaş giriniz...");
            }
        }
        
        else if( bilet.equals("Çift") || bilet.equals("çift") || bilet.equals("ÇİFT") ){
            if( yas>0 && yas<=12 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.5) +" tl");
            } 
            else if( yas>12 && yas<=24 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.1) +" tl");
            }
            else if( yas>65 ){
                System.out.println("Bilet tutarınız : " + ((km * 20)*0.3) +" tl");
            }
            else{
                System.out.println("Lütfen geçerli bir yaş giriniz...");
            }
        }
        
        else{
            System.out.println("Lütfen yalnızca 'Tek' veya 'Çift' değerini giriniz...");
            
        }
    
}}
