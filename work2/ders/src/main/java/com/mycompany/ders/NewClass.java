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
public class NewClass {
    public static void main(String[] args) {
        // SORU 1
        // Kullanıcıdan alınan bir metindeki tüm karakterleri
        // konsola alt alta yazdıran java kodunu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = input.nextLine();

        // cumle.length() -> toplam karakter sayısını verir.
        // cumle.charAt() -> belirli bir indise ait karakteri verir.
        for (int i = 0; i < cumle.length(); i++) {
            System.out.print(cumle.charAt(i));
        }
    }
}
