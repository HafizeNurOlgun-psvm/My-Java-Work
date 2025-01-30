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
public class NewClass2 {
    public static void main(String[] args) {
        // SORU 1
        // Bir toplantıya katılacak olan 5 kişinin isimlerini tutan listeyi,
        // kullanıcıdan alarak dolduran ve tüm listeyi doldurduktan sonra,
        // konsola yazdıran Java kodunu yazınız.

        Scanner input = new Scanner(System.in);
        String[] isimler = new String[5];

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("kişinin ismini giriniz: ");
            isimler[i] = input.nextLine();
        }

        System.out.println("--- Toplantıya Katılacaklar ---");
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }
    }
}
