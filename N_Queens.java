package BacktrackingfolderDSA;
import java.util.*;
public class N_Queens {
   public static void main(String args[]) {
        int q=4;
        boolean[][] board=new boolean[q][q];
        queen(board,q,0);
    }

    public static void queen(boolean[][] board,int q,int row) {
        if(q==0){
            print(board);
            return;
        }
        for(int c=0;c<board.length;c++){
            if(safe(board,row,c)){
                board[row][c]=true;
                queen(board,q-1,row+1);
                board[row][c]=false;
            }
        }
    }
    public static boolean safe(boolean[][] board,int row,int col){
//        left diagonal
        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
//        right diagonal
         r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
//        top/upward
         r=row;
        while(r>=0){
            if(board[r][col]){
                return false;
            }
            r--;
        }
        return true;
    }
    public static void print(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("======================");
    }
}

