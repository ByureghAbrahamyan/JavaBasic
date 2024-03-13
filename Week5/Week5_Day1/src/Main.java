public class Main {

    // Task 0. Տպել ստացված թվի երկուական համակարգի ներկայացումը։ Օգտագործելով բիթային գործողություններ։
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

    // Task 1. Տրված թվի երկուական համակարգի ներկայացման մեջ հաշվել 1-երի քանակը։
    /*
    public static void main(String[] args) {

        int number = 12;
        int result = myToBinaryString(number);
        System.out.print("\nResult = " + result);
    }

    public static int myToBinaryString(int num) {

        int count = 0;
        while (num != 0) {
            count += num & 1;
            num = num >>> 1;
        }
        return count;
    }
     */

    // Task 2. Ստուգել թվի 1 արժեքով բիթերի քանակը կենտ է, թե զույգ:
    /*
    public static void main(String[] args) {

        int number = 5;
        int result = myToBinaryString(number);
        if(result % 2 == 0){
            System.out.print("Count is even " + result);
        } else System.out.print("Count is odd " + result);
    }

    public static int myToBinaryString(int num) {

        int count = 0;
        while(num != 0){
            count += num & 1;
            num = num >>> 1;
        }
        return count;
    }
     */

    // Task 3. Գրել void set(int n, int i) ֆունկցիան, որը տրված n թվի i-րդ բիթը կդարձնի 1։
    /*
    public static void main(String[] args) {

        int number = 5;
        int index = 3;
        set(number, index);
    }
    public static String myToBinaryString(int num){

        StringBuilder str = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            str.append(bit);
        }
        return str.toString();
    }
    public static void set(int n, int i){

        if (i < 0 || i > 31) {
            System.out.println("Invalid index");
        }

        int result = n | (1 << i);

        System.out.println("Original = " + myToBinaryString(n));
        System.out.println("Modified = " + myToBinaryString(result));
    }
 */

    // Task 4. Գրել void reset(int n, int i), որը տրված n թվի i-րդ բիթը կդարձնի 0։
    /*
    public static void main(String[] args) {

        int number = 5;
        int index = 2;
        reset(number, index);
    }
    public static String myToBinaryString(int num){

        StringBuilder str = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            str.append(bit);
        }
        return str.toString();
    }
    public static void reset(int n, int i){

        if (i < 0 || i > 31) {
            System.out.println("Invalid index");
        }

        int result = n & ~(1 << i);

        System.out.println("Original = " + myToBinaryString(n));
        System.out.println("Modified = " + myToBinaryString(result));
    }
     */

    // Task 5. Գրել void flip(int n, int i), որը տրված n թվի i-րդ բիթը  կշրջի, այսինքն 1-ը կդարձնի 0, 0-ն 1:

    public static void main(String[] args) {

        int number = 25;
        int index = 0;
        flip(number, index);
    }
    public static String myToBinaryString(int num){

        StringBuilder str = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            str.append(bit);
        }
        return str.toString();
    }
    public static void flip(int n, int i){

        if (i < 0 || i > 31) {
            System.out.println("Invalid index");
        }

        int result = n ^ (1 << i);

        System.out.println("Original = " + myToBinaryString(n));
        System.out.println("Modified = " + myToBinaryString(result));
    }
}