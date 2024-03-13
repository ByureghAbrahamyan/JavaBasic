import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Task 1. Իրականցնել ֆունկցիա, որը NxM չափանի դինամիկ մատրիցի ցանկացած տողի
        //         մեծագույն արժեքների համար կստեղծի միաչափ դինամիկ զանգված։
        //         Միաչափ զանգվածի i ինդեքսի էլեմենտի արժեքը հավասար է լինելու մատրիցի
        //         i ինդեքսի տակ գտնվող տողի (միաչափ զանգվածի) մեծագույն արժեքին։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };

        int[] largestValuesArray = maxArrayFunction(matrix);

        System.out.println("\n   Matrix ");
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("\nLargest Values Array: " + Arrays.toString(largestValuesArray));
    }

    public static int[] maxArrayFunction(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] largestValuesArray = new int[rows];

        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            largestValuesArray[i] = max;
        }
        return largestValuesArray;
    }
}
 */

        // Task 2. Իրականացրեք մի ֆունկցիա, որը որպես արգումնետ ստանալու է դինամիկ
        //         զանգվածների ցուցիչներ, զանգվածների չափերը և միավորում է երկու
        //         զանգվածները  նոր ստեղծված դինամիկ զանգվածի մեջ։ Ֆունկցիան
        //         վերադարձնելու է նոր ստեղծված զանգվածը։

        int[] array1 = {1, 3, 2, 4};
        int[] array2 = {6, 5, 8, 8};
        int n1 = array1.length;
        int n2 = array2.length;
        int n3 = n1 + n2;
        int[] array3 = new int[n3];

        mergeArrays(array1, array2, n1, n2, array3);

        System.out.println("Array after merging");
        for (int i = 0; i < n3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
    public static void mergeArrays(int[] array1, int[] array2, int n1, int n2, int[] array3){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1){
            array3[k++] = array1[i++];
        }
        while(j < n2){
            array3[k++] = array2[j++];
        }
    }
}

        // Task 3. Տրված նախադասության համար դուրս բերել և տպել բոլոր թվերը։
/*
        String str = "The price of the item is $500. It will be delivered in 2 days.";

        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll(" +", " ");

        if (str.equals("")){
            System.out.println(-1);
        } else
            System.out.println(str);
    }
}
*/

        // Task 4. Իրականացնել ֆունկցիա, որը հաշվում և վերադարձնում է քառակուսային մատրիցի
        //         գլխավոր անկյունագծի տակ գտնվող  տարրերի գումարը։
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
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
                System.out.print(" " + matrix[i][j] + " ");
            }
        }
        System.out.println("\nSum = " + sum);
    }
}
*/

        // Task 5. Գրել ծրագիր, որը կգտնի NxM չափանի մատրիցի փոքրագույն արժեքի ինդեքսները և կտպի էկրանին։
/*
        int[][] matrix = {
                {21, 23, 13},
                {41, 25, 66},
                {71, 18, 69},
        };

        int min = matrix[0][0];
        int minIndexi = 0;
        int minIndexj = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(min < matrix[i][j]){
                    min = matrix[i][j];
                    minIndexi = i;
                    minIndexj = j;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMin = " + min);
        System.out.println("Min_Indexs = [" + minIndexi + "]" + "[" + minIndexj + "]");
    }
}
 */

        // Task 6. Մուտքագրել NxN չափանի քառակուսային մատրիցի տարրերը։ Ստեղծել N չափանի զանգված,
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