package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_14 {
    static void printNumberPatter(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(7);
    }
}
