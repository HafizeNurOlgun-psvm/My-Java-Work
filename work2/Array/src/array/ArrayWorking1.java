
package array;

import java.util.Scanner;

public class ArrayWorking1 {
    public static void main(String[] args){
        // int[] dizi = new int[3];
        // int dizi[] = new int[3];
        // int[] dizi = {1, 2, 3, 4};        

        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        
        for (int arrayList : array){
            System.out.print(arrayList + " , ");
        }
    }
}
