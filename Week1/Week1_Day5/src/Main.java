import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրել ծրագիր, որը կստուգի երկու նույն չափսի զանգվածները նույնն են, թե ոչ։
        //         Այսինքն արդյոք բոլոր համապատասխանող ինդեքսներով արժեքները համընկնում են թե ոչ։
/*
        int array1[] = {1, 2, 3, 4, 5, 6};
        int array2[] = {1, 2, 3, 4, 5};

        if(areEqualArray(array1, array2)) {
            System.out.println("Arrays are equal.");
        } else
            System.out.println("Arrays aren't equal.");
    }

    public static boolean areEqualArray(int[] array1, int[] array2){

        if(array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
 */

        // Task 2. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի
        //         էլեմենտների արժեքները և տպում է էկրանին նվազագույնի արժեքը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array's elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("\nMin = " + min);
    }
}
*/

        // Task 3. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի
        //         էլեմենտների արժեքերը և տպում է բոլոր էլեմենտների գումարը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array's elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("\nSum = " + sum);
    }
}
*/

        // Task 4. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի
        //         էլեմենտների արժեքները և տպում է նվազագույն արժեքով էլեմենտի ինդեքսը։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array's elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println("\nMin_index = " + min_index);
    }
}
*/

        // Task 5. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների
        //         արժեքները և տպում է նվազագույն և առավելագույն արժեքներով էլեմենտների գումարը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array's elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            sum = max + min;
        }
        System.out.println("\nSum = " + sum);
    }
}
 */

        // Task 6. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել նույն չափսի, երկու ամբողջ թվային՝ զանգվածների
        //         էլեմենտների արժեքները և տպում է՝ համապատասխանող ինդեքսեներով էլեմնետների արտադրյալը էկրանին:

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first array's size");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("\nEnter first array's elements");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("\nEnter second array's elements");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }

        //------------------------- Print arrays ------------------------------------------

        System.out.print("Array1 = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("]");


        System.out.print("\nArray2 = [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("]");

        //----------------------------- Multiplication -------------------------------------

        int mul = 1;
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            mul = arr1[i] * arr2[i];
            System.out.println("Mul = " + "Index[" + i + "] = " + mul);
        }
    }
}
*/

        // Task 7. Գրել ֆունկցիա, որը ստանում է ամբողջ թիվ (int), այդ թվին գումարում նրա reverse֊ը,
        //         քանի դեռ չի ստացել պոլինդրոմ արժեք, և վերադարձնում է քայլերի քանակը, այդ արժեքին հասնելու համար։ օր․՝

        //       1.  123 + 321 = 444 ստացանք պոլինդրոմ և վերադարձրինք 1,
        //       2.  555 պոլինդրոմ է, վերադարձրինք 0,
        //       3.  49 + 94 = 143, պոլինդրոմ չէ, հետևաբար 143 + 341 = 484, ստացանք պոլինդրոմ և վերադարձրինք 2։
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();
        int step = getPolyndromSteps(number);
        System.out.println("Steps for " + number + ": " + step);
    }

    public static int getPolyndromSteps(int number){
        int steps = 0;

        while(!isPolyndrom(number)){
            int inverse = reverseNumber(number);
            number += inverse;
            steps++;
        }
        return steps;
    }
    public static boolean isPolyndrom(int number){
        String strNum = String.valueOf(number);
        String reverseStr = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reverseStr);
    }

    public static int reverseNumber(int number){

        int reversedNum = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNum = (reversedNum * 10) + digit;
            number = number / 10;
        }
        return reversedNum;
    }

}
*/

        // Task 8. Palindrome Check. Գրեք ֆունկցիա, որը ստուգում է, թե արդյոք տվյալ տողը պալինդրոմ է
        //         (նույնը կարդում է առաջ և հետ): Անտեսեք բացատները, կետադրական նշանները և մեծատառերը:
    /*
        String str1 = "A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(str1)); // true

        String str2 = "Not a palindrome";
        System.out.println(isPalindrome(str2)); // false
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return checkPalindrome(cleanStr);
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
*/
        // Task 9. Գտեք ամենաերկար բառը. գրեք ֆունկցիա, որը մուտքագրում է նախադասությունը և վերադարձնում նախադասության ամենաերկար բառը:
        //         Եթե կան մի քանի բառեր միևնույն երկարությամբ, վերադարձրեք առաջինը:
/*
        String sentence = "This is a sample sentence to find the longest word.";
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words using whitespace as a delimiter
        String longestWord = "";

        for (String word : words) {
            // Remove punctuation from the word
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");

            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        return longestWord;
    }
}
*/

        // Task 10. Reverse a String. Գրեք ֆունկցիա, որն ընդունում է տողը որպես մուտքագրում և վերադարձնում է
        //          այդ տողի հակադարձ կողմը: Օրինակ, եթե մուտքագրումը «hello» է, ապա ելքը պետք է լինի «olleh»:

        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Input = " + input);
        System.out.println("Reverse = " + reversed);
    }

    public static String reverseString(String input){

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while(left < right){
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}


        // Task 11. Գտեք կրկնօրինակներ. գրեք ֆունկցիա, որը վերցնում է թվերի զանգված և վերադարձնում է միայն եզակի տարրեր պարունակող
        //          զանգված (հեռացնել կրկնօրինակները):





