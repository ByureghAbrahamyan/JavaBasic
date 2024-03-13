import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. CustomSqrt method:
        //         Calculates the square root of a non-negative number using Newton's method for better accuracy.
        // Հաշվում է ոչ բացասական թվի քառակուսի արմատը՝ օգտագործելով Նյուտոնի մեթոդը՝ ավելի լավ ճշգրտության համար:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            double result = customSqrt(num);
            System.out.println("Square root of " + num + " is approximately: " + result);
        }
    }
    public static double customSqrt(double num) {

        double x0 = num / 2.0;
        double x1;

        do {
            x1 = (x0 + num / x0) / 2.0;
        }
        while (Math.abs(x1 - x0) >= 1e-8);

        return x1;
    }
}
*/

        // Task 2. CustomPower method:
        //         Calculates the power of a base to an exponent, including handling negative exponents.
        //         Returns x to the power of y, throwing an exception if the result overflows an int.
/*
        int num = 4;
        int exp = 5;

        int result = customPower(num, exp);
        System.out.println("Result = " + result + " ");
    }

    public static int customPower(int base, int exp) {
        if (exp < 0) {
            if (base == 0) {
                System.out.println("Cannot raise 0 to a negative exponent");
            }
            return 1 / customPower(base, -exp);
        } else if (exp == 0) {
            return 1;
        } else {
            int s = 1;
            for (int i = 0; i < exp; ++i) {
                s *= base;
            }
            return s;
        }
    }
}
 */

        // Task 3. CustomAbs method:
        //         Calculates the absolute value of a number.
/*
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int result = customAbs(num);
        System.out.println("ABS = " + result);
    }

    public static int customAbs(int number){

        if(number >= 0){
            return number;
        }
        else return customAbs(-number);
    }
}
 */

        // Task 4. CustomGCD method:
        //         Computes the greatest common divisor (GCD) of two integers using the Euclidean algorithm.

/*
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();

        int gcd = customGCD(num1, num2);
        System.out.println("GCD of  " + num1 + " and " + num2 + " is` " + gcd);
    }

    public static int customGCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;  // temp = 12
            n2 = n1 % n2;   // n2 = 144 % 12
            n1 = temp;      // n1 = 144
        }
        return n1;
    }
}
*/

        // Task 5. CustomIsSquare method
        //         Tests whether x is a perfect square, for any value x.
/*
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        int square = customIsSquare(num);

        if(square != -1){
            System.out.println("Is " + num + " a perfect square` " + square);
        }
    }
    public static int customIsSquare(int num) {

        if(num < 0) {
            System.out.println("Enter positive number.");
            return -1;
        }

        int x = 1;

        for (int i = 1; i < num; i++) {
            int temp = num / i;
            if(temp == i)
                x = temp;
        }
        return x;
    }
}
 */

        // Task 6. OtherCustomSquare method:
        //         Calculates the square of a number.
        //         Calculates the cube of a number.
/*
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        int square = customSquare(num);
        int cube = customCube(num);
        System.out.println("Is " + num + " a perfect square` " + square);
        System.out.println("Is " + num + " a perfect cube` " + cube);

    }
    public static int customSquare(int num){
        int square = num * num;
        return square;
    }

    public static int customCube(int num){
        int cube = num * num * num;
        return cube;
    }
}
 */

        // Task 7. CustomAverage method:
        //         Computes the average of an array of numbers.
/*
        int[] array = {1, 2, 3, 4, 5};
        int result = customAverage(array);
        System.out.println("Average = " + result);
    }
    public static int customAverage(int[] arr){

        int sum = 0;
        int avg = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        System.out.println("Sum = " + sum);
        return avg;
    }
}
*/

        // Task 8. CustomExponent method:
        //         Computes the exponentiation of a base to an exponent.
/*
        int num = 4;
        int exp = 5;

        int result = customPower(num, exp);
        System.out.println("Result = " + result + " ");
    }

    public static int customPower(int base, int exp) {
        if (exp < 0) {
            if (base == 0) {
                System.out.println("Cannot raise 0 to a negative exponent");
            }
            return 1 / customPower(base, -exp);
        } else if (exp == 0) {
            return 1;
        } else {
            int s = 1;
            for (int i = 0; i < exp; ++i) {
                s *= base;
            }
            return s;
        }
    }
}
*/

        // Task 9. CustomPrimeFactors method.
        //	       Custom function to find all prime factors of a number.

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        List<Integer> primeFactorsList = findPrimeFactors(num);
        System.out.print("All prime factors of a " + num + " is a` " + primeFactorsList);

    }
    public static List<Integer> findPrimeFactors(int num) {

        List<Integer> primeFactors = new ArrayList<>();
        while(num % 2 == 0) {
            primeFactors.add(2);
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while( num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }

        if(num > 2) {
            primeFactors.add(num);
        }
        return primeFactors;
    }
}


        // Task 10. CustomIsPalindrome method.
        //      	Custom function to check if a number is a palindrome.
/*
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int result = customIsPalindrome(num);

        if(result == 1) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
    public static int customIsPalindrome(int num){
        int originNum = num;
        int reverse = 0;
                                     // 121
        while(num != 0) {
            int digit = num % 10;            // 1
            reverse = reverse * 10 + digit;
            num = num / 10;                // 12
        }
        if(originNum == reverse){
            return 1;
        } else {
            return 0;
        }

    }
}
*/
