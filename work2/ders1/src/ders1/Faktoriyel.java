
package ders1;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini almamı istediğiniz sayıyı girer misiniz? : ");
        int number = input.nextInt();
        int x = 1;
        int fak = 1;
        while (x <= number){
            fak *= x;
            x++;
                    
            
        }
        System.out.println(fak);

    }    
}
