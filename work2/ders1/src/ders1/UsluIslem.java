
package ders1;

import java.util.Scanner;

public class UsluIslem {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);

        System.out.print("Kuvvetini almak istediğiniz sayı : ");
        int sayi = scan.nextInt();
        System.out.print("Kuvvetini almak istediğiniz sayı : ");
        int kuvvet = scan.nextInt();
        int carp = 1;
        int k = 1;
        while(k <= kuvvet){
            k++;
            carp *= sayi;
        }
        System.out.println(carp);
}}

