package yildizlarlaucgenyapma;
import java.util.Scanner;

public class FibonacciWithFor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç aşamalı bir fibonacci istersin : ");
        int asama = scan.nextInt();
        
        int s1 = 0, s2 = 1, t;
        
        for(int i = 1; i <= asama; i++){
            System.out.print(s1 + " "); 
            t = s1 + s2 ;
            s1 = s2 ; 
            s2 = t ; 
                   
        }
        
    }

}
