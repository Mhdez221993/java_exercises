package Programs.BasicPrograms.PrintPattern;

public class DownTrianglePattern {
    static void printPattern(String pattern, int rows) {
      for (int i = rows; i >= 1; i--) {
          for (int j = i; j < rows; j++)
              System.out.print(" ");

          for (int j = 1; j <= (2*i-1); j++) {
              if (j == 1 || i == rows || j == (2*i-1))
                  System.out.print(pattern);
              else
                  System.out.print(" ");
          }

          System.out.println();
      }
    }

    public static void main(String[] args) {
        printPattern("*", 9);
    }
}
