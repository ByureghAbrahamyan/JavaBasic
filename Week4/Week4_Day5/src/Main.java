
public class Main {

        // Task 1. Տրված է NxN չափանի քառակուսային մատրից։ Ստուգել արդյոք տրված մատրիցը սիմետրիկ է թե ոչ։
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = readMatrix(N);

        boolean isSymmetric = isSymmetricMatrix(matrix);

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

    }

    private static int[][] readMatrix(int N) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static boolean isSymmetricMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
*/

        // Task 2. Տրված են NxN չափանի երկու քառակուսային մատրիցներ։
        //         Ստանալ երրորդ մատրից, որը իրենից կներկայացնի նախորդ երկուսի գումարը։
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrices (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = readMatrix(N);

        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = readMatrix(N);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);

    }

    private static int[][] readMatrix(int N) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int N = matrix1.length;
        int[][] sumMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
 */

        // Task 3. Տրված են NxN չափանի երկու քառակուսային մատրիցներ։
        //         Ստանալ երրորդ մատրից, որը իրենից կներկայացնի նախորդ երկուսի արտադրյալը։

        // Task 4. Մատրիցի տարրն անվանենք թամբային կետ, եթե այն իր սյունում փոքրագույնն է,
        //         իսկ տողում՝ մեծագույնը: Արտածել տրված իրական թվերի մատրիցի բոլոր
        //         թամբային կետերը և դրանց կարգահամարները:
    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        System.out.println("Enter the elements of the matrix:");
        double[][] matrix = readMatrix(rows, cols);

        findAndPrintSaddlePoints(matrix);
    }

    private static double[][] readMatrix(int rows, int cols) {

        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    private static void findAndPrintSaddlePoints(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double currentElement = matrix[i][j];
                boolean isSaddlePoint = true;

                for (int k = 0; k < rows; k++) {
                    if (k != i && currentElement > matrix[k][j]) {
                        isSaddlePoint = false;
                        break;
                    }
                }

                for (int k = 0; k < cols; k++) {
                    if (k != j && currentElement < matrix[i][k]) {
                        isSaddlePoint = false;
                        break;
                    }
                }

                if (isSaddlePoint) {
                    System.out.println("Saddle Point: " + currentElement + " at position (" + (i + 1) + ", " + (j + 1) + ")");
                }
            }
        }
    }
     */

        // Task 5. Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե այն
        //         մոգական քառակուսի է. նրա բոլոր տողերի, սյուների, գլխավոր ու երկրոդական
        //         անկյունագծերի համար տարրերի գումարը նույնն թիվն է,
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = readMatrix(N);

        boolean isMagicSquare = isMagicSquare(matrix);

        if (isMagicSquare) {
            System.out.println("YES, the matrix is a magic square.");
        } else {
            System.out.println("NO, the matrix is not a magic square.");
        }

        scanner.close();
    }

    private static int[][] readMatrix(int N) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static boolean isMagicSquare(int[][] matrix) {
        int N = matrix.length;

        int sum = 0;
        for (int j = 0; j < N; j++) {
            sum += matrix[0][j];
        }

        // Check the sum of each row
        for (int i = 1; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }

        // Check the sum of each column
        for (int j = 0; j < N; j++) {
            int colSum = 0;
            for (int i = 0; i < N; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != sum) {
                return false;
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < N; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != sum) {
            return false;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < N; i++) {
            secondaryDiagonalSum += matrix[i][N - i - 1];
        }
        return secondaryDiagonalSum == sum;
    }
    */
}