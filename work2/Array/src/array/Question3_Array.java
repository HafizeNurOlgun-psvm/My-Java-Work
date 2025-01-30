
package array;

import java.util.Random;
import java.util.Scanner;

public class Question3_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        int guess, sayac = 0;
        
        int[] array = new int[3];
        
        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10);
        }
        
        for(int eleman : array){
            System.out.print(eleman);
            
        }
        
        while(true){
            System.out.println("Random 3 sayıdan birisini tahmin eder misin? : ");
            guess = input.nextInt();
            
            if(search(array, guess)){
                sayac++;
                
                if(sayac > 2){
                    System.out.println("Tebrikler");
                    break;
                    
                }
            }
            
            
            
        }
    }
    
    public static boolean search(int[] dizi, int guess) {
        boolean result = false;
        
        for(int eleman : dizi){
            if(eleman == guess){
                result = true;
            }
        }
        
        return result;
    }
    
}
