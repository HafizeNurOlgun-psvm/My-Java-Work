package array;

import java.util.Random;
import java.util.Scanner;

public class GuessToNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        boolean station = false;
        
        int i = 0;
        int[] numbersArray = new int[5];
        
        int randomNumber = rand.nextInt(10) + 1;
        
        int can = 5;
        while (can > 0) {
            
            System.out.println("1 - 10 Arasındaki Sayıyı tahmin ediniz : ");
            int number = input.nextInt();
            
            
            if ((number < 0) || (number > 10)) {
                System.out.println("Hatalı giriş.. Lütfen 1 - 10 arası sayı giriniz.");
                
                if(station){
                    System.out.println("Fazla hatalı giriş yaptınız. 1 canınız eksildi ve kalan canınız : " + --can);                
                } else{
                    station = true;
                }
                
                continue;
                
            } else {
                numbersArray[i++] = number;
                
                if (randomNumber != number) {
                    System.out.println("Hatalı tahmin.. Kalan hakkınız : " + --can);
                    
                    if(can == 0){
                        System.out.println("GAME OVER... Doğru cevap : " + randomNumber);                        
                    }
                } else {
                    System.out.println("KAZANDINIZ! Tebrik ederiz, doğru cevap!!!");
                    break;
                }
            }
        }
        
        System.out.print("Tahmin ettiğiniz değerler : ");
        for(int value : numbersArray){               
            if(value != 0)
                System.out.print(value + " , ");  
        }

        /**
         * Random rand = new Random(); Scanner input = new Scanner(System.in);          *
         *
         * int randomNumber = rand.nextInt(10) + 1; // 1 - 10 arası sayı üretir.
         * System.out.println(randomNumber); int can = 1; while(can <= 5){ int[]
         * array = new int[can]; System.out.println("Tahmin Ediniz : "); int
         * number = input.nextInt(); array[(can - 1)] = number; if( (number < 0 ) || (number
         * > 10) ){ System.out.println("Lütfen 1 - 10 arası sayı tahmin
         * ediniz.."); continue; } else{ if( randomNumber != number ){
         * System.out.println("Yanlış tahmin ettiniz.. Kalan can hakkınız : " +
         * (5 - can++)); } else{ System.out.println("Doğru tahmin ettiniz!!
         * TEBRİKLER"); System.out.println("----------------------------");
         * break; }
         *
         * }
         * } *
         */
    }
}
