package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_19 {
    static void printNumberPatter(int rows) {

        for (int i = 1; i <= rows; i++) {
            int number = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number = number+rows-j;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(9);
    }
}
