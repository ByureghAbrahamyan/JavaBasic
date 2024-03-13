public class Main {
    public static void main(String[] args) {

        // Task 1. Տրված է ամբողջ թվերի սորտավորված զանգված, որում բոլոր էլեմենտները կրկնվում են,
        //         բացի մեկից։ Իրականացնել ալգորիթմ, որը կգտնի միակ էլեմենտը O(logn) ժամանակում:

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};
        int n = arr.length;
        int ans = -1;

        for (int i = 0; i < n-1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                ans = arr[i];
                break;
            }
        }

        if (arr[n - 2] != arr[n - 1])
            ans = arr[n-1];

        System.out.println("The required element is` " + ans);
    }
}
        // Task 2. Իրականացնել ֆունկցիա, որն ընդունում է թիվ և վերադարձնում նրա թվանշանների գումարը:
/*
        int number = 156;
        digitSumOfNumber(number);
    }
    public static void digitSumOfNumber(int number){
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("Sum = " + sum);
    }
}
*/

        // Task 3. Իրականացնել ֆունկցիա, որը հաշվում և վերադարձնում է քառակուսային մատրիցի գլխավոր
        //         անկյունագծի տարրերի գումարը։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };
        glxMatrixSum(matrix);
    }
    public static void glxMatrixSum(int[][] matrix){

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
                System.out.print(" " + matrix[i][i] + " ");
        }
        System.out.println("\nSum = " + sum);
    }
}
*/

        // Task 4. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է զանգված և վերադարձնում զանգվածի ամենամեծ էլեմենտը։
/*
        int[] arr = {5, 14, 32, 0, -5, 71, 5};
        System.out.println("Max element is` " + maxElement(arr));
    }
    public static int maxElement(int[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
 */

        // Task 5. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է թիվ և վերադարձնում թվի թվանշանների արտադրյալը։
/*
        int number = 123;
        System.out.println("Solution is = " + sulDigitNumber(number));
    }
    public static int sulDigitNumber(int number){
        int s = 1;
        while(number > 0){
            int digit = number % 10;
            s *= digit;
            number = number / 10;
        }
        return s;
    }
}
 */

        // Task 6. Իրականացնել ֆունկցիա, որը ստանում է քառակուսային մատրից։
        //         Ֆունկցիան մատրիցի զույգ ինդեքսով տողերի էլեմենտները փոխարինում է 0-ներով և վերադարձնում։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };
        glxMatrixSum(matrix);
    }

    public static void glxMatrixSum(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j){
                    matrix[i][j] = 0;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

        // Task 7. Իրականացնել ֆունկցիա,որը հաշվում և վերադարձնում է քառակուսային մատրիցի օժանդակ անկյունագծի տարրերի գումարը։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };
        glxMatrixSum(matrix);
    }

    public static void glxMatrixSum(int[][] matrix) {

        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i + j == n - 1){
                    sum += matrix[i][j];
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
 */

        // Task 8. Իրականացնել ֆունկցիա, որը հաշվում և վերադարձնում է քառակուսային մատրիցի գլխավոր
        //         անկյունագծից վերև գտնվող տարրերի գումարը (անկյունագծի էլեմենտները ներառյալ)։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };
        glxMatrixSum(matrix);
    }

    public static void glxMatrixSum(int[][] matrix) {

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += matrix[i][j];
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
*/

        // Task 9. Իրականացնել ֆունկցիա,որը հաշվում և վերադարձնում է քառակուսային մատրիցի օժանդակ
        //         անկյունագծից վերև ընկած տարրերի գումարը (օժանդակ անկյունագծի տարրերը ներառյալ)։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };
        ojMatrixSum(matrix);
    }

    public static void ojMatrixSum(int[][] matrix) {

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                    sum += matrix[i][j];
                    System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
 */

        // Task 10. Իրականցնել ֆունկցիա, որը կստանա քառակուսային մատրից և գլխավոր անկյունագծի համեմատ կկատարի սիմետրիկ
        //          արտապատկերում (արտապատկերումը կատարել նույն մատրիցում)։
        //          Այսինքն մատրիցի [i][j] էլեմենտը կհսյտնվի [j][i] դիրքում։
/*
        int[][] matrix = {
                {21, 23, 13},  // 00 01 02
                {41, 25, 66},  // 10 11 12
                {71, 18, 69},  // 20 21 22
        };
        ojMatrixSum(matrix);
    }

    public static void ojMatrixSum(int[][] matrix) {

        int n = matrix.length;
        int[][] symetricMatrix = new int[n][n];

        System.out.println("Simetric matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                symetricMatrix[i][j] = matrix[j][i];
                System.out.print(" " + symetricMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

        // Task 11. Մուտքագրել NxN չափանի քառակուսային մատրիցի տարրերը։ Ստեղծել N չափանի զանգված,
        //         որում i-րդ էլեմենտը իրենից ներկայացնում է մատրիցի i-րդ սյան տարրերի գումարը։
/*
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input matrix sizes");
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int[] newMatrix = new int[n];

        System.out.println("Input matrix elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Print matrix elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.print("NewMatrix = [");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i] += matrix[i][j];
            }
            System.out.print(" " + newMatrix[i] + " ");
        }
        System.out.print("]");
    }
}
 */