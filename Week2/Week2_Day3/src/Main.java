import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. Իրականացնել ֆունկցիա, որը հաշվում և վերադարձնում է քառակուսային մատրիցի գլխավոր
        //         անկյունագծից վերև գտնվող տարրերի գումարը (անկյոնագծի էլեմենտները ներառյալ)։
/*
        int [][]arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        int sum = 0;
        System.out.println("\nMatrix elements");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
                sum += arr[i][j];
            }
            System.out.println("");
        }
        System.out.println("\nSum = " + sum);
*/

        // Task 2. Իրականացնել ֆունկցիա, որը քառակուսային մատրիցի գլխավոր
        //         և օժանդակ անկյունագծի էլեմենտների արժեքները տեղերով կփոխի։
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = arr.length;

        System.out.println("\n  Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nNew matrix");
        for (int i = 0; i < n; i++) {
            if(i != n/2){
                int temp = arr[i][i];
                arr[i][i] = arr[i][n - i - 1];
                arr[i][n - i - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
*/

        // Task 3. Գրել ծրագիր, որը կգտնի NxM (N քանակությամբ տող և M քանակությամբ սյուն) չափանի
        //         մատրիցի մեծագույն արժեքը և կտպի էկրանին։
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = arr.length;

        System.out.println("\n  Matrix");
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max = " + max);
*/

        // Task 4. Գրել ծրագիր, որը կգտնի NxM (N քանակությամբ տող և M քանակությամբ սյուն) չափանի
        //         մատրիցի փոքրագույն արժեքի ինդեքսները և կտպի էկրանին։
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, -9},
        };
        int n = arr.length;
        int k = 0, l = 0;

        System.out.println("\n  Matrix");
        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
                if(arr[i][j] < min){
                    min = arr[i][j];
                    k = i;
                    l = j;
                }
            }
            System.out.println();
        }
        System.out.println("Min = " + min);
        System.out.println("Min index is` [" + k + "][" + l + "]");
 */

        // Task 5. Մուտքագրել թիվ, փոխակերպել թիվը երկուական համակարգի թվի և տպել արդյունքը։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number` ");
        int number = scanner.nextInt();

        int[] binary = new int[32];
        int index = 0;

        while(number > 0){
            binary[index++] = number % 2;
            number = number / 2;
        }

        for (int i = index - 1; i >= 0 ; i--) {
            System.out.print(binary[i] + " ");
        }
*/

        // Task 6. Իրականացնել ֆունկցիա, որը ընդունում է սիմվոլների զանգված և որպես արգումենտ
        //         ստանում է այդ զանգվածի շրջված տարբերակը, նույն զանգվածի մեջ։
/*
        char[] symbols = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original array` " + Arrays.toString(symbols));
        invertArray(symbols);
        System.out.println("Inverted array` " + Arrays.toString(symbols));
    }
    public static void invertArray(char[] symbols){

        int n = symbols.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = symbols[i];
            symbols[i] = symbols[n - 1 - i];
            symbols[n - 1 - i] = temp;
        }
 */
    }
}
        // Task 7. Տրված նախադասության համար տպել ամենաերկար բառը:
/*
        String text = "I am learning to code in java.";
        String[] word = text.split(" ");
        String longestWord = "";

        for (int i = 0; i < word.length; i++) {
            if(word.length > longestWord.length()){
                longestWord = word[i];
            }
        }
        System.out.println("\nLongest word is` " + longestWord);
    }
}
 */

        // Task 8. Իրականացնել ֆունկցիա, որը հաշվում և վերադարձնում է քառակուսային մատրիցի գլխավոր
        //         անկյունագծի տարրերի գումարը։
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
                sum += arr[i][i];
                System.out.print(" " + arr[i][i] + " ");
        }
        System.out.println("\nSum = " + sum);
    }
}
*/

       // Task 9. Իրականացնել ֆունկցիա,որը հաշվում և վերադարձնում է քառակուսային մատրիցի օժանդակ
       //         անկյունագծի տարրերի գումարը։
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i + j) == n - 1){
                    sum += arr[i][i];
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }
        System.out.println("\nSum = " + sum);
    }
}
*/
