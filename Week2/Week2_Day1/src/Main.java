import java.util.Scanner;
import static java.lang.Float.floatToRawIntBits;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրել ռեկուրսիվ ֆունկցիա, որը ստանում է n բնական թիվ և տպում է n-ից 0 թվերը։
/*
        int n = 10;
        printNumbers(n);
    }
    public static void printNumbers(int n){

        if(n >= 0) {
            System.out.print(n + " ");
            printNumbers(n - 1);
        }
    }
}
*/

        // Task 2. Գրել ռեկուրսիվ ֆունկցիա, որը ստանում է n բնական թիվ և տպում է 0-ից n թվերը։
/*
        int n = 10;
        printNumbers(n);
    }
    public static void printNumbers(int n){

        if(n >= 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}
*/

        // Task 3. Գրել ռեկուրսիվ ֆունկցիա, որը ստանում է ամբողջ թվային զանգված և տպում է զանգվածի էլեմենտները էկրանին։
/*
        int[] arr = {55, 1, 10, 3, 7, 99};
        int index = 0;
        arrFunc(arr, index);
    }
    public static void arrFunc( int[] arr, int index){

        if(index < arr.length) {
            System.out.print(arr[index] + " ");
            arrFunc(arr, index + 1);
        }
    }
}
*/

        // Task 4. Իրականացնել ռեկուրսիվ ֆունկցիա, որն ընդունում է թիվ և վերադարձնում նրա թվանշանների գումարը:
/*
        int number = 512;
        System.out.println(digitSum(number));
    }
    public static int digitSum(int num){
        int sum = 0;

        if(num > 0) {
            int digit = num % 10;      // 5
            sum = num / 10;            // 12
            return digit + digitSum(sum);
        }
        return 0;

    }
}
 */

        // Task 5. Իրականացնել ֆունկցիա, որը սորտավորում է ամբողջ թվով զանգվածի տարրերը:


        // Task 6. Գրեք ֆունկցիա, որը թույլ կտա մուտքագրել որոշակի float տիպի փոփոխականի արժեք։
        //         Տպել էկրանին տվյալ float տիպի փոփոխականի հիշողության մեջ պահված երկուական
        //         կոդին համապատասխանող ամբողջ թվային արտապատկերումը։

/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();
        int value = Float.floatToIntBits(floatValue);
        System.out.println(Integer.toBinaryString(value));
    }
}
*/

        // Task 7. Իրականացնել ռեկուրսիվ ֆունկցիա, որը հաշվում է երկու թվերի ամենամեծ ընդհանուր բաժանարարը։

//        int number1 = 25;
//        int number2 = 45;
//
//        int gcd = calculateGCD(number1, number2);
//        System.out.println("\n" + number1 + " and " + number2 + " is: " + gcd);
//    }
//
//    public static int calculateGCD(int number1, int number2) {
//        if (number2 == 0) {
//            return number1;
//        } else {
//            return calculateGCD(number2, number1 % number2); // (45,  25 % 45) = (25, 20) = (20, 5) = (5, 0) = 5
//        }

    }
}