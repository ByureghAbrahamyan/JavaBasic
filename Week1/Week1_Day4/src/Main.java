import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրեք ծրագիր, որը ամբողջ թվային զանգվածի բոլոր զույգ էլեմենտները
        //         նույն զանգվածի մեջ՝ կտեղավորի զանգվածի սկզբից, իսկ կենտերը վերջից:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's size = ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        System.out.print("\nNewArray = ");
        firstEvenLastOdd(array);
        System.out.println(Arrays.toString(array));
    }
    public static void firstEvenLastOdd(int[] arr) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex < lastIndex) {
            while (arr[firstIndex] % 2 == 0 && firstIndex < lastIndex) {
                firstIndex++;
            }

            while (arr[lastIndex] % 2 != 0 && firstIndex < lastIndex) {
                lastIndex--;
            }

            if (firstIndex < lastIndex) {
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[lastIndex];
                arr[lastIndex] = temp;
            }
        }
    }
}
*/

        // Task 2. Գրեք ծրագիր, որը նման է պարզ հաշվիչի։ Հորդորեք օգտվողին մուտքագրել երկու թիվ
        //         և գործողություն (+, -, *, /) և ցուցադրել արդյունքը: Շարունակեք օգտատիրոջից
        //         ստանալ սիմվոլներ, քանի դեռ չի մուտքագրել Q(դուս գալ ծրագրից) սիմվոլը:
        /*
        char choice = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter two number:");
            System.out.print("Number1 = ");
            double number1 = scanner.nextDouble();
            System.out.print("Number2 = ");
            double number2 = scanner.nextDouble();
            System.out.print("Enter action = ");
            char action = scanner.next().charAt(0);

            double result = 0;
            switch (action) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Enter +, -, *, /");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Do you want to continue? (Enter Q to quit): ");
            choice = scanner.next().charAt(0);

        } while (Character.toUpperCase(choice) != 'Q');
    }
}
*/

        // Task 3. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել char-երի զանգված և տողը վերածում է մեծատառի։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char value.");

        char[] charArray = new char[4];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        System.out.print("CharArray = ");
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] > 64 && charArray[i] < 91)
                System.out.print(charArray[i] + " ");
        }
   }
}
 */

        // Task 4. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել և թվերի միջև կկատարի AND գործողություն և կտպի էկրանին արդյունքը:
        // Task 5. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել և թվերի միջև կկատարի OR գործողություն և կտպի էկրանին արդյունքը:
        // Task 6 .Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել թիվ և թվերի միջև կկատարի XOR գործողություն և կտպի էկրանին արդյունքը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter two number:");
        System.out.print("Number1 = ");
        int number1 = scanner.nextInt();
        System.out.print("Number2 = ");
        int number2 = scanner.nextInt();

        int result1 = number1 & number2;
        int result2 = number1 | number2;
        int result3 = number1 ^ number2;

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
    }
}
 */

        // Task 7. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել char-երի զանգված և հեռացնում է կրկնվող  նիշերը տողից:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char value.");

        char[] charArray = new char[6];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        System.out.print("CharArray = [");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.print("]");

        boolean[] seen = new boolean[256];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (!seen[charArray[i]]) {
                stringBuilder.append(charArray[i]);
                seen[charArray[i]] = true;
            }
        }
        System.out.println("\nStringBuilder: " + stringBuilder.toString());
    }
}
*/

        // Task 8. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջթվային զանգվածի էլեմենտների արժեքները
        //         և  կգտնի զանգվածի ամենամեծ և ամենափոքր տարրերի ինդեքսների տարբերությունը:
/*
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter array's elements");

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scannner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        int max = array[0];
        int min = array[0];
        int min_index = 0;
        int max_index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                max_index = i;
            }
            if(array[i] < min) {
                min = array[i];
                min_index = i;
            }
        }

        int deduction = max_index - min_index;

        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);

        System.out.println("Max index = " + max_index);
        System.out.println("Min index = " + min_index);
        System.out.println("Deduction = " + deduction);
*/

        // Task 9. Sum of Primes: Write a function that calculates the sum of all prime numbers less than a given number.
/*
        int number = 10;

        long sum = sumOfPrimes(number);
        System.out.println("Sum of prime numbers less than " + number + " : " + sum);
        }
        static boolean isPrimeFunc ( int number){

            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        static long sumOfPrimes ( int limit){
            long sum = 0;
            for (int i = 2; i < limit; i++) {
                if (isPrimeFunc(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
*/

        // Task 10. Object Manipulation: Create an object that represents a student with properties like name, age, and scores
        // for different subjects. Write methods to calculate the average score, display student details, and add new scores.
/*
        Student student = new Student("Anna", 25, 50, 20, 20);
        System.out.println("Enter average = " + student.averageFunc());
*/

        // Task 11.1. Create an array of 10 random integers.
/*
        Random random = new Random();
        int[] randomIntegers = new int[10];

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = random.nextInt(300);
        }

        for (int n : randomIntegers) {
            System.out.println(n + " ");
        }
    }
}
 */

        // Task 11.2. Ask the user to enter a number and check if it exists in the array.
        //            Խնդրեք օգտվողին մուտքագրել թիվ և ստուգել, թե արդյոք այն կա զանգվածում:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        boolean numberExist = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                numberExist = true;
                break;
            }
        }

        if (numberExist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
*/
        // Task 11.3. Sort the array in ascending order and print the sorted values.
        //            Տեսակավորել զանգվածը աճման կարգով և տպել տեսակավորված արժեքները։
/*
        int[] numbers = {9, 1, 3, 5, 6, 2, 4, 7, 8, 10};
        System.out.println("\nPrint numbers array:");

        boolean swap = true;

        while (swap) {
            swap = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                while (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    swap = true;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}
 */

        // Task 12. Իրականացնել ֆունկցիա, որը ստանում է ամբողջ թվային պարամետր և վերադարձնում է n-րդ Ֆիբոնաչիի թիվը։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fibonacci index:");
        int number = scanner.nextInt();
        System.out.println("Index of number is " + fibNumberOfIndex(number));
    }

    public static int fibNumberOfIndex(int number) {
        int sum = 0;
        if (number == 0 || number == 1) {
            return 1;
        } else {
            for (int i = 0; i < 100; i++) {

            }
            sum = fibNumberOfIndex(number - 1) + fibNumberOfIndex(number - 2);
            return sum;
        }
    }
}
 */

        // Task 13. Table of a Number: Գրել ֆունկցիա, որը կտպի տրված թվի բազմապատկման աղյուսակը։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        TableOfNumber(number);
    }

    public static void TableOfNumber(int number) {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            sum = i * number;
            System.out.println(number + " * " + i + " = " + sum);
        }

    }
}
*/

        // Task 14. Գրել տրված թվի ֆակտորիալը հաշվող իտերատիվ ֆունկցիա։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        System.out.println(number + "'s number factorial is a " + factorialFunc(number) + ".");
    }

    public static long factorialFunc(int number) {

        if (number < 0) {
            System.out.println("Please input positive number.");
        }

        long mul = 1;
        for (int i = 2; i <= number; i++) {
            mul *= i;
        }
        return mul;
    }
}
*/

        // Task 15. Իրականացնել ֆունկցիա, որն ընդունում է թիվ և վերադարձնում նրա թվանշանների գումարը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        NumberFunction(number);
    }

    public static void NumberFunction(int number) {

        int sum = 0;

        while (number != 0) {
            sum += number % 10; // 2
            number = number / 10;
        }
        System.out.println("sum = " + sum);
    }
}
*/

        // Task 16. Իրականացնել ֆունկցիա, որը ստուգում է՝ թիվը պարզ է, թե ոչ։ Պարզ է համարվում այն թիվը,
        //          որը առանց մնացորդ կարող է բաժանվել ինքը իր վրա և մեկի վրա (մեկը պարզ թիվ չէ)։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        PrimeNumberFunction(number);
    }

    public static void PrimeNumberFunction(int number){

        if(number == 0 || number == 1){
            System.out.println("This isn't a prime number");
        }
        else if(number == 2 || number == 3){
            System.out.println("This is a prime number");
        }
        else if(number % 2 == 0 || number % 3 == 0){
            System.out.println("This isn't a prime number");
        }
        else {
            for (int i = 5; i * i < number; i += 6) {
                if (number % i == 0 && number % 1 == 0) {
                    System.out.println("This isn't a prime number");
                }
            }
            System.out.println("This is a prime number");
        }
    }
 */

        // Task 17. Իրականացնել int տիպի արժեք վերադարձնող ֆունկցիա, եթե ֆունկցային փոխանցված ամբողջ թիվը կարող
        //          է արտահայտվել երկու պարզ թվերի գումարով վերադարձնում է՝ 1, հակառակ դեպքում ֆունկցիան կվերադարձնի՝ 0:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();

        int result = SumOfPrimes(number);

        if (result == 1) {
            System.out.println(number + " can be expressed as the sum of two prime numbers.");
        } else {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }
    public static int SumOfPrimes(int number){
        if(number <= 2) {
            return 0;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                return 1;
            }
        }
        return 0;
    }
    public static boolean isPrime(int number){
        if(number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}