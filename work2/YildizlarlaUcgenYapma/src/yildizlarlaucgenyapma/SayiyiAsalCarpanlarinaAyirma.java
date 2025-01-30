
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class SayiyiAsalCarpanlarinaAyirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Asal çarpanlarına Ayırmamı İstediğiniz Sayıyı Giriniz : ");   
        int number = input.nextInt(); 
        
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                
                for(int x = 2; x <= number/2; x++){
                    if(i % number == 0){
                        
                    }
                }
            System.out.println(i);   
            continue;
            }
        }
    }
    
}
