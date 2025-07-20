class SudokuSolver {
    // Function to solve the Sudoku
    static void solveSudoku(int[][] mat) {
        solve(mat);
    }

    // Helper recursive function to solve Sudoku
    private static boolean solve(int[][] mat) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (mat[row][col] == 0) { // Find empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(mat, row, col, num)) {
                            mat[row][col] = num;
                            if (solve(mat)) return true; // Recurse
                            mat[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Solved
    }

    // Function to check if num can be placed at mat[row][col]
    private static boolean isSafe(int[][] mat, int row, int col, int num) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (mat[row][i] == num || mat[i][col] == num) return false;
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (mat[i][j] == num) return false;
            }
        }

        return true;
    }

    // Function to print Sudoku
    private static void printSudoku(int[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] mat = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        System.out.println("Original Sudoku:");
        printSudoku(mat);

        solveSudoku(mat);

        System.out.println("\nSolved Sudoku:");
        printSudoku(mat);
    }
}
