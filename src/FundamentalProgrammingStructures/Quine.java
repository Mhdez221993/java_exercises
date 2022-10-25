package FundamentalProgrammingStructures;

/*
A “Quine” is a program that, without reading any input or file, prints its
own source code. Write such a program in Java, using a text block.
 */

public class Quine {
    public static void main(String[] args) {
        char c=34;
        System.out.println(s+c+s+c+';'+'}');
    }
    static String s="public class Quine { public static void main(String[] args) { char c=34; System.out.println(s+c+s+c+';'+'}'); } static String s=";
}

