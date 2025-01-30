
package methot;

import java.util.Scanner;

public class polindromeNumber_Methot {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Could you enter a number for test if it's a palindrome number : "); 
        int number = input.nextInt();
        
        if(division(number))
            System.out.println("Your number is a polindrome number.");
        else
            System.out.println("Your number is not a polindrome number...");
        
        
    }
    
    public static boolean division(int number){
        int mod, result = 0, numberOne;
        
        numberOne = number;
        
        while(number != 0){
            mod = number % 10;
            result = result * 10 + mod;
            number /= 10;
            
        }

        if(numberOne == result)
            return true;
        else 
            return false;
    }
    
    
}
