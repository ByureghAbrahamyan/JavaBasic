import com.sun.source.tree.BreakTree;

import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրեք ծրագիր, որը հաշվարկում է տրված բնական թվի ֆակտորիալը՝ օգտագործելով ռեկուրսիա։
        //          n! = n * (n - 1) * (n - 2) * ... * 2 * 1….

        /*
        int n = 5;
        System.out.println(n + "'s faktorial is` " + faktorialFunction(n));
    }

    public static int faktorialFunction(int n){

        if(n == 1) {
            return 1;
        } else {
            return n * faktorialFunction(n - 1);
        }
    }
}
*/

        // Task 2. Իրականացնել բինար որոնման ալգորիթմը զանգվածի համար իտերատիվ տարբերակով։

        // Binary search.
        // Time comlesity = O(n)log(n) and  Space Complesity= O(n)
/*
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 7));
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;     // mid = 4
            if (arr[mid] == key) {                   // arr[4] == 7 //  5 < 7 ?
                return mid;                          // start = 4 + 1 = 5
            } else if (arr[mid] > key) {             // mid = 5 + 8 = 13 / 2 = 6
                end = mid - 1;                       // arr[6] == 7 //
            } else                                   // start =
                start = mid + 1;
        }
        return -1;
    }
}
*/

        // Task 3. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է ամբողջ թվային պարամետր և վերադարձնում
        //         է n-րդ Ֆիբոնաչիի թիվը։

/*
        int number = 5;
        System.out.println(number + "'s index is `" + fibIndexOfFunction(number));

    }
    // 1 1 2 3 5 8
    public static int fibIndexOfFunction(int number){

        if(number == 1 || number == 2){
            return 1;
        }

        return fibIndexOfFunction(number - 1) + fibIndexOfFunction(number - 2);
    }
}
 */

        // Task 4. Իրականացնել բինար որոնման ալգորիթմը զանգվածի համար ռեկուրսիվ տարբերակներով։

        /*

        //           start           mid             end
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        int start = 0;
        int end = arr.length - 1;

        int result = binaryFunc(arr, 16, start, end);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }

     static int binaryFunc(int[] arr, int target, int start, int end) {

        if (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return binaryFunc(arr, target, start, mid + 1);

            return binaryFunc(arr, target, mid - 1, end);
        }
        return -1;
    }
}
*/

        // Task 5. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է թիվ և վերադարձնում թվի թվանշանների արտադրյալը։

/*
        int number = 254;
        int result = sulotionOfNumbers(number);
        System.out.println("Sulotion of numbers = " + result);
    }

    public static int sulotionOfNumbers(int number){

        if(number < 10) {
            return number;
        }
        else {
            int digit = number % 10;
            int remainDigit = number / 10;
            return digit * sulotionOfNumbers(remainDigit);
        }
    }
}
*/

        // Task 6. Իրականացնել ռեկուրսիվ ֆունկցիա, որը կստանա տող և կվերադարձնի տողի երկարությունը։

/*
        String str = "Hello World.";
        int length = lineLength(str);
        System.out.println("String length is` " + length);
    }

    public static int lineLength(String str){

        if(str.isEmpty()){
            return 0;
        }
        else {
            return lineLength(str.substring(1) + 1);
        }
    }
}
*/

        // Task 7. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է տող
        //         և վերադարձնում տողում առաջին հանդիպած մեծատառը։

        String str = "geeksforGeeKS";
        char res = first(str,0);

        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
        }

    static char first(String str, int i)
    {
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        try {
            return first(str, i + 1);
        }
        catch(Exception e){
            System.out.println("Exception occurs");
        }
        return 0;
    }
}

        // Task 8. Իրականացնել ռեկուրսիվ ֆունկցիա, որը ստանում է
//                 զանգված և վերադարձնում զանգվածի ամենափոքր (ամենամեծ) էլեմենտը։
/*
        int[] arr = {-55, 6, 84, 2, 0, 5, 7};

        int start = 0;
        int end = arr.length - 1;
        int result = minElement(arr, start, end);
        System.out.println("Min element is a " + result);
    }

    public static int minElement(int[] arr, int start, int end) {

        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;

        int minNum = minElement(arr, start, mid);
        int largestNum = minElement(arr, mid + 1, end);

        if (largestNum > minNum) {
            return minNum;
        } else return largestNum;
    }
}
 */

// Task 9. Իրականացնել ֆունկցիա, որը ստանում է զանգված։ Տպել նրանից գումարային եռանկյունի այնպես, որ առաջին մակարդակը
//         ունենա տրված զանգվածի բոլոր տարրերը: Այդ ժամանակից յուրաքանչյուր մակարդակում տարրերի թիվը մեկով պակաս է
//         նախորդ մակարդակից, իսկ մակարդակի տարրերը պետք է լինեն նախորդ մակարդակի երկու հաջորդական տարրերի գումարը:
//         Օրինակ և բացատրություն՝
/*
        Input : A = {1, 2, 3, 4, 5}
        Output : [48]
        [20, 28]
        [8, 12, 16]
        [3, 5, 7, 9]
        [1, 2, 3, 4, 5]

        Explanation :
        Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
 */
        /*
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int[] newArr = new int[arr.length - i];
            sum = arr[i] + arr[i + 1];
            newArr[i] = sum;


            for (int j = 0; j < newArr.length; j++) {
                System.out.println(newArr);
            }
        }
    }
}
*/
