package minesweeper;

import java.util.SortedMap;

public class MineField {
    
    private char[][] field;
    final int ROW = 9;
    final int COL = 9;
    
    public MineField(){
        
        field = new char[ROW][COL];
        for(int i = 0; i < ROW; i++)
            for(int j = 0; j < COL; j++)
                field[i][j] = '.';
            
        
    }
    
    public char[][] getField() { return field; }
    
    public void print(){

        for(int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++)
                System.out.print(field[i][j]);

            System.out.println("");
        }    
            
    }
    
}
