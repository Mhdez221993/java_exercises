package Programs.BasicPrograms.PrintPattern;

public class NumberPattern_9 {
    static void printNumberPatter(int rows) {
        for (int i = 1; i <= rows; i++) {
            int number;

            if (i%2 == 0){
                number = 0;

                for (int j = 1; j <= i; j++){
                    System.out.print(number);
                    number = (number == 0) ? 1 : 0;
                }

            } else {
                number = 1;

                for (int j = 1; j <= i; j++){
                    System.out.print(number);
                    number = (number == 0) ? 1 : 0;
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPatter(9);
    }
}
