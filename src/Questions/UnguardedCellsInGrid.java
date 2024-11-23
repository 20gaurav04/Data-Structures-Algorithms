package Questions;

public class UnguardedCellsInGrid {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] guards = {{1, 1}};
        int[][] walls = {{0, 1}, {1, 0}, {2, 1}, {1, 2}};
        int res = countUnguarded(row, col, guards, walls);
        System.out.println(res);
    }

    static int countUnguarded(int n, int m, int[][] guards, int[][] walls) {
        int[][] matrix = new int[m][n];

        // Mark guards as 1
        for (int[] guard : guards) {
            matrix[guard[0]][guard[1]] = 1;
        }

        // Mark walls as -1
        for (int[] wall : walls) {
            matrix[wall[0]][wall[1]] = 1;
        }

        // Propagate guarding for each guard
        for (int[] guard : guards) {
            int i = guard[0], j = guard[1];
            dirDfs(i - 1, j, matrix, 'L');  // Left
            dirDfs(i + 1, j, matrix, 'R');  // Right
            dirDfs(i, j - 1, matrix, 'U');  // Up
            dirDfs(i, j + 1, matrix, 'D');  // Down
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) { // Cell is unguarded
                    count+=1;
                }
            }
        }
        return count;
    }

    static void dirDfs(int i, int j, int[][] matrix, char dir) {
        // Boundary and obstacle check
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] ==1) {
            return;
        }

        // Mark cell as guarded
        matrix[i][j] = 2;

        // Continue propagation in the same direction
        if (dir == 'L') dirDfs(i - 1, j, matrix, dir);
        if (dir == 'R') dirDfs(i + 1, j, matrix, dir);
        if (dir == 'U') dirDfs(i, j - 1, matrix, dir);
        if (dir == 'D') dirDfs(i, j + 1, matrix, dir);
    }
}
