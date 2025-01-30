package ders1;

import java.util.Scanner;

public class Ders7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kullanıcı adı giriniz : ");
        String k_adi = scan.nextLine();
        System.out.print("Lütfen bir şifre giriniz : ");
        String parola = scan.nextLine();
        
        if( k_adi.equals("Java") && parola.equals("123") ){
            System.out.println("Tebrikler, giriş sağlandı.");
        } else{
            System.out.println("Maalesef, giriş sağlanmadı, şifre veya kullanıcı adı hatalı.");

    }
    }           
}
