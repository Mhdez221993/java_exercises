package Programs.BasicPrograms.PrintPattern;

public class TriangleCharacterPattern {
    static void printAlphabetPatter(int alphabet, int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j >= i; j--)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print((char) (alphabet + j) + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int alphabet = 65;
        int rows = 8;
        printAlphabetPatter(alphabet, rows);
    }
}
