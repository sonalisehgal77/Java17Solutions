import java.util.*;

class SolutionShortestCellPath {

    static class Cell {
        int row, col, depth;

        public Cell(int row, int col, int depth) {
            this.row = row;
            this.col = col;
            this.depth = depth;
        }
    }

    static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
        int R = grid.length;
        int C = grid[0].length;

        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(sr, sc, 0));
        Set<String> seen = new HashSet<>();
        seen.add(sr + "," + sc);

        while (!queue.isEmpty()) {
            Cell current = queue.poll();
            int r = current.row, c = current.col, depth = current.depth;
            if (r == tr && c == tc)
                return depth;
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] dir : directions) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr >= 0 && nr < R && nc >= 0 && nc < C && grid[nr][nc] == 1 && !seen.contains(nr + "," + nc)) {
                    queue.offer(new Cell(nr, nc, depth + 1));
                    seen.add(nr + "," + nc);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // debug your code below
        int[][] grid = {{1, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 1}};
        int sr = 0, sc = 0, tr = 2, tc = 0;
        System.out.println(shortestCellPath(grid, sr, sc, tr, tc)); // Expected output: 8
    }
}