
package ders1;

import java.util.Scanner;

public class AsalSayiMiDegilMi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen pozitif bir sayı giriniz : ");
        int sayi = input.nextInt();
        
        if(sayi <= 0){
            System.out.print("Hatırlatma : Negatif sayıların ve sıfırın asallığına bakılamaz..");
        }
        else{
            for(int i = 2; i <= sayi / 2; i++){
                if(sayi % i == 0){
                    System.out.println("Sayınız Asal Değildir.");
                    break;
                }
                else if(sayi % i != 0){
                    System.out.println("Sayınız Asaldır.");
                    break;
                }
            }
        }
    }   
}
