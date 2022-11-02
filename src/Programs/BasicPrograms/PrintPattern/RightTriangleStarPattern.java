package Programs.BasicPrograms.PrintPattern;

/*
We have classified the Java pattern program into three categories:

    Start Pattern

    Number Pattern

    Character Pattern
 */
public class RightTriangleStarPattern {
    static void printPatter(String pattern, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(pattern);


            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatter("* ", 5);
    }
}
