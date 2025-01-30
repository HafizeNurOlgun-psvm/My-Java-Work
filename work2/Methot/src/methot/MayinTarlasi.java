
package methot;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;
    
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
    MayinTarlasi(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.size = rowNumber * colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
    }
    
    public void run(){
        prepareGame();
        print(map);
        while(game){
            print(board);
            System.out.print("Satır? : ");
            int row = input.nextInt();
            System.out.print("Sütun? : ");
            int col = input.nextInt();
            
            if(map[row][col] != -1){
                int success = 0;
                if(success == size - size / 4){
                    System.out.print("Kazandınız!!");     
                }
                check(row, col);
            } else{
                game = false;
                System.out.print("Game Over!");                
            }
        }
    }
    
    public void prepareGame(){
        int randRow, randCol, count = 0;
        while(count != (size / 4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != -1 ){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    
    public void check(int r, int c){
        if(board[r][c] == 0){
            if( ( c != colNumber - 1 ) && ( map[r][c + 1] == -1 ) )
                board[r][c]++;
            if( ( c != 0 ) && ( map[r][c - 1] == -1 ) )
                board[r][c]++;
            if( ( r != rowNumber - 1 ) && ( map[r + 1][c] == -1 ) )
                board[r][c]++;
            if( ( r != 0 ) && ( map[r - 1][c] == -1 ) )
                board[r][c]++;
            if(board[r][c] == 0){
                board[r][c] = 2;
            }
        }
    }
    
    public void print(int[][] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] >= 0){
                    System.out.print(" ");                
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();                            
        }
    }
    
}
