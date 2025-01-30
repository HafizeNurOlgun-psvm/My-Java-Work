package ders1;

import java.util.Scanner;

public class Ders6 {
    public static void main(String[] args){
        
    Scanner input=new Scanner(System.in);
    
    System.out.print("Birinci sayınızı giriniz: ");
    double number1=input.nextDouble();
    
    System.out.print("İkinci sayınızı giriniz: ");
    double number2=input.nextDouble();
    
    Scanner scan=new Scanner(System.in);
    System.out.print("Hangi işlemi yapmak istiyorsunuz? (Toplama, Çıkarma, Çarpma, Bölme) :  ");
    String islem=scan.nextLine();
    switch(islem){
        case "Toplama" -> System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));
        
        case "Çıkarma" -> System.out.print(number1 + " - " + number2 + " = " + (number1 - number2)); 
        
        case "Çarpma" -> System.out.print(number1 + " * " + number2 + " = " + (number1 * number2)); 
        
        case "Bölme" -> System.out.print(number1 + " / " + number2 + " = " + (number1 / number2)); 
    }
    

}}