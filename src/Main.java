import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};

        int[][] matrix = new int[][] {
                {10, 11, 12},
                {20, 22, 23}
        };

        System.out.println(matrix.length);
        System.out.println(Arrays.toString(matrix[0]));
    }
}