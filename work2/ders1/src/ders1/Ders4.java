package ders1;

import java.util.Scanner;

public class Ders4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Lütfen hesapta kullanılmasını istediğiniz π değerini giriniz: ");
        double pi = input.nextDouble();
        
        System.out.print("Lütfen dairenizin yarıçapını giriniz: ");
        double r = input.nextDouble();
        
        double alan = pi * r * r;
        System.out.println("Dairenizin alanı: " + alan);
        
        double cevre = 2 * pi * r;
        System.out.println("Dairenizin çevresi: " + cevre);

    }
}
