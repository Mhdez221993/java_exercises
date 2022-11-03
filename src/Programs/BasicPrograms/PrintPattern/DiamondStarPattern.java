package Programs.BasicPrograms.PrintPattern;

public class DiamondStarPattern {
    static void printPattern(String pattern, int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--)
                System.out.print(" ");

            System.out.print(pattern);

            for (int j = 1; j < 2*(i-1); j++)
                System.out.print(" ");

            if (i == 1)
                System.out.println();
            else
                System.out.println(pattern);
        }

        for (int i = rows-1; i >= 1; i--) {
            for (int j = rows; j > i; j--)
                System.out.print(" ");

            System.out.print(pattern);

            for (int j = 1; j < 2*(i-1); j++)
                System.out.print(" ");

            if (i == 1)
                System.out.println();
            else
                System.out.println(pattern);
        }
    }

    public static void main(String[] args) {
        printPattern("*", 15);
    }
}
