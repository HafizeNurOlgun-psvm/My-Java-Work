
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class SayiyiCarpanlarinaAyirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Çarpanlarına Ayırmamı İstediğiniz Sayıyı Giriniz : ");   
        int number = input.nextInt(); 
        
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
            System.out.println(i);   
            continue;
            }
        }
    }
    
}
