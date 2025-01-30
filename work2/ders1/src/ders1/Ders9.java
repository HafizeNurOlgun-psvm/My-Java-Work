package ders1;

import java.util.Scanner;

public class Ders9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kalmak istediğiniz odanın büyüklüğünü seçiniz (m2) : ");
        int odaBuyuklugu = input.nextInt();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("1000tl fark ile sıcak havuz ister misiniz? (Evet veya Hayır) : ");
        String sicakHavuz = scan.nextLine(); 

        switch(sicakHavuz){
            case "Evet" -> {
                double fiyat = (1000 + 100 * odaBuyuklugu);
                System.out.println("Seçtiğiniz odanın fiyatı : " + fiyat);
                break;
            }
            
            case "Hayır" -> {
                double fiyatt = 100 * odaBuyuklugu;
                System.out.println("Seçtiğiniz odanın fiyatı : " + fiyatt);
                break;
            }
            
            default -> {
                System.out.println("Lütfen 'Evet' veya 'Hayır' yazınız.. ");
                break;
            }
        }
    }
}
