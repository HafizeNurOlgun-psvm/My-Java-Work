
package ders1;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("Sizin için etkinlik önerisinde bulunmam için konumunuzun sıcaklığını giriniz: ");
        double hava = input.nextInt();
        if(hava <= 0){
            System.out.println("Sizin için 3 tane etkinlik aşağıdaki gibi sıraladım: \n\t1-Buz patenine gitmek \n\t2-Sinemaya gitmek \n\t3-Kayak kaymak");

        }
        if(hava > 0){
            System.out.println("Sizin için 3 tane etkinlik aşağıdaki gibi sıraladım: \n\t1-Sahile gitmek \n\t2-Yüzme \n\t3-Bisiklet binmek");

        }
        else{
            System.out.println("Lütfen geçerli bir sayı giriniz.");

        }
    }
}
