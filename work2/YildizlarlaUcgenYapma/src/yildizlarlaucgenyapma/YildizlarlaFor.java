
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class YildizlarlaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç satırlı üçgen istersiniz? : ");   
        int line = input.nextInt();    
        
        for(int i = 1; i <= line; i++){
            for(int x = 1; x <= i; x++){
                System.out.print("*");   
            
            }
            System.out.print("\n");   
        
        }
        
        for(int y = line; y >= 1; y--){
            for(int z = y; z >= 1; z--){
                System.out.print("*");   
            
            }
            System.out.print("\n");   
        
        }
        
    }
    
}
