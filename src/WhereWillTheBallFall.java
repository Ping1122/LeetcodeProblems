public class WhereWillTheBallFall {
    public int[] findBall(int[][] grid) {
        if (grid == null) return null;
        int m = grid.length;
        int n = grid[0].length;

        int[] prev = null;
        int[] curr = null;

        for (int i = m-1; i >= 0; i--) {
            curr = new int[n];
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    if (j == 0 || grid[i][j-1] == 1) curr[j] = -1;
                    else curr[j] = (i == m-1)? j-1 : prev[j-1];
                }
                else {
                    if (j == n-1 || grid[i][j+1] == -1) curr[j] = -1;
                    else curr[j] = (i == m-1)? j+1 : prev[j+1];
                }
            }
            prev = curr;
        }
        return curr;
    }
}
