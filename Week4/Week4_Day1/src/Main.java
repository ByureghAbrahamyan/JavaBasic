import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Task 1. Տրված է բնական թիվ: Արտածել YES, եթե

    //  ա) թվի թվանշանների մեջ կա 3 թվանշան,
    /*
    public static void main(String[] args) {

        System.out.println(method1(123));
    }

    static String method1(int num){

        String result ="\nNo!";
        for(int x:digit1(num))
            if(x == 3)
                return "\nYes!";
        return result;
    }

    static ArrayList<Integer> digit1(int num){

        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0){
            list.add(num % 10);
            num /= 10;
        }
        return list;
    }
     */

    // բ) թվի թվանշանների մեջ չկա 5 թվանշան,
    /*
    public static void main(String[] args) {

        int number = 27;

        while( number != 0) {
            if(number % 10 == 5) {
                System.out.println("No!");
                break;
            } else if(number < 10)
                System.out.println("Yes!");
            number /= 10;
        }
    }
 */

    // գ) թվի թվանշանները աճման կարգով են դասավորված,
    /*
    public static void main(String[] args) {

        int number = 1234;
        int i, j;
        while (number != 0) {

            i = number % 10;
            number = number / 10;
            j = number % 10;

            if (i < j)
                System.out.println("Yes.");
        }
    }
 */

    // դ) թվի թվանշանները նվազման կարգով չեն դասավորված,
    /*
    public static void main(String[] args) {

        boolean flag1 = false;
        boolean flag2 = false;
        int num = 123123;

        int i, j;
        while (num != 0) {
            i = num % 10;
            num = num / 10;
            j = num % 10;

            if (i < j) {
                flag2 = false;
                break;
            } else flag2 = true;
        }

        while (num != 0) {
            i = num % 10;
            num = num / 10;
            j = num % 10;

            if (i < j) {
                flag1 = false;
                break;
            } else flag1 = true;
        }
        System.out.println(flag2 + " " + flag1);
    }
 */

    // ե) թվի թվանշանների գումարը մեծ է քսանից,
    /*
    public static void main(String[] args) {

        int num = 15565;
        System.out.println("List = " + digit3(num));
        int sum = 0;
        for (int i : digit3(num)) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        if(sum > 20) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
    static ArrayList<Integer> digit3(int num){

        ArrayList<Integer> list = new ArrayList<>();

        while(num != 0){
            int i = num % 10;
            num = num / 10;
            list.add(i);
        }
        return list;
    }
    */

    // զ) թվի թվանշանների արտադրյալը փոքր է երեսունից:
    /*
    public static void main(String[] args) {

        int num = 15;
        System.out.println("List = " + digit4(num));
        int product = 1;
        for (int i : digit4(num)) {
            product *= i;
        }
        System.out.println("Product = " + product);

        if(product < 30) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
    static ArrayList<Integer> digit4(int num){

        ArrayList<Integer> list = new ArrayList<>();

        while(num != 0){
            int i = num % 10;
            num = num / 10;
            list.add(i);
        }
        return list;
    }
     */

    // Task 2. n թվանշան ունեցող բնական թիվը կոչվում է Արմսթրոնգի թիվ,
    //         եթե նրա թվանշանների n աստիճանների գումարը հավասար է այդ թվին
    //         (օրինակ՝ 153 = 1^3 + 5^3 + 3^3 ): Ներմուծել թիվ, արտածել YES
    //         եթե այն հանդիսանում է Արմսթրոնգի թիվ, և NO հակառակ դեպքում։
    /*
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        int temp = number;
        int result = 0;
        int x = countFunc(number);

        while (number != 0){
            result += Math.pow(number % 10, x);
            number /= 10;
        }

        boolean flag = (result == temp);
        System.out.println(flag);
    }
    static int countFunc(int num){

        int count = 0;

        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
 */

    // Task 3. Տրված են երեք բնական թվեր՝ a, b և c։ Օգտվելով Պյութագորասի թեորեմից,
    //         ստուգել արդյոք նշված երկարություններով կողեր ունեցող եռանկյունը
    //         ուղղանկյուն եռանկյուն է թե ոչ.
    /*
    public static void main(String[] args) {
        int a = 3;  // Replace with the actual values of a, b, and c
        int b = 4;
        int c = 5;

        if (isRightTriangle(a, b, c)) {
            System.out.println("It is a right triangle.");
        } else {
            System.out.println("It is not a right triangle.");
        }
    }

    static boolean isRightTriangle(int a, int b, int c) {
        // Check the Pythagorean theorem
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
     */

    // Task 4. Գրել ֆունկցիա, որը կստանա n թիվ։ Եթե n թվի թվանշանները կազմում են
    //         թվաբանական պրոգրեսիա վերադարձնել true, հակառակ դեպքում false;
   /*
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};   // Example: Arithmetic progression
        int[] numbers2 = {2, 4, 8, 16, 32};  // Example: Not an arithmetic progression

        System.out.println(isArithmeticProgression(numbers1));  // Output: true
        System.out.println(isArithmeticProgression(numbers2));  // Output: false
    }
    static boolean isArithmeticProgression(int[] numbers) {
        if (numbers.length < 2) {
            return false;
        }

        int commonDifference = numbers[1] - numbers[0];

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] != commonDifference) {
                return false;
            }
        }
        return true;
    }
*/

    // Task 5. Գրել ֆունկցիա, որը կստանա n թիվ։ Եթե n թվի թվանշանները կազմում են
    //         երկրաչափական պրոգրեսիա վերադարձնել true, հակառակ դեպքում false;
    /*
    public static void main(String[] args) {
        int[] numbers1 = {2, 6, 18, 54};    // Example: Geometric progression
        int[] numbers2 = {3, 5, 9, 15, 30}; // Example: Not a geometric progression

        System.out.println(isGeometricProgression(numbers1));  // Output: true
        System.out.println(isGeometricProgression(numbers2));  // Output: false
    }

    static boolean isGeometricProgression(int[] numbers) {
        if (numbers.length < 2) {
            return false;
        }

        int commonRatio = numbers[1] / numbers[0];

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] / numbers[i - 1] != commonRatio) {
                return false;
            }
        }
        return true;
    }
     */

    // Task 6. Գրել ֆունկցիա, որը կստանա ամբողջ թվերի զանգված, զանգվածի թվերը
    //         դասավորված են ինչպես թվաբանական պրոգրեսիա։
    //         Հաշվել և վերադարձնել թվաբանական պրոգրեսիայի գումարը։

    /*
    public static void main(String[] args) {
        int[] arithmeticProgression = {2, 5, 8, 11, 14}; // Example arithmetic progression

        int sum = calculateArithmeticProgressionSum(arithmeticProgression);
        System.out.println("Sum of the arithmetic progression: " + sum);
    }

    static int calculateArithmeticProgressionSum(int[] progression) {
        if (progression.length < 1) {
            return 0;
        }

        int firstTerm = progression[0];
        int commonDifference = progression[1] - firstTerm;
        int n = progression.length;

        // Use the formula for the sum of an arithmetic progression: S = n/2 * (2a + (n-1)d)
        int sum = n * (2 * firstTerm + (n - 1) * commonDifference) / 2;

        return sum;
    }
     */

    // Task 7. Գրել ֆունկցիա, որը կստանա ամբողջ թվերի զանգված, զանգվածի թվերը
    //         դասավորված են ինչպես երկրաչափական պրոգրեսիա։
    //         Հաշվել և վերադարձնել երկրաչափական պրոգրեսիայի գումարը։
    /*
    public static void main(String[] args) {
        int[] geometricProgression = {2, 6, 18, 54};

        int sum = calculateGeometricProgressionSum(geometricProgression);
        System.out.println("Sum of the geometric progression: " + sum);
    }

    static int calculateGeometricProgressionSum(int[] progression) {
        if (progression.length < 1) {
            return 0;
        }

        int firstTerm = progression[0];
        int commonRatio = progression[1] / firstTerm;
        int n = progression.length;

        // Use the formula for the sum of a geometric progression: S = a * (r^n - 1) / (r - 1)
        int sum = firstTerm * (int) Math.pow(commonRatio, n) - 1 / (commonRatio - 1);

        return sum;
    }
    */
}



















