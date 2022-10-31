package StringMethods.CharAt;

import java.util.ArrayList;

public class NumberOfVowelsInAString {
    ArrayList<Character> al;

    // constructor for creating and assigning values to the ArrayList al
    NumberOfVowelsInAString() {
        al = new ArrayList<Character>();
        al.add('A'); al.add('E');
        al.add('a'); al.add('e');
        al.add('I'); al.add('O');
        al.add('i'); al.add('o');
        al.add('U'); al.add('u');
    }

    // a method that checks whether the character c is a vowel or not
    private boolean isVowel(char c) {
        for (int i = 0; i < al.size(); i++) {
            if (c == al.get(i)) return  true;
        }
        return  false;
    }

    // a method that calculates vowels in the String s
    public int countVowels(String s) {
        int countVowel = 0; // store total number of vowels
        int size = s.length();

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (isVowel(c)) countVowel++;
        }
        return  countVowel;
    }

    public static void main(String[] args) {
        NumberOfVowelsInAString obj = new NumberOfVowelsInAString();

        String str = "JavaPoint is a great site for learning Java.";

        int noOfVowel = obj.countVowels(str);

        System.out.println("String: " + str);

        System.out.println("Total number of vowels in the string are: "+ noOfVowel);
    }
}
