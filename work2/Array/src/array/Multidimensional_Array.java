
package array;

import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args){
        //Çok Boyutlu Diziler
        
        int[][] array = {
            {1, 3, 78},
            {2, 56, 40},
            {3, 3, 90},
            {4, 7, 34}            
        };
        
        for(int[] row : array){
            for(int value : row){
                System.out.print(value + " ");                
            }
            System.out.println();                            
        }
        System.out.println("---------------------------");
        
        
        
        Scanner input = new Scanner(System.in);
        int[][] array_new = new int[3][2];
        
        for(int i = 0; i < array_new.length; i++){
            for(int j = 0; j < array_new[0].length; j++){
                System.out.print((i + 1) + ". Satırın " + (j + 1) + ". Kolonundaki Değeri Girer Misiniz? : ");
                array_new[i][j] = input.nextInt(); 
            }
        }
        
        for(int i = 0; i < array_new.length; i++){
            for(int j = 0; j < array_new[0].length; j++){
                System.out.print(array_new[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}
