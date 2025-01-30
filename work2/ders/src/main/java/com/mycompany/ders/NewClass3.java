/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ders;

/**
 *
 * @author user
 */
public class NewClass3 {
    public static void main(String[] args) {
        // Bir dizideki çift tam sayıları bulup konsola yazdıran
        // ciftBul() adlı metodu tanımlayın.
        int[] dizi = {8, 5, 9, 6, 3, 12};
        ciftBul(dizi);
    }

    public static void ciftBul(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                System.out.println(dizi[i]);
            }
        }
    }
}
