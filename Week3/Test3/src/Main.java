public class Main {
    public static void main(String[] args) {

        // Task 1. Տրված է ամբողջ թվերի մատրից։ Կառուցել և արտածել միաչափ զանգված, որի i-րդ տարրը հավասար է 1֊ի,
        //         եթե մատրիցի i-րդ տողի բոլոր թվերը վերջանում են 3 թվանշանով, և հավասար է ֊1՝ հակառակ դեպքում։
/*
        int[][] matrix = {
                {123, 456, 789},
                {111, 222, 333},
                {1234, 5678, 9012}
        };

        int[] resultArray = constructArray(matrix);

        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    private static int[] constructArray(int[][] matrix) {
        int numRows = matrix.length;
        int[] resultArray = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            resultArray[i] = allNumbersEndWith3Digits(matrix[i]) ? 1 : -1;
        }

        return resultArray;
    }
    private static boolean allNumbersEndWith3Digits(int[] row) {
        for (int number : row) {
            if (Math.abs(number) < 100 || Math.abs(number) > 999) {
                return false;
            }
        }
        return true;
    }
}
*/

        // Task 2. Concat function
/*
        String original = "Hello";
        String strConcat = "World";
        System.out.println(customConcat(original, strConcat));
    }
    public static String customConcat(String original, String strToConcat) {
        char[] result = new char[original.length() + strToConcat.length()];

        for (int i = 0; i < original.length(); i++) {
            result[i] = original.charAt(i);
        }

        for (int i = 0; i < strToConcat.length(); i++) {
            result[original.length() + i] = strToConcat.charAt(i);
        }

        return new String(result);
    }
}
 */

        // Task 3. Իրականացնել SubString ֆունկցիան, որը ստանում է 2 տող։ Վերադարձնում է true, եթե
        //         երկրորդ տողը առաջինի մաս է կազմում և false հակառակ դեպքում:

        String testString = "This is a test string";
        int beginIndex = 5;
        int endIndex = 16;
        System.out.println(customSubString(testString, beginIndex, endIndex));
    }
    public static String customSubString(String str, int beginIndex, int endIndex) {
        char[] result = new char[endIndex - beginIndex];

        for (int i = 0; i < endIndex - beginIndex; i++) {
            result[i] = str.charAt(beginIndex + i);
        }
        return new String(result);
    }
}


        // Task 4. Իրականացնել ֆունկցիա, որը կստանա նախադասություն և կվերադարձնի այդ նախադասության մեջ առկա բառերի քանակը։
        //         Նախադասությունը կարող է պարունակել տառեր, թվեր և նշաններ, իսկ բառերը միմյանցից անջատված են բացատներով space-երով։
/*
        String sentence = "This is a sample sentence.";

        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);
    }

    private static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");

        return words.length;
    }
}
 */