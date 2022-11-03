package Programs.BasicPrograms.PrintPattern;

public class AlphabetStarPattern {
    static void printPattern(String pattern, int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n/2; j++) {
                if ((j == 0 || j == n/2) || (i == 0 || i == n/2))
                    System.out.print(pattern);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern("*", 8);
    }
}
