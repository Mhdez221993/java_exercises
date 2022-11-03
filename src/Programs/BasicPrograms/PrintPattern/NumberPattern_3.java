package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_3 {
    static void printNumberPattern(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPattern(10);
    }
}
