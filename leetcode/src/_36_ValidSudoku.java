import java.util.HashSet;

public class _36_ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i=0; i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0; i<board.length;i++){
            for(int j=0; j<board[i].length;j++){
                if(board[i][j] == '.') continue;

                char value = board[i][j];
                int boxNum = (i/3)*3 +(j/3);

                if(row[i].contains(value) || col[j].contains(value) || box[boxNum].contains(value)) System.out.println(false);

                row[i].add(value);
                col[j].add(value);
                box[boxNum].add(value);
            }
        }

//        return true;
    }
}
