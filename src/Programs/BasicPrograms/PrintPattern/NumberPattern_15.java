package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_15 {
    static void printNumberPatter(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");

            for (int j = i -1; j >= 1; j--)
                System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(9);
    }
}
