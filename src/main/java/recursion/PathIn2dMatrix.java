package recursion;

/**
 * Created by Raj on 9/8/17.
 */
public class PathIn2dMatrix {

    private static int noOfPathIn2DMatrix(int[][] array, int i, int j) {
        int m = array.length;
        int n = array[0].length;
        if (i == m -1 || j == n -1) {
            return 1;
        }

        int down = noOfPathIn2DMatrix(array, i +1,j);
        int right = noOfPathIn2DMatrix(array, i,j + 1);

        return down + right;
    }

    public static void main(String[] args) {

        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }

        System.out.println(noOfPathIn2DMatrix(arr));
        noOfPathIn2DMatrix(arr);
    }

    public static int noOfPathIn2DMatrix(int[][] array) {
        return noOfPathIn2DMatrix(array, 0, 0);
    }
}
