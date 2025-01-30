
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class GirilenSayiAsalMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Asallığını kontrol etmek istediğiniz sayıyı giriniz : ");   
        int number = input.nextInt();    
        int sayac = 0;
        for(int i = 2; i <= (int)number/2; i++){
            
        if(number % i == 0){
        System.out.print("Sayınız Asal Değil.");  
        break;           
        }
            
        else if(number % i  != 0){
            sayac++;
            continue;
        }
        
        }
        if(sayac == (int)(number/2 - 1)){
            System.out.println("Sayınız Asal.");   

        }
    }
    
}
