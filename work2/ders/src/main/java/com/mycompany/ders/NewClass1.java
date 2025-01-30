/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ders;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NewClass1 {
    public static void main(String[] args) {
        // SORU 2
        // Kullanıcıdan alınan bir cümlenin içerisinde 
        // kaç defa küçük a harfinin geçtiğini bulan java kodunu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = input.nextLine();

        int toplam = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a') {
                toplam++;
            }
        }

        System.out.println("Girilen cümlede " + toplam + " defa a harfi geçmektedir.");

        // Alternatif soru
        // Küçük-Büyük harf hassasiyeti olmaksızın, 
        // a harfinin kaç defa geçtiğini bulun.
        toplam = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A') {
                toplam++;
            }
        }

        System.out.println("Girilen cümlede " + toplam + " defa a veya A harfi geçmektedir.");
    }
}
