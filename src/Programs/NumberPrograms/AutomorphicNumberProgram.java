package Programs.NumberPrograms;

/*
A number is called an automorphic number if and only if the square of the given number ends with the same number itself.
*/

public class AutomorphicNumberProgram {
    static boolean isAutomorphic(int num) {
        int square = num * num;

        while (num > 0) {
            if (num % 10 != square % 10)
                return false;

            num /= 10;
            square /= 10;
        }

        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
        System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }
}
