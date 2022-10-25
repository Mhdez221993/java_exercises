package FundamentalProgrammingStructures;

/*
A “Quine” is a program that, prints its
own source code. Write such a program in Java, using a text block.
 */

import java.io.*;

public class QuineReadingFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("QuineReadingFile.java")));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

// Program no finished yet