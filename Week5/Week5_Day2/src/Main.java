public class Main {

    // Task 1. Իրականացնել ֆունկցիա, որը որպես արգումենտ կստանա երկու բնական թվեր և
    //         կհաշվի դրանց գումարը։ Օգտագործել միայն բիթային գործողություններ։
/*
    public static void main(String[] args) {
        int num1 = 2;  // 0 0 1 0
        int num2 = 3;  // 0 0 1 1
        System.out.println(sumFunc(num1, num2));
    }

    public static int sumFunc(int num1, int num2){

        while(num2 != 0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        return num1;
    }
 */

    // Task 2. Իրականացնել ֆունկցիա, որը որպես արգումենտ կստանա երկու բնական թվեր և
    //         կհաշվի դրանց արտադրյալը։ Օգտագործել միայն բիթային գործողություններ։
/*
    public static void main(String[] args) {

        int num1 = 3;    // 0 1 1
        int num2 = 2;    // 0 1 0
                         // 1 1 0
        int product = multiply(num1, num2);
        System.out.println(product);
    }
    public static int multiply(int num1, int num2) {

        int result = 0;

        while (num2 > 0) {

            if ((num2 & 1) == 1) {
                result = sum(result, num1);
            }
            num1 <<= 1;
            num2 >>= 1;
        }
        return result;
    }

    public static int sum(int num1, int num2) {

        while(num2 != 0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        return num1;
    }
*/

    // Task 3. Իրականացնել ֆունկցիա, որը որպես արգումենտ կստանա երկու բնական թվեր
    //         և կհաշվի դրանց էքսպոնոնտը։
/*
    public static void main(String[] args) {

        int base = 3;
        int exponent = 2;
        int result = calculateExponent(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is` " + result);
    }

    public static int calculateExponent(int base, int exponent){

        if(exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a non-negative integer.");
        }

        if(exponent == 0) {
            return 1;
        }

        int result = 1;
        while (exponent > 0) {

            if((exponent & 1) == 1){
                result = result * base;
            }

            base = base << 1;
            exponent = exponent >> 1;
        }
        return result;
    }
*/

    // Task 4. Կատարել swap գործողություն թվի i և j բիթերը տեղափոխելու համար։
/*
    public static void main(String[] args) {

        int num = 5;
        System.out.println("Original: " + myToBinaryString(num));

        int swappedNum = swapBits(num, 3, 0);
        System.out.println("Swapped:  " + myToBinaryString(swappedNum));
    }

    public static int swapBits(int num, int i, int j) {

        int bitI = (num >> i) & 1;  // 0101
        int bitJ = (num >> j) & 1;  // 1100

        if (bitI != bitJ) {
            num ^= (1 << i) | (1 << j);
        }
        return num;
    }
    public static String myToBinaryString(int num){

        StringBuilder str = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            str.append(bit);
        }
        return str.toString();
    }
 */


    // Task 5. Տպել ստացված թվի երկուական համակարգի ներկայացումը։
    //         Օգտագործելով բիթային գործողություններ։
/*
    public static void main(String[] args) {

        int number = 5;
        String result = myToBinaryString(number);
        System.out.print("\nResult = " + result);
    }

    public static String myToBinaryString(int num){

        StringBuilder str = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            str.append(bit);
        }
        return str.toString();
    }
 */


    // Task 6. Շրջել թվի բիթերը(reverse), օրինակ՝ 11110000 -> 00001111։ - ?
/*
    public static void main(String[] args) {
        int number = 0b11110000;
        int reversedNumber = reverseBits(number);
        System.out.println("Original number = " + Integer.toBinaryString(number));
        System.out.println("Reversed number = " + Integer.toBinaryString(reversedNumber));
    }

    public static int reverseBits(int n){

        int reversed = 0;
        for (int i = 0; i < 12; i++) {
            int bit= (n & 1);
            reversed = (reversed << 1) | bit;
            n = n >> 1;
        }
        return reversed;
    }
*/


    // Task 7. Ստուգել թիվը 2-ի աստիճան է, թե ոչ։
/*
    public static void main(String[] args) {

        int number = 16;
        boolean isPowerOfTwo = checkPowerOfTwo(number);
        System.out.println(number + " is a power of 2` " + isPowerOfTwo);
    }

    public static boolean checkPowerOfTwo(int n){

        if(n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
*/


    // Task 8. Տրված է ամբողջ թվերի զանգված, որում բոլոր էլեմենտները կրկնվում են, բացի
    //         մեկից։ Իրականացնել ալգորիթմ, որը կգտնի միակ էլեմենտը O(n) ժամանակում։
    //         Օգտվել բիթային գործողություններից։

    public static void main(String[] args) {

        int[] array = {4, 2, 1, 2, 1, 4, 7};
        int uniqueElement = findUniqueElement(array);
        System.out.println("The unique element is: " + uniqueElement);
    }

    public static int findUniqueElement(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}