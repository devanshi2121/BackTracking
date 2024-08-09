package BacktrackingfolderDSA;
import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		char board[][]=new char[m][n];
		for(int i=0;i<m;i++) {
			String s=sc.next();
			for(int j=0;j<n;j++) {
				board[i][j]=s.charAt(j);
			}
		}
        String word=sc.next();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean X=Search(i,j,board,3,4,0,word);
                if(X){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
    public static boolean Search(int row, int col,char[][] board,int m,int n,int idx,String word){
        //base case
        if(idx==word.length()){
            return true;
        }
        //negative basecase
        if(row>=m || row<0 || col>=n || col<0 || board[row][col]!=word.charAt(idx)){
            return false;
        }
        board[row][col]='#';
        int r[]={-1,0,0,1};
        int c[]={0,-1,1,0};
        for(int i=0;i<c.length;i++){
            boolean ans=Search(row+r[i], col+c[i], board, m, n, idx+1, word);
            if(ans){
                return true;
            }
        }
        board[row][col]=word.charAt(idx);
        return false;
    } 
}
