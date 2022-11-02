package Programs.BasicPrograms.PrintPattern;

public class LeftTriangleStarPattern {
    static void printPatter(String pattern, int rows) {
        for (int i = 0; i < rows; i++) {

            for (int j = 2*(rows - i); j >= 0; j--)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print(pattern);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatter("* ", 6);
    }
}
