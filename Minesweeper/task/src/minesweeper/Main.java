package minesweeper;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        generateRandomMinefield();
    }
    
    
    private static void generateRandomMinefield(){

        Random random = new Random();
        
        for(int i = 0; i < 9; i++){

            int r = random.nextInt(9);
            
            for(int j = 0; j < 9; j++){
              
                if(j == r) System.out.print("X");
                else System.out.print(".");
                
            }

            System.out.println();
        }
    
        
    }
    
}
