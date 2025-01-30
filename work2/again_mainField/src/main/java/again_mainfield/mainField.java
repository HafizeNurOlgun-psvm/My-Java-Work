package again_mainfield;

import java.util.Random;
import java.util.Scanner;

public class mainField {

    int[][] map;
    int[][] board;
    int rowNumber, colNumber, size;
    int rowNumber_users, colNumber_users;
    boolean game = true;

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    mainField(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        printArrays(map);
        System.out.println();        
        
        
        int count = 0;
        while(game){
            printArrays(board);
            trying(); 
            controlToTrying();
            
            if(count == (size - size / 4)){
                System.out.println("Tebrikler!!");                         
                break;
            }
            count++;
        }
        
        if(game == false){
            System.out.println("Kaybettiniz.......");         
        }
    }
    
    public void randomNumberGeneration() {
        int count = 0;
        int randomRow, randomCol;
        while (count != size / 4) {
            randomRow = random.nextInt(rowNumber);
            randomCol = random.nextInt(colNumber);

            if (map[randomRow][randomCol] != -1) {
                map[randomRow][randomCol] = -1;
                count++;
            }
        }
    }
    
    public void printArrays(int[][] array){
        randomNumberGeneration();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void trying() {
        boolean caseForRow = true;
        boolean caseForCol = true;
        
        while(caseForRow){
            System.out.print("Denemek istediğiniz hücrenin satır sayısını giriniz : ");
            rowNumber_users = input.nextInt();
            
            if( (rowNumber_users < 0) && (rowNumber_users >= rowNumber) ){
                System.out.print("Lütfen geçerli satır numarası giriniz... ");
            } else{
                caseForRow = false;
            }
        }
        
        while(caseForCol){
            System.out.print("Denemek istediğiniz hücrenin sütun sayısını giriniz : ");
            colNumber_users = input.nextInt();
            
            if( (colNumber_users < 0) && (colNumber_users >= colNumber) ){
                System.out.print("Lütfen geçerli satır numarası giriniz... ");
            } else{
                caseForCol = false;
            }
        }
    }
    
    public void controlToTrying(){
        
        if( (rowNumber_users != 0) && (map[rowNumber_users - 1][colNumber_users] == -1 ) ){
            board[rowNumber_users][colNumber_users]++;
        }
        
        if( (rowNumber_users != 3) && (map[rowNumber_users + 1][colNumber_users] == -1 ) ){
            board[rowNumber_users][colNumber_users]++;
        }
        
        if( (colNumber_users != 0) && (map[rowNumber_users][colNumber_users - 1] == -1 ) ){
            board[rowNumber_users][colNumber_users]++;
        }
        
        if( (colNumber_users != 3) && (map[rowNumber_users][colNumber_users + 1] == -1 ) ){
            board[rowNumber_users][colNumber_users]++;
        }
        
        if(map[rowNumber_users][colNumber_users] == -1){
            game = false;
        }
    }
}
