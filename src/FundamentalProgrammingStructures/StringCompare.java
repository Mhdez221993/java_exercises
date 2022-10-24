package FundamentalProgrammingStructures;

/*
Section 1.5.3 has an example of two strings s and t so that
s.equals(t) but s != t. Come up with a different example that
doesn’t use substring
 */
public class StringCompare {
    public static void main(String[] args) {
        String greeting1 = "Hello, World!";
        String greeting2 =  new String("Hello, World!");

        System.out.println(greeting1.equals(greeting2));

        System.out.println(greeting1 != greeting2);
    }
}
