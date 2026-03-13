package MODULE_9;
public class NQueens {
    public static void main(String[] args) {

        int board[][]={
                {0,1,0,0},
                {0,0,0,1},
                {1,0,0,0},
                {0,0,1,0}
        };

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
}
