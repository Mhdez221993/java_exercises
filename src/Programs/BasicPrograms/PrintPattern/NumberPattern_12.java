package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_12 {
    static void printNumberPatter(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--)
                System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(9);
    }
}
