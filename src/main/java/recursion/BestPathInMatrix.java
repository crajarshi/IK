package recursion;

/**
 * Created by Raj on 9/8/17.
 */
public class BestPathInMatrix {

    private static int bestPath(int[][] array, int i, int j) {
        int m = array.length;
        int n = array[0].length;
        if (i == m - 1 && j == n - 1)
            return array[i][j];
        if (i == m - 1)
            return array[i][j] + bestPath(array, i, j + 1);

        if (j == n - 1)
            return array[i][j] + bestPath(array, i + 1, j);

        int down = array[i][j] + bestPath(array, i + 1, j);
        int right = array[i][j] + bestPath(array, i, j + 1);
        return Math.max(down, right);

    }

    public static void main(String[] args) {

        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }

        System.out.println(bestPath(arr));
        bestPath(arr);
    }

    public static int bestPath(int[][] array) {
        return bestPath(array, 0, 0);
    }
}
