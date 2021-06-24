package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Game {

    MineField mineField;

    public Game(MineField mineField) {
        this.mineField = mineField;
    }

    void play() {

        Scanner in = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");
        int n = in.nextInt();

        while (n > 0) {

            Random random = new Random();
            int row = random.nextInt(9);
            int col = random.nextInt(9);

            if (mineField.getField()[row][col] == '.') {

                mineField.getField()[row][col] = 'X';
                n--;

            }

        }
        
        placeMineCount();
        mineField.print();

    }

    private void placeMineCount() {

        for (int i = 0; i < mineField.ROW; i++) 

            for (int j = 0; j < mineField.COL; j++) 
                
                if (mineField.getField()[i][j] == '.') {

                    int count = countMines(i, j);
                    
                    if(count != 0) mineField.getField()[i][j] = (char)(count + '0');    

                }

    }

    private int countMines(int i, int j){
        int count = 0;
        for (int row = i - 1; row <= i + 1; row++) 

            for (int col = j - 1; col <= j + 1; col++) 

                if (row >= 0 && row < mineField.ROW
                        && col >= 0 && col < mineField.COL
                        && mineField.getField()[row][col] == 'X') {
                    count++;
                }

        return count;
        
    }
    

}
