package methot;

import java.util.Scanner;

public class Proje1 {
    public static void main(String[] args) {
        // 1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırma

        for(int number = 2; number <= 1000; number++){
            if(isPrimeNumber(number)){
                System.out.println(number);
            }
        }
        
    }
    
    public static boolean isPrimeNumber(int number){
        
        for(int j = 2; j <= number / 2; j++){
            if(number % j == 0){
                return false;
            }
        }
        
        return true;
    }
}
