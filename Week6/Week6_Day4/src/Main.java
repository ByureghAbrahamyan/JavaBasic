import java.util.*;

public class Main {
    /*
    public static void main(String[] args) {

        String[] arr1  = {"abc", "fff", "fd"};
        String[] result = solution(arr1);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(String[] arr1){

        String maxLength = arr1[0];
        for (int i = 0; i < arr1.length; i++) {

            if(arr1[i].length() > maxLength.length()){
                maxLength = arr1[i];
            }
        }

        List<String> longestWord = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].length() == maxLength.length()){
                longestWord.add(arr1[i]);
            }
        }

        String[] newString = new String[longestWord.size()];
        for (int i = 0; i < newString.length; i++) {
            newString[i] = longestWord.get(i);
        }
        return newString;
    }
     */

    /*
    public static void main(String[] args) {

        int[] arr = {50, 60, 60, 15, 70};
        int[] newArr = solution(arr);

        System.out.print("NewArr = [");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.print("]");
    }

    public static int[] solution(int[] arr){

        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {

            if(i % 2 == 0){
                first += arr[i];
            } else {
                second += arr[i];
            }
        }
        return new int[] { first, second };
    }
     */

    // Task 1. Տալ x ոչ բացասական ամբողջ թիվ,որը կվերադարձնի x-ի քառակուսի արմատը կլորացված մինչև
    //         մոտակա ամբողջ թիվը: Վերադարձված ամբողջ թիվը նույնպես պետք է լինի ոչ բացասական:
    /*
    public static void main(String[] args) {

        int x = 26;
        int result = mySqrt(x);
        System.out.println("Sqrt " + x + " is a` " + result + ".");
    }

    public static int mySqrt(int x) {

        if(x < 0){
            System.out.println("Enter positive number.");
        }

        int num = 0;
        for (int i = 0; i * i <= x; i++) {
            num = i;
        }
        return num;
    }
     */

    // Task 2. TwoSum
    //         https://leetcode.com/problems/two-sum/
    /*
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               if(nums[i] + nums[j] == target)
                   return new int[]{i, j};
            }
        }
        return new int[]{};
    }
 */

    // Task 3. Valid Parentheses
    //         https://leetcode.com/problems/valid-parentheses/
    /*
    public static void main(String[] args) {

        String s = "[]";
        boolean result = isValid(s);
        System.out.println("Is the string valid? " + result);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
 */

    // Task 4. Palindrome Number
    //         https://leetcode.com/problems/palindrome-number/
    /*
    public static void main(String[] args) {

        int number = 101;
        boolean result = isPalindrome(number);
        System.out.println("Is palindrome number? " + result);

    }
    public static boolean isPalindrome(int num) {

        if(num < 0) {
            return false;
        }
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        return reversedNum == originalNum;
    }
     */
    
}
