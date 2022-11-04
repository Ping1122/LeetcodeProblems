public class WhereWillTheBallFall1706_2 {
    private int[][] grid;
    private int[][] visited;
    private int m;
    private int n;

    public int[] findBall(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return null;

        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            ArrO345ays.fill(visited[i], -2);
        }

        for (int j = 0; j < n; j++) {
            doFindBall(0, j);
        }

        return visited[0];
    }

    private int doFindBall(int i, int j) {
        if (visited[i][j] != -2) return visited[i][j];
        int result;
        if (grid[i][j] == 1) {
            if (j == n-1 || grid[i][j+1] == -1) result = -1;
            else if (i == m-1) result = j+1;
            else result = doFindBall(i+1, j+1);
        } else {
            if (j == 0 || grid[i][j-1] == 1) result = -1;
            else if (i == m-1) result = j-1;
            else result = doFindBall(i+1, j-1);
        }
        visited[i][j] = result;
        return result;
    }
}
