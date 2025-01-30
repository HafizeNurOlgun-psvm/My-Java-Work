package yildizlarlaucgenyapma;

import java.util.Scanner;

public class YildizlarlaUcgenYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç satırlı üçgen istersiniz? : ");   
        int line = input.nextInt();
     
        int i = 1;
        
        while(i <= line){ 
            int x = 1;
            while(x <= i){
                System.out.print("*");  
                x++;
            }
            i++;
            System.out.print("\n");  

        }
        
         
        
        int y = 1;
        int x = line;
        
        while(y <= line){ 
            while(y <= x){
                System.out.print("*");  
                x--;
            }
            y++;
            System.out.print("\n");  
            x = line;
        }
    }   
}
