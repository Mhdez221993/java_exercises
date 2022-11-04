package Programs.BasicPrograms.PrintPattern;

public class K_ShapeAlphabetPattern {
    static void printAlphabetPatter(int alphabet) {
        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                System.out.print((char) (alphabet+j) + " ");

            System.out.println();
        }

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print((char) (alphabet+j) + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int alphabet = 65;
        printAlphabetPatter(alphabet);
    }
}
