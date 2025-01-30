
package array;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Palindrom olup olmadığını test etmek istediğin kelimeyi girer misin? : ");
        String word = input.nextLine();
        
        String[] array = new String[word.length()];
        
        String backwards = "";
        
        int i = word.length() - 1, j = 0;
        while( ( i >= 0 ) && ( j < word.length() ) ){
            array[i--] = Character.toString(word.charAt(j++));
        }
        
        for(String value : array){
            backwards += value;    
        }
        if(backwards.equals(word))
            System.out.println(word + " kelimesi bir palindromdur."); 
        else
            System.out.println(word + " kelimesi bir palindrom değildir."); 

    }    
}
