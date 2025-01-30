
package ders1;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik sayınızı giriniz : ");
        int h = input.nextInt();
        
        int x = 1;
        double toplam = 0;
        while(x <= h){
            toplam += (double)1/x;  
            x++;
            
        }
        System.out.println(toplam);

        
    }
}
