
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class EbobEkokAlma {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Lütfen EBOB'unu ve EKOK'unu almamı istediğiniz ilk sayıyı giriniz : ");
        int s1 = scan.nextInt();
        System.out.print("Lütfen EBOB'unu ve EKOK'unu almamı istediğiniz ikinci sayıyı giriniz : ");
        int s2 = scan.nextInt();
        
        
      
        
        for(int i = Math.min(s1, s2); i >= 1; i--){
            if( ( s1 % i == 0 ) && ( s2 % i == 0 ) ){
            System.out.println("EBOB'u : " + i); 
            System.out.println("EKOK 'u : " + (( s1 * s2 ) / i));
            break;
            }
        }   
        
        
        
    }
}
