import java.util.Random;

public class Main {
    public static void swapMax(int[] row) {
        int max_id = 0;
        for (int i = 1; i < row.length; ++i)
            if (row[i] > row[max_id])
                max_id = i;

        int stash = row[0];
        row[0] = row[max_id];
        row[max_id] = stash;
    }

    public static int[][] generateArray(int n, int m) {
        Random rand = new Random();
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                result[i][j] = rand.nextInt(10);
        return result;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] array) {
        for (int[] row : array)
            swapMax(row);
    }

    public static void main(String[] args) {
        int[][] array = generateArray(6, 7);
        printArray(array);
        findMax(array);
        System.out.println();
        printArray(array);
    }
}
