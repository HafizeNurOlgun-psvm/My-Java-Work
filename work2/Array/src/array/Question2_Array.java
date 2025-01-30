
package array;

import java.util.Scanner;

public class Question2_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun?");
        int element = input.nextInt();
        
        int[] array = new int[element];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Dizinin bir elemanını giriniz : ");
            array[i] = input.nextInt();
        }
        

        while(true){
            System.out.print("Diziden bir eleman tahmin edin  :");
            int guess = input.nextInt();
            
            if(searchToNumber(array, guess)){
                System.out.print("Tebrikler!!");
                break;
            
            }else{
                System.out.print("Maalesef!!");
            
            }
        }
       
        
        
        
    }
    
    public static boolean searchToNumber(int[] diziler, int guess) {
       for(int dizi : diziler){
            if(guess == dizi){
                return true;
            }
        }
        return false;
        
        
    }
}
