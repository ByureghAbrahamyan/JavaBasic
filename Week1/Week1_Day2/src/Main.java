import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքները
        //         և տպում է նվազագույն և առավելագույն արժեքներով էլեմենտների գումարը:
/*
        Scanner arr = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("Enter array's elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }

        System.out.print("Arrays = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
        }
        int sum = max + min;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
*/

        // Task 2. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքները
        //         և տպում է նվազագույն արժեքով էլեմենտի ինդեքսը։
/*
        Scanner arr = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("Enter array's elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }

        System.out.print("Arrays = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        int min = array[0];
        int min_index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                min_index = i;
            }
        }

        System.out.println("min = " + min);
        System.out.println("min_index = " + min_index);
        */

        // Task 3. Գրել ծրագիր, որը էկրանին կտպի A && B  || !B ^ A Բուլյան արտահայտության ճշտության աղյուսակը։
/*
        boolean[] table = {true, false};
        System.out.println(" A " + "  B " + "  Result");
        for (boolean A : table) {
            for (boolean B : table) {
                boolean result = (A && B) || !B ^ A;
                System.out.println(A + " " + B + " " + result);
            }
        }
    }
}
*/

        // Task 4. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքերը
        //         և տպում է բոլոր էլեմենտների գումարը:

        /*
        Scanner arr = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("Enter array's elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }

        System.out.print("Arrays = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
         */

        // Task 5. Գրել ծրագիր, որը էկրանին կտպի !(A && B)^(A && !B) Բուլյան արտահայտության ճշտության աղյուսակը։

        // 1-in eghanak
       /*
        boolean[] table = {true, false};
        System.out.println(" A " + "  B " + "  Result");
        for (boolean A : table) {
            for (boolean B : table) {
                boolean result = !(A && B)^(A && !B);
                System.out.println(A + " " + B + " " + result);
            }
        }
 */

        // 2rd eghanak
        /*
        boolean first_A;
        boolean second_B;
        boolean result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first_A boolean value: ");
        first_A = input.nextBoolean();

        System.out.print("Enter second_B boolean value: ");
        second_B = input.nextBoolean();

        // System.out.print("Enter third boolean value: ");
        // result = input.nextBoolean();

        result = first_A && second_B || !second_B ^ first_A;
        System.out.println(first_A + "\t" + second_B + "\t" + result);
*/

        // Task 6. Գրեք ծրագիր, որը թույլ կտա օգտվողին մուտքագրել տառ, ստուգել և տպել տառը բաղաձայն է, թե ձայնավոր:
/*
        Scanner my_letter = new Scanner(System.in);
        System.out.print("Enter your letter = ");
        char letter = my_letter.nextLine().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input. Please enter a valid letter.");
        } else {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                //|| letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
    }
}
*/

        // Task 7. Ամբողջ թվային զանգվածների էլեմենտների արժեքները և տպում է՝ համապատասխանող ինդեքսեներով
        //         էլեմնետների արտադրյալը էկրանին:
/*
        int[] arr1 = {4, 5, 7, 9};
        int[] arr2 = {7, 6, 2};
        int mul = 1;

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                mul = arr1[i] * arr2[i];
            }
            System.out.println("mul[" + i + "] = " + mul);
        }
    }
}
*/

        // Task 8. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել զանգվածի էլեմենտների արժեքները և
        //         տպում է դրանք հակառակ հերթականությամբ: Զանգվածը կարող է լինել ցանկացած տիպի։
/*
        Scanner arr = new Scanner(System.in);
        System.out.println("\nInput array elements ");
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        System.out.print("\nReverse array = [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
 */

        // Task 9. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել երկու ամբողջ թիվ, ստուգեք թվերը
        //         կարող են իրար վրա բաժանվել թե ոչ։
/*
        Scanner numbers = new Scanner(System.in);
        System.out.println("\nInput two numbers");

        System.out.print("Number1 = ");
        int number1 = numbers.nextInt();

        System.out.print("Number2 = ");
        int number2 = numbers.nextInt();

        System.out.println(number1 % number2 == 0 ? "Yes, numbers are divisible by each other." : "No! numbers aren't divisible by each other.");
    }
}
*/

        // Task 10. Գրեք ծրագիր, որն օգտվողին թույլ է տալիս մուտքագրել 12-ից մեծ ամբողջ թիվ և
        //           տպել այդ թիվը թվանշանների հակառակ հերթականությամբ։
/*
        Scanner my_number = new Scanner(System.in);
        System.out.println("\nEnter an integer greater than 12․");
        int number = my_number.nextInt();

        int reversedNum = 0;
        if (number > 12) {
            while (number != 0) {
                int digit = number % 10;
                reversedNum = (reversedNum * 10) + digit;
                number = number / 10;
            }
            System.out.println("ReversedNum = " + reversedNum);
        } else System.out.println("Please enter an integer greater than 12.");
    }
}
*/


        // Last task _ Problem 45
        /*
        Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
        Եռանկյունի, հնգանկյուն և վեցանկյուն թվերը ձևավորվում են հետևյալ բանաձևերով.
        Triangle (Եռանկյուն)      T = n(n + 1)/2    1, 3, 6, 10, 15, ...
        Pentagonal (Հինգանկյուն)  P = n(3n - 1)/2   1, 5, 12, 22, 35, ...
        Hexagonal (Վեցանկյուն)    H = n(2n - 1)     1, 6, 15, 28, 45, ...

        It can be verified that (Դա կարելի է ստուգել)`  T(285) = P(165) = H(143) = 40755

        Find the next triangle number that is also pentagonal and hexagonal.
        Գտե՛ք հաջորդ եռանկյան թիվը, որը նույնպես հնգանկյուն է և վեցանկյուն:
*/
        System.out.println("result = " + new Main().function());
    }
    public long function() {
        int i = 286;
        int j = 166;
        int k = 144;

        while (true) {
            long triangle = (long)i * (i + 1) / 2;
            long pentagonal = (long)j * (3 * j - 1) / 2;
            long hexagonal = (long) k * (2 * k - 1);

            long min = Math.min(Math.min(triangle, pentagonal), hexagonal);
            if(min == triangle && min == pentagonal && min == hexagonal ){
                System.out.println("i = " + i + "," + " j = " + j + ","+ " k = " + k);
                //return Long.toString(min);
               return min;
            }

            if(min == triangle) i++;
            if(min == pentagonal) j++;
            if(min == hexagonal) k++;
        }
    }
}