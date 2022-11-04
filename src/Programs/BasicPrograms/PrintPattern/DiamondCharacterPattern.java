package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class DiamondCharacterPattern {
    static void printCharPatter(char[] alphabet, char user_alphabet) {
        int alphabet_number = 0;
        String[] diamond = new String[26];

        try {
            // search for letter number in the array alphabet
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == user_alphabet) {
                    alphabet_number = i;
                    break;
                }
            }

            // construct diamond
            for (int i = 0; i <= alphabet_number; i++) {
                diamond[i] = "";

                // add initial spaces
                for (int j = 0; j < alphabet_number - i; j++)
                    diamond[i] += " ";

                diamond[i] += alphabet[i];

                // add spaces between letters
                if (alphabet[i] != 'A') {
                    for (int j = 0; j < 2*i-1; j++)
                        diamond[i] += " ";

                    // add alphabet
                    diamond[i] += alphabet[i];
                }

                System.out.println(diamond[i]);
            }

            for (int i = alphabet_number -1; i >= 0; i--) {
                // Draw the second part of the diamond
                // prints the diamondArray in the reverse order
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Character between A to Z : ");

        char user_alphabet = in.next("[A-Z]").charAt(0);

        printCharPatter(alphabet, user_alphabet);

        in.close();
    }
}
