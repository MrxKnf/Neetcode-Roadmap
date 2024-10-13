package ValidSudoku;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board){
        Map<Integer,HashSet<Character>> filas = new HashMap<>();
        Map<Integer,HashSet<Character>> columnas = new HashMap<>();
        Map<String,HashSet<Character>> cuadrados = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            filas.put(i,new HashSet<Character>());
            columnas.put(i,new HashSet<Character>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String claveCuadrado = (i / 3) + "," + (j / 3);
                cuadrados.putIfAbsent(claveCuadrado, new HashSet<Character>());
                if (board[i][j] == '.'){
                    continue;
                }
                if (filas.get(i).contains(board[i][j]) ||
                    columnas.get(j).contains(board[i][j]) ||
                    cuadrados.get(i/3 + "," + j/3).contains(board[i][j])){
                    return false;
                }
                filas.get(i).add(board[i][j]);
                columnas.get(j).add(board[i][j]);
                cuadrados.get(i/3 + "," + j/3).add(board[i][j]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] caso = {{'.','.','.','.','5','.','.','1','.'},
                         {'.','4','.','3','.','.','.','.','.'},
                         {'.','.','.','.','.','3','.','.','1'},
                         {'8','.','.','.','.','.','.','2','.'},
                         {'.','.','2','.','7','.','.','.','.'},
                         {'.','1','5','.','.','.','.','.','.'},
                         {'.','.','.','.','.','2','.','.','.'},
                         {'.','2','.','9','.','.','.','.','.'},
                         {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(caso));
    }

}
