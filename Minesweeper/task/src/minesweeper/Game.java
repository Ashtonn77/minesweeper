package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Game {
    
    MineField mineField;
    
    public Game(MineField mineField){
        this.mineField = mineField;
    }
    
    void play(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");
        int n = in.nextInt();
        
        while(n > 0){

            Random random = new Random();
            int row = random.nextInt(9);
            int col = random.nextInt(9);
            
            if(mineField.getField()[row][col] == '.'){
               
                mineField.getField()[row][col] = 'X';
                n--;
                
            }
                        
        }
        
        mineField.print();
                
    }
    
    
}
