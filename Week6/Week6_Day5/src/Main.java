import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ----------------- Week6_Day5 -----------------------------

        // Task 1. Roman to Integer
        //         https://leetcode.com/problems/roman-to-integer/

    public static void main(String[] args) {

        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer` " + romanNumeral + " is` " + result);
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('D', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0 ; i--) {
            int currentvalue = romanValues.get(s.charAt(i));

            if(currentvalue < prevValue) {
                result -= currentvalue;
            } else {
                result += currentvalue;
            }

            prevValue = currentvalue;
        }
        return result;
    }


        // Task 4. Merge Sorted Array
        //         https://leetcode.com/problems/merge-sorted-array/

//        public static void main(String[] args) {
//
//            int[] nums1 = {1, 5, 9, 3};
//            int[] nums2 = {2, 7, 8, 3};
//
//            int m = nums1.length;
//            int n = nums2.length;
//
//            merge(nums1, m, nums2, n);
//            System.out.println(Arrays.toString(nums1));
//        }
//
//        public static void merge(int[] nums1, int m, int[] nums2, int n) {
//            int i = m - 1;
//            int j = n - 1;
//            int k = m + n - 1;
//
//            while (i >= 0 && j >= 0) {
//                if (nums1[i] > nums2[j]) {
//                    nums1[k] = nums1[i];
//                    i--;
//                } else {
//                    nums1[k] = nums2[j];
//                    j--;
//                }
//                k--;
//            }
//
//            // If there are remaining elements in nums2
//            while (j >= 0) {
//                nums1[k] = nums2[j];
//                j--;
//                k--;
//            }
//        }

  //  }
}