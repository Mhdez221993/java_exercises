package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_4 {
    static void printNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            int n = 8;

            for (int j = 1; j <= n -i; j++)
                System.out.print(" ");

            for (int j = i; j >= 1; j--)
                System.out.print(j);

            for (int j = 2; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }

        for (int i = rows -1; i >= 1; i--) {
            int n = 8;

            for (int j = 1; j <= n -i; j++)
                System.out.print(" ");

            for (int j = i; j >= 1; j--)
                System.out.print(j);

            for (int j = 2; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }

    }

    public static void main(String[] args) {
        printNumberPattern(4);
    }
}
