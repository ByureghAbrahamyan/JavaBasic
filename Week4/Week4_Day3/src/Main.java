import java.util.Scanner;
import java.util.Vector;

public class Main {

    // Task 1. Մուտքագրել N թիվ և հաշվել տրված թվի արմատը՝ sqrt(N)։

//       public static void main(String[] args) {
//  ????????????????????????
//       Scanner n = new Scanner(System.in);
//       int number = n.nextInt();
//
//       if(number > 0){
//           while(number != 0){
//               for (int i = 1; i < number; i++) {
//                   int temp =
//                   number = number / i;
//               }
//           }
//       }

    // Task 2. Տրված է X բնական թիվը։ Իրականացնել ֆունկցիա, որը կհաշվի տրված թվի լոգարիթմը 2 հիմքով։

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (X): ");
        int X = scanner.nextInt();

        if (X <= 0) {
            System.out.println("Invalid input. Please enter a positive natural number.");
        } else {
            double binaryLog = calculateBinaryLog(X);
            System.out.println("The binary logarithm of " + X + " is: " + binaryLog);
        }
    }

    static double calculateBinaryLog(int X) {
        return Math.log(X) / Math.log(2);
    }


    // Task 3. Տրված է X և a բնական թվեր։ Իրականացնել ֆունկցիա, որը կհաշվի X թվի լոգարիթմը a հիմքով։
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();

        if (X <= 0 || a <= 0 || a == 1) {
            System.out.println("Invalid input. Please enter positive natural numbers, and ensure the base (a) is not 1.");
        } else {
            double logarithmResult = calculateLogarithm(X, a);
            System.out.println("The logarithm of " + X + " to the base " + a + " is: " + logarithmResult);
        }

        scanner.close();
    }

    static double calculateLogarithm(int X, int a) {
        return Math.log(X) / Math.log(a); // Change of base formula
    }
     */

    // Task 4. Մուտքագրել երեք բնական թվեր՝ a, b և c։ Հաշվել այդ կողմերով եռանկյան մակերեսը Հերոնի բանաձևով։
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            double area = calculateTriangleArea(a, b, c);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid input. The sides provided do not form a valid triangle.");
        }

        scanner.close();
    }
    static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
    static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
     */

    // Task 5. Նկարագրել բուլյան ֆունկցիա, որն արգումենտում ստանում է երեք իրական թիվ և վերադարձնում է false,
    //        եթե գոյություն չունի տրված կողմերով եռանկյուն:
    //        Հակառակ դեպքում վերադարձնում է true և վերադարձնում է նաև այդ եռանկյան մակերեսը:
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        double area;
        if (isValidTriangle(a, b, c)) {
            area = calculateTriangleArea(a, b, c);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid input. A triangle with the given sides does not exist.");
        }

        scanner.close();
    }

    static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
     */

    // Task 6. Տրված n դրական ամբողջ թվի համար արտածել 2-ի ամենամեծ աստիճանը, որը չի գերազանցում n-ը։
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int largestPowerOf2 = findLargestPowerOf2(n);
            System.out.println("The largest power of 2 that does not exceed " + n + " is: " + largestPowerOf2);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        scanner.close();
    }
    static int findLargestPowerOf2(int n) {
        int power = 1;

        while (power * 2 <= n) {
            power *= 2;
        }

        return power;
    }
     */


}



















