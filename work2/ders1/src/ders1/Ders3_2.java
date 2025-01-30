package ders1;

import java.util.Scanner;

public class Ders3_2 {
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Lütfen ürününüzün fiyatını giriniz: ");
        double fiyat=Scanner.nextDouble();
        double kdv= fiyat + (fiyat* 0.18);
        int cevirme=(int)kdv;
        if(cevirme==kdv){
            System.out.println(Math.round(kdv));
        }
        else{
            System.out.println(kdv);
        }
    }
}