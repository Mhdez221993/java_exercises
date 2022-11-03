package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_2 {
    static void printNumberPattern(int rows) {
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPattern(7);
    }
}
