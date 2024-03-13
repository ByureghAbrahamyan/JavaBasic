public class Main {
    public static void main(String[] args) {

        // Task 1. CustomConcat method.
        //         Concatenates the specified string to the end of this string.
/*
        String originalString = "Hello ";
        String setString = "World ";
        System.out.println(customConcat(originalString, setString));
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


// Task 2. CustomCompareTo method.
//         Compare two strings lexicographically.

        String str1 = "aaaaapple";
        String str2 = "apple";
        System.out.println(str1.compareTo(str2));
        System.out.println(customCompareTo(str1, str2));
    }
    public static int customCompareTo(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            int diff = str1.charAt(i) - str2.charAt(i);
            if(diff != 0){
                return diff;
            }
        }
        return len1 - len2;
    }
}

// Task 3. CustomEndsWith method.
//         Tests if this string ends with the specified suffix.


// Task 4. CustomHashCode method.
//         Returns a hash code for this string.

// Task 5. CustomJoin method.
//        Returns a new String composed of copies of the CharSequence elements
//        joined together with a copy of the specified delimiter.

// Task 6. CustomReplace method.
//        Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.


// Task 7. CustomSplit method.
//        Splits this string around matches of the given regular expression.


// Task 8. CustomSubString method.
//         Returns a string that is a substring of this string.
