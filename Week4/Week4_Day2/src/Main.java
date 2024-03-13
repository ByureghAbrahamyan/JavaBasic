public class Main {

    // Task 1. Տրված են երեք բնական թվեր՝ a, b և c։ Օգտվելով Պյութագորասի թեորեմից,
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

    // Task 2. - ?


    // Task 3. Գրել ֆունկցիա, որը ստանում է a և b թվերը(որտեղ a-ն ուղղանկյուն եռանկյան
    //         դիմացի էջն է, իսկ  b-ն ուղղանկյուն եռանկյան կից էջը) հաշվել և վերադարձնել
    //         կից էջով և ներքնաձիգով կազմած անկյան սինուսը(sin):
    /*
    public static void main(String[] args) {
        double a = 3; // Replace with the actual length of the opposite side
        double b = 4; // Replace with the actual length of the adjacent side

        double sineValue = calculateSine(a, b);
        System.out.println("Sine of the angle: " + sineValue);
    }

    static double calculateSine(double a, double b) {
        double hypotenuse = Math.sqrt(a * a + b * b);

        if (hypotenuse != 0) {
            return a / hypotenuse;
        } else {
            System.out.println("Error: Hypotenuse is zero. Cannot calculate sine.");
            return Double.NaN;
        }
    }
    */

    // Task 4. Գրել ֆունկցիա, որը ստանում է a և b թվերը(որտեղ a-ն ուղղանկյուն եռանկյան
    //         դիմացի էջն է, իսկ  b-ն ուղղանկյուն եռանկյան կից էջը) հաշվել և վերադարձնել
    //         կից էջով և ներքնաձիգով կազմած անկյան կոսինուսը(cos):
    /*
    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        double cosineValue = calculateCosine(a, b);
        System.out.println("Cosine of the angle: " + cosineValue);
    }

    static double calculateCosine(double a, double b) {
        double hypotenuse = Math.sqrt(a * a + b * b);

        if (hypotenuse != 0) {
            return b / hypotenuse;
        } else {
            System.out.println("Error: Hypotenuse is zero. Cannot calculate cosine.");
            return Double.NaN;
        }
    }
     */

    // Task 5. Գրել ֆունկցիա, որը ստանում է a և b թվերը(որտեղ a-ն ուղղանկյուն եռանկյան
    //         դիմացի էջն է, իսկ  b-ն ուղղանկյուն եռանկյան կից էջը) հաշվել և վերադարձնել
    //         կից էջով և ներքնաձիգով կազմած անկյան տանգենսը(tg):
    /*
    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        double tangentValue = calculateTangent(a, b);
        System.out.println("Tangent of the angle: " + tangentValue);
    }

    static double calculateTangent(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Adjacent side is zero. Cannot calculate tangent.");
            return Double.NaN;
        }
    }
     */

    // Task 6. Գրել ֆունկցիա, որը ստանում է a և b թվերը(որտեղ a-ն ուղղանկյուն եռանկյան
    //         դիմացի էջն է, իսկ  b-ն ուղղանկյուն եռանկյան կից էջը) հաշվել և վերադարձնել
    //         կից էջով և ներքնաձիգով կազմած անկյան կոտանգենսը(ctg).
    /*
    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        double cotangentValue = calculateCotangent(a, b);
        System.out.println("Cotangent of the angle: " + cotangentValue);
    }

    static double calculateCotangent(double a, double b) {
        if (a != 0) {
            return b / a;
        } else {
            System.out.println("Error: Opposite side is zero. Cannot calculate cotangent.");
            return Double.NaN;
        }
    }
     */

    // Task 7. Իրականացրե՛ք n-րդ պարզ թիվը գտնելու ֆունկցիա:
    /*
    public static void main(String[] args) {
        int n = 5; // Replace with the desired value of n

        int nthPrime = findNthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findNthPrime(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please provide a positive value for n.");
            return -1;
        }

        int count = 0;
        int candidate = 2;

        while (count < n) {
            if (isPrime(candidate)) {
                count++;
            }
            if (count < n) {
                candidate++;
            }
        }

        return candidate;
    }
     */

    // Task 8. Գրել ֆունկցիա, որը որպես արգումենտ կստանա թիվ և կվերադարձնի true,
    //         եթե թիվը կատարյալ(perfect) է, հակառակ դեպքում false.

    public static void main(String[] args) {
        int number = 28;

        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);
    }

    static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            System.out.println("Invalid input. Please provide a positive integer.");
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}