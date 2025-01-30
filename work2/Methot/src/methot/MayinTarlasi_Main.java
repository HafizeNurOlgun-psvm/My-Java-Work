
package methot;

import java.util.Scanner;

public class MayinTarlasi_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Row Number : ");
        int rowNumber = input.nextInt();
        System.out.print("Col Number : ");
        int colNumber = input.nextInt();
         
        MayinTarlasi mayin = new MayinTarlasi(rowNumber, colNumber);
        mayin.run();
    }
}