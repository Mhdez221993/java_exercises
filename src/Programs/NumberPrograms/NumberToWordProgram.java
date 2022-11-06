package Programs.NumberPrograms;

public class NumberToWordProgram {
    static void numberToWords(char num[]) {
        // determine the number of digits in the given number
        int len = num.length;

        // checks the given number has number or not
        if(len == 0){
            System.out.println("The string is empty");
            return;
        }

        // here, we have specified the length of the number to 4
        if (len > 4) {
            System.out.println("\n The given number has more than 4 digits");
            return;
        }

        // string type array for one-digit number
        String[] oneDigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // string type array of two digits
        // the first index is empty because it makes indexing easy
        String[] twoDigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        // string type array of tens multiples
        String[] multiplesOfTen = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        // string type array of power of tens
        String[] powerOfTens = new String[] {"Hundred", "Thousand"};

        // the valueOf() method returns the string representation of the character array argument
        System.out.print(String.valueOf(num) + ": ");

        if (len == 1) {
            //if the above condition returns true, it accesses the corresponding index and prints the value of that index
            //[num[0]-'0']: getting the number equal the decimal value of the character (assuming the char is the digit)
            System.out.println(oneDigit[num[0]-'0']);
            return;
        }

        int x = 0;
        // executes until num does not become not '\0'
        while (x < num.length) {
            if (len >= 3) {
                if (num[0]-'0' != 0) {
                    System.out.print(oneDigit[num[x]-'0'] + " ");


                    System.out.print(oneDigit[len - 3] + " ");
                }
                --len;
                // executes if the given number has two digits
            } else {
                // the if-statement handles the numbers from 10 to 19 only
                if (num[x]-'0' == 1) {
                    //the logic behind sum up the digits is that we will use the sum for accessing the index of the array
                    //for example: 17, sum of digits = 8
                    //we will access the 8th index in twodigits[] array i.e. Seventeen
                    int sum = num[x]-'0' + num[x + 1]-'0';
                    System.out.println(twoDigits[sum]);
                    return;

                } else if (num[x]-'0' == 2 && num[x + 1]-'0' == 0) {
                    System.out.println("Twenty");
                    return;

                    // the else block handles the numbers from 21 to 99
                } else {
                    int i = (num[x]-'0');
                    if (i > 0)
                        System.out.print(multiplesOfTen[i] + " ");
                    else
                        System.out.print("");
                    ++x;

                    if (num[x]-'0' != 0)
                        System.out.println(oneDigit[num[x]-'0']);
                }
            }
            ++x;
        }
    }

    public static void main(String[] args) {
        //calling the user-defined method and that invokes another predefined method toCharArray()
        //the method toCharArray() converts the given number into character array

        numberToWords("1111".toCharArray());
        numberToWords("673".toCharArray());
        numberToWords("80".toCharArray());
        numberToWords("5".toCharArray());
        numberToWords("0".toCharArray());
        numberToWords("20".toCharArray());
        numberToWords("1000".toCharArray());
        numberToWords("12345".toCharArray());
        //passing empty string
        numberToWords("".toCharArray());
    }
}
