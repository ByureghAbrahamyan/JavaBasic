import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //         Arrays types

        // 1. int[] arr1 = new int [] {1,2,4};
        // 2. int[] arr2 = {1,2,3,4};
        // 3. int[] arr3 = new int[6];

        // Task 1. Հայտարարել int տիպի փոփոխական, որի արժեքը մուտքագրվելու է օգտվողի կողմից։
        /*
        Scanner my_x = new Scanner(System.in);
        System.out.print("x = ");

        int x = my_x.nextInt();
        System.out.print("x = " + x);
*/

        // Task 2. Հայտարարել char տիպի փոփոխական, որի արժեքը մուտքագրվելու է օգտվողի կողմից։
 /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("c = ");
        char c = scanner.next().charAt(0);
        System.out.println("c = " + c);
*/

        // Task 3. Գրեl ծրագիր, որը թույլ կտա օգտվողին մուտքագրել երկու ամբողջ թիվ և
        // պահել դրանց գումարը “total” անունով փոփոխականում:
/*
        Scanner my_numbers = new Scanner(System.in);
        System.out.println("Enter your two numbers");

        int number1 = my_numbers.nextInt();
        int number2 = my_numbers.nextInt();
        int sum = number1 + number2;

        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
        System.out.println("Sum = " + sum);
*/

        // Task 4. Գրել ծրագիր, որը թույլ կտա օգտվողին մուտքագրել իր տարիքը և պահել այն “age” անունով փոփոխականում։
        //         Էկրանին պետք է տպի հետևյալ ֆորմատով՝ « "You are [age] years old."։
/*
        Scanner my_age = new Scanner(System.in);
        System.out.print("Enter your age ");

        int age = my_age.nextInt();
        System.out.println("You are " + age + " years old.");
 */

        // Task 5. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքները,
        //         և տպում է դրանցից առավելագույնի արժեքը:
/*
        System.out.println("Array = ");
        Scanner my_array = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = my_array.nextInt();
        }

        System.out.print("Arrray = [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("max = " + max);
*/

        // Task 6. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի
        //         էլեմենտների արժեքները և տպում է էկրանին նվազագույնի արժեքը:
/*
        System.out.println("Array = ");
        Scanner my_array = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = my_array.nextInt();
        }

        System.out.print("Arrray = [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min);
*/

        // Task 7. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքները
        //         և տպում է առավելագույն արժեքով էլեմենտի ինդեքսը։
/*
        System.out.println("Array = ");
        Scanner my_array = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = my_array.nextInt();
        }

        System.out.print("Arrray = [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        int max = arr[0];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                j = i;
            }
        }
        System.out.println("Max index is = " + j);
 */

        // Task 8. Գրել ծրագիր, թույլ է տալիս օգտվողին մուտքագրել իր տարիքը և տպում է էկրանին  հաղորդագրություն
        //         հետևյալ պայմանների հիման վրա.

        //         a.Եթե տարիքը 18-ից պակաս է,  տպեք էկրանին «Դուք անչափահաս եք»:
        //         b.Եթե տարիքը 18-ից 65 տարեկան է (ներառյալ), տպեք էկրանին  «Դուք չափահաս եք»:
        //         c.Եթե տարիքը 65-ից բարձր է, տպեք էկրանին  «Դու տարեց քաղաքացի ես»:
/*
        System.out.print("Enter your age = ");
        Scanner user_age = new Scanner(System.in);
        int age = user_age.nextInt();

        if(age < 18){
            System.out.println("You are a minor.");
        } else
            if(age > 18 && age <= 65){
                System.out.println("You are a adult.");
            }
            else
                if(age > 65){
                    System.out.println("You are a senior citizen.");
                }
*/

        // Task 9. Գրել ծրագիր, որը կարդում է աշակերտի ստացած գնահատականները առարկայից և ցուցադրում համապատասխան
        //         գնահատականը՝ ըստ հետևյալ պայմանների.

        //         Գնահատականը եթե 90-ից 100 (ներառյալ)՝ A դասարան
        //         Գնահատականը եթե 80-ից 89-ը՝ B դասարան
        //         Գնահատականը եթե 70-ից 79-ը՝ C դասարան
        //         Գնահատականը եթե 60-ից 69-ը՝ D դասարան
        //         60-ից ցածր գնահատականներ. Դասարան E
/*
        System.out.print("Enter students grade = ");
        Scanner students_grade = new Scanner(System.in);
        int grade = students_grade.nextInt();

        if(grade > 90 && grade <= 100)
            System.out.println("A class");
        if (grade > 80 && grade < 89)
            System.out.println("B class");
        if(grade > 70 && grade < 79)
            System.out.println("C class");
        if(grade > 60 && grade < 69)
            System.out.println("D class");
        if(grade < 60)
            System.out.println("E class");
 */

        // Task 10. Գրեք ծրագիր, որը ստանում է մարդու հասակը (սանտիմետրերով) և ստուգում, թե արդյոք դա իրավասու է
        //         որոշակի զբոսանքի զվարճանքի այգում:
        //         Ուղևորության համար անհրաժեշտ է նվազագույնը 150 սմ բարձրություն:
        //         Ցուցադրել «Դուք համապատասխանում եք»: եթե հասակը մեծ է կամ հավասար է 150 սմ։
        //         Հակառակ դեպքում ցուցադրեք «Ներողություն, դուք չեք համապատասխանում »:
/*
        System.out.println("Enter your height");
        Scanner user_height = new Scanner(System.in);

        int height = user_height.nextInt();

        if(height >= 150)
            System.out.println("Sorry, you are not eligible");
        else
            if(height < 150 && height > 0)
            System.out.println("You  are eligible");
 */

// Task 11. Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//          By starting with 1 and 2, the first 10 terms will be:
//          1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …
//          By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//          find the sum of the even-valued terms.
//___________________________________________________________________________________________________________________
//         Ֆիբոնաչիի հաջորդականության յուրաքանչյուր նոր անդամ առաջանում է նախորդ երկու անդամները ավելացնելով:
//         Սկսելով 1-ից և 2-ից՝ առաջին 10 անդամները կլինեն.
//         1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …
//         Հաշվի առնելով Ֆիբոնաչիի հաջորդականության այն տերմինները, որոնց արժեքները չեն գերազանցում չորս միլիոնը,
//         գտի՛ր զույգ արժեքավոր տերմինների գումարը:

        //1in eghanak
/*
        System.out.println(sumFibonacci(4_000_000));

    }

    public static int sumFibonacci(int n) {
        int sum = 0;

        int first = 0;
        int second = 1;

        while (second <= n) {
            if (second % 2 == 0)
                sum += second;

            int cur = first;
            first = second;
            second += cur;
        }
        return (sum);
    }
}
*/

        // 2rd eghanak
        /*
        fibFunc(10);
    }

    public static void fibFunc(int num) {

        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber + " ");

        int sum = 0;

        for (int i = 2; i < num; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;

            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }
        }
        System.out.println("\nsum = " + sum);
    }
}
*/

// Task 12. If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//          The sum of these multiples is 23.
//          Find the sum of all the multiples of 3 or 5 below 1000.
//___________________________________________________________________________________________________________________
//          Եթե թվարկենք 10-ից ցածր բոլոր բնական թվերը, որոնք բազմապատիկ են 3-ի կամ 5-ի, ապա կստանանք 3, 5, 6 և 9:
//          Այս բազմապատիկների գումարը 23 է։
//          Գտե՛ք 1000-ից ցածր 3-ի կամ 5-ի բոլոր բազմապատիկների գումարը:
/*
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int num = number.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println("Sum of multiples of 3 or 5 below " + num + " = " + sum);
    }
}
*/


// Task 13. The prime factors of 13195 are 5, 7, 13 and 29.
//          What is the largest prime factor of the number 600851475143?
//_________________________________________________________________________
//          13195 թվի պարզ գործակիցներն են 5, 7, 13 և 29:
//          Ո՞րն է 600851475143 թվի ամենամեծ պարզ գործակիցը:
/*
        long number = 13195;
        //long number = 600851475143L;
        long result = findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + result);
    }

    private static long findLargestPrimeFactor(long num) {
        long i;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                i--;
            }
        }
        return i;
    }
}
*/


// Task 14. A palindromic number reads the same both ways.
//          The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99
//          Find the largest palindrome made from the product of two 3-digit numbers.
//__________________________________________________________________________________________________
//        Պալինդրոմային թիվը երկու կողմից էլ նույնն է կարդում:
//        Երկու երկնիշ թվերի արտադրյալից պատրաստված ամենամեծ պալինդրոմը 91 × 99 = 9009 է:
//        Գտի՛ր երկու եռանիշ թվերի արտադրյալից կազմված ամենամեծ պալինդրոմը:
/*
        System.out.println(palindromeNum());
    }
    public static int palindromeNum() {

        int result = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 10; j--) {
                if (i * j > result && palindrome(i * j)) {
                    result = i * j;
                }
            }
        }
        return result;
    }

    public static boolean palindrome(int n) {
        String strNum = "" + n;
        for (int i = 0; i < strNum.length() / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(strNum.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
*/

//1
/*
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int num = number.nextInt();                 // 121

        int temp, sum = 0;
        temp = num;

        while (num > 0) {                            // 121 > 0
            sum = (sum * 10) + num % 10;           // sum = (0*10) + 1 = 1
            num = num / 10;                        // num = 121 / 10 = 12
        }

        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome number");
*/
    }
}