
package array;

import java.util.Scanner;

public class IsPalindromeNumber_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindromluğunu test edeceğiniz sayıyı girer misiniz ? : ");
        String word = input.nextLine();
        
        String temp = "";
        
        for(int i = word.length() - 1 ; i >= 0; i--){
            temp += word.charAt(i);
        }
        
        if(temp.equals(word))
            System.out.print(word + " kelimesi bir palindrom kelimedir.");    
        else
            System.out.print(word + " kelimesi bir palindrom kelime değidir.");                
    }    
}
