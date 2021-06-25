package minesweeper;

public class MineField {

    private char[][] field;
    private char[][] dummyField;
    final int ROW = 9;
    final int COL = 9;

    public MineField() {

        field = new char[ROW][COL];
        dummyField = new char[ROW][COL];

        for (int i = 0; i < ROW; i++)

            for (int j = 0; j < COL; j++) {
                field[i][j] = '.';
                dummyField[i][j] = '.';
            }


    }

    public char[][] getField() {
        return field;
    }

    public char[][] getDummyField() {
        return dummyField;
    }

    public void print() {

        System.out.println(" |123456789|\n-|---------|");

        for (int i = 0; i < ROW; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < COL; j++) {
                System.out.print(dummyField[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }

        System.out.println("-|---------|");

    }

    public void placeMineCount() {

        for (int i = 0; i < ROW; i++)

            for (int j = 0; j < COL; j++)

                if (field[i][j] == '.') {

                    int count = countMines(i, j);

                    if (count != 0) {
                        dummyField[i][j] = (char) (count + '0');
                        field[i][j] = (char) (count + '0');
                    }
           
                }

    }

    private int countMines(int i, int j) {
        int count = 0;
        for (int row = i - 1; row <= i + 1; row++)

            for (int col = j - 1; col <= j + 1; col++)

                if (row >= 0 && row < ROW
                        && col >= 0 && col < COL
                        && field[row][col] == 'X') {
                    count++;
                }

        return count;

    }


}
