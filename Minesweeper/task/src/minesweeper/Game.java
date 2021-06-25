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
        int mines = n;
        in.nextLine();
        while (n > 0) {

            Random random = new Random();
            int row = random.nextInt(9);
            int col = random.nextInt(9);

            if (mineField.getField()[row][col] == '.') {

                mineField.getField()[row][col] = 'X';
                n--;

            }

        }

        mineField.placeMineCount();
        mineField.print();
        
        do{
            
            System.out.println("Set/delete mines marks (x and y coordinates)");
            String[] coords = in.nextLine().split(" ");

            int c = Integer.parseInt(coords[0]) - 1;
            int r = Integer.parseInt(coords[1]) - 1;
        
            if(mineField.getField()[r][c] == 'X'){
                mineField.getDummyField()[r][c] = '*';
                mineField.getField()[r][c] = '*';
                mines--;                
            }else if(mineField.getField()[r][c] == '.'){
                mineField.getDummyField()[r][c] = '*';
                mineField.getField()[r][c] = '*';
            }else if(mineField.getField()[r][c] == '*') {
                mineField.getDummyField()[r][c] = '.';
                mineField.getField()[r][c] = '.';
            }else{
                System.out.println("There is a number here!");
                continue;
            }

            mineField.print();
//            
        }while(mines > 0);

        System.out.println("Congratulations! You found all the mines!");
        
    }


}
