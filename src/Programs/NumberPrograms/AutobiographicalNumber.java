package Programs.NumberPrograms;

import java.util.Scanner;

public class AutobiographicalNumber {
    static boolean isAutobiographical(int n) {
        String str = String.valueOf(n);

        // create an array of n
        int digits[] = new int[str.length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < digits.length; i++) {
            int counter = 0;

            for (int j = 0; j < digits.length; j++) {
                if (i == digits[j])
                    counter++;
            }

            if (counter != digits[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = in.nextInt();

        if (isAutobiographical(n))
            System.out.println(n + " is autobiographical");
        else
            System.out.println(n + " is not autobiographical");
    }
}
