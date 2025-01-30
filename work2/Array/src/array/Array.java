
package array;

import java.util.Scanner;

public class Array {

        public static void main(String[] args) {
        // SORU 3
        // 11, 22, 33, 44 ve 55 sayılarının bulunduğu bir dizide
        // arama yapan ve aradığı sayıyı bulduğunda 
        // "Aradığınız sayı bulundu" mesajını konsola yazan,
        // bulamadığında ise "Aradığınız sayı bulunamadı" 
        // mesajını konsola yazıp, sonlanan programın java kodunu yazınız.

        int[] sayilar = {11, 22, 33, 44, 55};

        Scanner input = new Scanner(System.in);
        System.out.println("Aradığınız sayıyı girin: ");
        int aranan = input.nextInt();

        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Aradığınız sayı bulundu.");
        } else {
            System.out.println("Aradığınız sayı bulunamadı!");
        }
    }
    
}
