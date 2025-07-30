import java.util.*;

public class Matrices {
    public static boolean search(int arr[][], int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println(key + " is found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element is not found");

        return false;
    }

    public static int max(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println("Maximum value is " + max);
        return max;

    }

    public static int min(int arr[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];

                }
            }
        }
        System.out.println("Minimum value is " + min);
        return min;

    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;
        while (startColumn <= endColumn && startRow <= endRow) {

            // top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }

    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;

        // //O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j || j == matrix.length - i - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // O(n)
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        System.out.println("Diagonal sum is " + sum);
    }

    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        // int matrix[][] = new int[3][3];

        // System.out.println("enter matrix");
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // matrix[i][j] = scan.nextInt();
        // }
        // }
        // System.out.println("output");
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        // search(matrix, 5);
        // max(matrix);
        // min(matrix);
        // scan.close();

        // int matrix[][] = { { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };

        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        // printSpiral(matrix);
        diagonalSum(matrix);
    }
}
