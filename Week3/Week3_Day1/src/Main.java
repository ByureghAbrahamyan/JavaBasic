import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրել ծրագիր, որը կգտնի NxM չափանի մատրիցի փոքրագույն արժեքի ինդեքսները և կտպի էկրանին։
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int min = matrix[0][0];
        int n = matrix.length;
        int minI = 0, minJ = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("minIndexs = [" + minI + "]" + "[" + minJ + "]");
    }
}
 */

        // Task 2. Իրականցնել ֆունկցիա, որը NxM  չափանի դինամիկ մատրիցի ցանկացած տողի մեծագույն արժեքների
        //         համար կստեղծի միաչափ դինամիկ զանգված։ Այսինքն միաչափ զանգվածի i ինդեքսի էլեմենտի արժեքը
        //         հավասար է լինելու մատրիցի i ինդեքսի տակ գտնվող տողի (միաչափ զանգվածի) մեծագույն արժեքին։
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = matrixMaxElement(matrix);
        System.out.println("Result = " + Arrays.toString(result));
    }

    public static int[] matrixMaxElement(int[][] matrix){

        int[] newMatrix = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = i; j < matrix[i].length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            newMatrix[i] = max;
        }
        return newMatrix;
    }
}
 */

        // Task 3. Տպել քառակուսային մատրիցի գլխավոր և օժանդակ անկյունագծերի տարրերի գումարները։Իրականացնել ֆունկցիա,
        //         որը քառակուսային մատրիցի գլխավոր և օժանդակ անկյունագծի էլեմենտների արժեքները տեղերով կփոխի։
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;

        int mainDiagonalSum = 0;
        int auxiliaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            auxiliaryDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal = " + mainDiagonalSum);
        System.out.println("Sum of auxiliary diagonal = " + auxiliaryDiagonalSum);

        swapDiagonals(matrix);

        System.out.println("Matrix after swapping diagonals:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapDiagonals(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - 1 - i];
            matrix[i][n - 1 - i] = temp;
        }
    }
}
 */

        // Task 4. Իրականցնել ֆունկցիա, որը կստանա քառակուսային մատրից և գլխավոր անկյունագծի համեմատ
        //         կկատարի սիմետրիկ արտապատկերում (արտապատկերումը կատարել նույն մատրիցում)։
        //         Այսինքն մատրիցի [i][j] էլեմենտը կհսյտնվի [j][i] դիրքում։
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;

        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        symmetricProjection(matrix);

        System.out.println("\nMatrix after Symmetric Projection:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void symmetricProjection(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
*/

        // Task 5. Տրված է nxn չափի քառակուսային մատրից, որտեղ բոլոր տարրերը 0-եր և M-եր են։ Գրել ծրագիր,
        //         որը ստեղծում է նոր nxn չափի մատրից, որտեղ M-երը գտնվում են իրենց տեղերում, իսկ 0-ների
        //         փոխարեն գրված է այդ 0-ին հարևան M-երի քանակը (հորիզոնական, ուղղահայաց, անկյունագծային):

        //	0 M 0 M 0   	1 M 3 M 1
        //	0 0 M 0 0   	1 2 M 2 1
        //	0 0 0 0 0    	2 3 2 1 0
        //	M M 0 0 0   	M M 2 1 1
        //	0 0 0 M 0   	2 2 2 M 1
/*
        char[][] matrix = {
                {'0', 'M', '0', 'M', '0'},
                {'0', '0', 'M', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'M', 'M', '0', '0', '0'},
                {'0', '0', '0', 'M', '0'},
        };

        int n = matrix.length;

        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResult Matrix:");
        char[][] resultMatrix = new char[n][n];

        int row = 0;
        int col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 'M') {
                    resultMatrix[i][j] = 'M';
                } else {
                    int count = 0;
                    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
                    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

                    for (int d = 0; d < 8; d++) {
                        int newRow = row + dx[d];
                        int newCol = col + dy[d];

                        if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && matrix[newRow][newCol] == 'M') {
                            count++;
                        }
                    }
                    resultMatrix[i][j] = (char) (count + '0');
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

        // Task 6. Գրել ծրագիր, որը քառակուսային մատրիցը շրջում է 180 աստիճան։

        //     Input:
        //	1   2   3   4
        //	5   6   7   8
        //	9   10  11  12
        //  13  14  15  16

        //	  Output:
        //	16  15  14  13
        //	12  11  10   9
        // 	 8   7   6   5
        //	 4   3   2   1
/*
        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int n = matrix.length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

        // Task 7. A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        //         a2 + b2 = c2
        //         For example, 3(2) + 4(2) = 9 + 16 = 25 = 5(2).
        //         There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        //         Find the product abc.
/*
        int targetSum = 1000;

        System.out.println("\nProduct of Pythagorean triplet for which a + b + c = 1000: ");
        findPythagoreanTriplet(targetSum);
    }

    public static void findPythagoreanTriplet(int targetSum) {

        int product = 1;

        for (int a = 1; a < targetSum; a++) {
            for (int b = a + 1; b < targetSum; b++) {

                int c = targetSum - a - b;

                if ((a * a) + (b * b) == (c * c)) {
                    product = a * b * c;
                    System.out.println(a + " " + " " + b + " " + c);
                }
            }
        }
        System.out.println("Product = " + product);
    }
}
*/