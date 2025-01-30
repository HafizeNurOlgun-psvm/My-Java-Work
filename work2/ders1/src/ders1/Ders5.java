package ders1;

import java.util.Scanner;

public class Ders5 {
    public static void main(String[] args){
        
    Scanner input=new Scanner(System.in);
    
    System.out.print("Birinci sayınızı giriniz: ");
    double number1=input.nextDouble();
    
    System.out.print("İkinci sayınızı giriniz: ");
    double number2=input.nextDouble();
    
    
    
    double toplam = number1 + number2;
    int sonucToplam = (int) toplam;
    if(sonucToplam == toplam){
        System.out.println("\tToplam: " + sonucToplam);

    } else { System.out.println("\tToplam: " + toplam);
}
    double cikarma = number1 - number2;
    int sonucCikarma = (int) cikarma;
    if(sonucCikarma == cikarma){
        System.out.println("\tÇıkarma: " + sonucCikarma);

    } else { System.out.println("\tÇıkarma: " + cikarma);
}
    double carpma = number1 * number2;
    int sonucCarpma = (int) carpma;
    if(sonucCarpma == carpma){
        System.out.println("\tÇarpma: " + sonucCarpma);

    } else { System.out.println("\tÇarpma: " + carpma);
}
    double bolme = number1 / number2;
    int sonucBolme = (int) bolme;
    if(sonucBolme == bolme){
        System.out.println("\tBölme: " + sonucBolme);

    } else { System.out.println("\tBölme: " + bolme);
}

}}

