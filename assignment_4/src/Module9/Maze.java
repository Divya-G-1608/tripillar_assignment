package Module9;
public class Maze {
    static void solve(int i, int j, int[][] maze, int n) {
        if (i == n - 1 && j == n - 1) {
            System.out.println("Reached End");
            return;
        }

        if (i < n && j < n && maze[i][j] == 1) {
            maze[i][j] = 0;

            solve(i + 1, j, maze, n);
            solve(i, j + 1, maze, n);

            maze[i][j] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };

        solve(0, 0, maze, 3);
    }
}
