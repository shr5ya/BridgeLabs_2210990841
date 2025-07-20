public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
