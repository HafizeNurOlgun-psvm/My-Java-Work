
package ders1;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Gideceğiniz yer kaç km? : ");
        int km = scan.nextInt();
        
        Scanner input = new Scanner(System.in);        
        
        System.out.print("Ekonomik İster Misiniz? ( 'Evet' veya 'Hayır' ) : ");
        String eko = input.nextLine();
        
        System.out.print("Yemek Servisi İster Misiniz? ( 'Evet' veya 'Hayır' ) : ");
        String yemek = input.nextLine();
        
        if( eko.equals("Evet") || eko.equals("evet") || eko.equals("EVET") ){
            switch (yemek) {
                case "Evet", "evet", "EVET" -> System.out.println("Uçak Bileti Fiyatınız : " + ( km * 0.1 + 1000 + 700 ) + "tl");
                case "Hayır", "hayır", "HAYIR" -> System.out.println("Uçak Bileti Fiyatınız : " + ( km * 0.1 + 1000 ) + "tl");
                default -> System.out.println("Lütfen geçerli bir değer giriniz..");
            }     
        }
        
        if( eko.equals("Hayır") || eko.equals("hayır") || eko.equals("HAYIR") ){
            switch (yemek) {
                case "Evet", "evet", "EVET" -> System.out.println("Uçak Bileti Fiyatınız : " + ( km * 0.1 + 700 ) + "tl");
                case "Hayır", "hayır", "HAYIR" -> System.out.println("Uçak Bileti Fiyatınız : " + ( km * 0.1 ) + "tl");
                default -> System.out.println("Lütfen geçerli bir değer giriniz..");
            }     
        }
    
}}
