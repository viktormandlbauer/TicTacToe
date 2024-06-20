public class Board {

    char[][] cells;
    public Board(){
        cells = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    public boolean isCellEmpty(int x, int y){
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker){
        cells[x][y] = marker;
    }
    public boolean isFull(){
        for(char[] row : cells){
            for(char col : row){
                if(col == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public void clear(){
        cells = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    public void print(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(" " + cells[i][j]);
                if (j < cells[i].length - 1) System.out.print(" |");
            }
            System.out.println();
            if (i < cells.length - 1) {
                System.out.println("---+---+---");
            }
        }
    }
}
