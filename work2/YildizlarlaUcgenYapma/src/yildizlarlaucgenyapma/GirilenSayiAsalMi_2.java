package yildizlarlaucgenyapma;
import java.util.Scanner;
public class GirilenSayiAsalMi_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen bir sayı giriniz : ");      
        int number = input.nextInt();
        
        int sonuc = 0;
        int i = 2;
        do{
            i++;
            if(number % i == 0){
                System.out.print("Asal Değil.");
                break;
            }else{
                sonuc++;
                continue;
            } 
            
        }while(i <= (int)number/2); 
        
        if(sonuc == (int)number/2-1){
            System.out.print("Asaldır.");
        }
    }
}
