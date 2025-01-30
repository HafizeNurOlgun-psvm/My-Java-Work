
package array;

import java.util.Scanner;

public class findingToAvarageInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int toplam = 0; 
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            toplam += numbers[i];
        }
        System.out.println("Girdiğiniz sayıların ortalaması  : " + (toplam / numbers.length)); 
    }
    
}
