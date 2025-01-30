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
public class NewClass4 {
    public static void main(String[] args) {
        // Esnek Argüment Soru 1
        // Aşağıdaki şartlara sahip bir program yazmanız istenmektedir.
        // Esnek argümente sahip ortalamaBul adlı bir fonksiyon oluşturun.
        // Önce kullanıcıdan kaç sayı gireceği bilgisi alınsın.
        // Ardından kullanıcıdan, "girdiği sayı kadar", 
        // sayı istenerek bir diziye kaydedilsin.
        // Son olarak ortalamaBul metodu çalıştırılsın.


        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz?: ");
        int n = input.nextInt();

        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". sayıyı girin: ");
            sayilar[i] = input.nextInt();
        }

        // bu fonksiyonun parametresine 
        // istenilen sayıda elemana sahip 
        // bir dizi girilebilir.
        ortalamaBul(sayilar);
    }

    public static void ortalamaBul(int[] sayilar) {
        double toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        System.out.println("Ortalama: " + (toplam / sayilar.length));
    }
}
