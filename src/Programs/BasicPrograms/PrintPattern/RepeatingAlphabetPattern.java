package Programs.BasicPrograms.PrintPattern;

public class RepeatingAlphabetPattern {
    static void printAlphabetPatter(int alphabet) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print((char) (alphabet+i) + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int alphabet = 65;
        printAlphabetPatter(alphabet);
    }
}
