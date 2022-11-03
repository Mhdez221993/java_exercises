package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_13 {
    static void printNumberPatter(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(9);
    }
}
