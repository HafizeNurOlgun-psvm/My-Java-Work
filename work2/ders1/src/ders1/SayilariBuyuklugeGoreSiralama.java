
package ders1;

import java.util.Scanner;

public class SayilariBuyuklugeGoreSiralama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Lütfen üç tane sayı giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        
        if(sayi1 < sayi2 && sayi1< sayi3) {
            if(sayi2 < sayi3){
                System.out.println("Sıralama : " + sayi1 + " < " + sayi2 + " < " + sayi3);
            }
            else if(sayi3 < sayi2){
                System.out.println("Sıralama : " + sayi1 + " < " + sayi3 + " < "  + sayi2);
            }
            else{
                System.out.println("Sıralama : " + sayi1 + " < " + sayi2 + " = " + sayi3);
            }
        }
        
        
        else if(sayi2 < sayi1 && sayi2 < sayi3) {
            if(sayi1 < sayi3){
                System.out.println("Sıralama : " + sayi2 + " < " + sayi1 + " < " + sayi3);
            }
            else if(sayi3 < sayi1){
                System.out.println("Sıralama : " + sayi2 + " < " + sayi3 + " < " + sayi1);
            }
            else{
                System.out.println("Sıralama : " + sayi2 + " < " + sayi1 + " = " + sayi3);
            }
        }   
        
        else if(sayi3 < sayi1 && sayi3 < sayi2) {
            if(sayi1 < sayi2){
                System.out.println("Sıralama : " + sayi3 + " < " + sayi1 + " < " + sayi2);
            }
            else if(sayi2 < sayi1){
                System.out.println("Sıralama : " + sayi3 + " < " + sayi2 + " < " + sayi1);
            }
            else{
                System.out.println("Sıralama : " + sayi3 + " < " + sayi1 + " = " + sayi2);
            }
        }
        
        else {
            System.out.println("Sıralama : " + sayi1 + " = " + sayi2 + " = " + sayi3);

        }
    }
}
