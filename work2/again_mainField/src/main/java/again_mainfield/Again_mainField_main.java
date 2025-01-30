package again_mainfield;

import java.util.Scanner;

public class Again_mainField_main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Row Number : ");
        int rowNumber = input.nextInt();
        System.out.print("Col Number : ");
        int colNumber = input.nextInt();
        mainField main = new mainField(rowNumber, colNumber);
        
        main.run();
    }
}
