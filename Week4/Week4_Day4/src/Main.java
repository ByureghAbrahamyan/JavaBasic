
public class Main {
    public static void main(String[] args) {

        // Task 1. Մուտքագրել 2 թիվ` n, k և n-չափանի վեկտոր՝ V։
        //         Բազմապատկել տրված վեկտորը k թվով։
    /*
        public static void main(String[] args) {

            int n = 5;
            int k = 2;
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                arr[i] = arr[i] * k;
            }

            for (int x:arr){
                System.out.println(x);
            }
        }
     */

        // Task 2. Մուտքագրել n թիվ և n-չափանի 2 վեկտորներ՝ V1, V2։
        //         Հաշվել այդ վեկտորների գումարը՝ V1 + V2:
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of vectors (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of vector V1:");
        int[] v1 = readVector(n);

        System.out.println("Enter the elements of vector V2:");
        int[] v2 = readVector(n);

        int[] sum = calculateVectorSum(v1, v2);

        System.out.println("Sum of vectors V1 and V2: ");
        printVector(sum);
    }

    private static int[] readVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static int[] calculateVectorSum(int[] v1, int[] v2) {
        int n = v1.length;
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = v1[i] + v2[i];
        }
        return sum;
    }
    private static void printVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
     */

        // Task 3. Մուտքագրել n թիվ և n-չափանի 2 վեկտորներ՝ V1, V2։
        //         Հաշվել այդ վեկտորների սկալյար արտադրյալը՝ V1 * V2:
    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of vectors (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of vector V1:");
        int[] v1 = readVector(n);

        System.out.println("Enter the elements of vector V2:");
        int[] v2 = readVector(n);

        int scalarProduct = calculateScalarProduct(v1, v2);

        System.out.println("Scalar product of vectors V1 and V2: " + scalarProduct);
    }

    private static int[] readVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static int calculateScalarProduct(int[] v1, int[] v2) {
        int n = v1.length;
        int product = 0;
        for (int i = 0; i < n; i++) {
            product += v1[i] * v2[i];
        }
        return product;
    }
     */

        // Task 4. Մուտքագրել n թիվ, և n չափանի V  վեկտոր։ Հաշվել տրված վեկտորի երկարությունը։
    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of the vector (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of vector V:");
        int[] v = readVector(n);

        double length = calculateVectorLength(v);
        System.out.println("Length of vector V: " + length);
    }

    private static int[] readVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static double calculateVectorLength(int[] v) {
        int n = v.length;
        double sumOfSquares = 0;
        for (int i = 0; i < n; i++) {
            sumOfSquares += Math.pow(v[i], 2);
        }
        return Math.sqrt(sumOfSquares);
    }
    */

        // Task 5. Մուտքագրել n թիվ և n-չափանի 2 վեկտորներ՝ V1, V2։
        //         Գտնել այդ վեկտորների կազմած անկյան կոսինուսը։
    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of vectors (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of vector V1:");
        int[] v1 = readVector(n);

        System.out.println("Enter the elements of vector V2:");
        int[] v2 = readVector(n);

        double cosineAngle = calculateCosineAngle(v1, v2);
        System.out.println("Cosine of the angle between vectors V1 and V2: " + cosineAngle);
    }

    private static int[] readVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static int calculateDotProduct(int[] v1, int[] v2) {
        int n = v1.length;
        int dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += v1[i] * v2[i];
        }
        return dotProduct;
    }

    private static double calculateVectorMagnitude(int[] v) {
        int n = v.length;
        double sumOfSquares = 0;
        for (int i = 0; i < n; i++) {
            sumOfSquares += Math.pow(v[i], 2);
        }
        return Math.sqrt(sumOfSquares);
    }

    private static double calculateCosineAngle(int[] v1, int[] v2) {
        int dotProduct = calculateDotProduct(v1, v2);
        double magnitudeV1 = calculateVectorMagnitude(v1);
        double magnitudeV2 = calculateVectorMagnitude(v2);

        return dotProduct / (magnitudeV1 * magnitudeV2);
    }
     */


    }
}