import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. Գրել ֆունկցիա, որը ստանում է զանգված եւ ինդեքսի համար։
        //         Ֆունկցիան հեռացնում է զանգվածի տրված ինդեքսով տարրը եւ վերադարձնում նոր զանգվածը որպես արդյունք։
/*
        Scanner arr = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter array's elements.");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        System.out.print("\nEnter array index = ");
        int index = arr.nextInt();


        System.out.print("New array = [");
        int[] func = method(array, index);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(func[i] + " ");
        }
        System.out.print("]");
    }

    public static int[] method(int[] arr, int index) {

        if (index < 0 || index >= arr.length) {
            System.out.print("Index out of bounds");
            return arr;
        }

        int[] new_arr = new int[arr.length - 1];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != index) {
                new_arr[k] = arr[i];
                ++k;
            }

//            if(i == index){
//                continue;
//               }
//               new_arr[k++] = arr[i];
//
        }
        return new_arr;
    }
}
*/

        // Task 2. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել char-երի զանգված և դուրս կբերի բոլոր թվերը:
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of  the char array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        char[] charArray = new char[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter character at index " + i + ": ");
            charArray[i] = scanner.nextLine().charAt(0);
        }

        System.out.print("Charecter Array = [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.print("]");

        System.out.print("\nNumbers in the char array: ");
        for (int i = 0; i < size; i++) {
            if (Character.isDigit(charArray[i]))
                System.out.print(charArray[i] + " ");
        }
    }
}
*/


        // Task 3. Գրեք ծրագիր, որը գեներացնում է Ֆիբոնաչիի հաջորդականությունը մինչև սահմանված թիվը օգտագործելով
        //         «do-while» օղակը: Խնդրեք օգտվողին մուտքագրել թիվը և ցուցադրել Ֆիբոնաչիի հաջորդականությունը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of terms in the Fibonacci series: ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\nFibonacci sequence up to " + number + ":");
        generateFibonacci(number);
        scanner.close();   //?
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void generateFibonacci(int maxNumber) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");

        int nextTerm;
        do {
            nextTerm = firstTerm + secondTerm;
            if (nextTerm < maxNumber) {
                System.out.print(nextTerm + " ");
            } else break;

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        while (nextTerm <= maxNumber);
    }
}
*/

        // Task 4. Գրեք ծրագիր, որը տպում է էկրանին տվյալ թվի բազմապատկման աղյուսակը: Հաշվի առեք, որ թիվը պետք է դրական լինի։
/*
        int number = 25;
        int size = 15;
        int mul = 1;

        if(number > 0){
            System.out.println("\n" + number + "'s multiplication table");
            for (int i = 1; i < size; i++) {
                mul = i * number;
                System.out.println(i + " * " + number + " = " + mul);
            }

        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
*/

        // Task 5. Գրեք ծրագիր, որը հաշվարկում է բոլոր զույգ թվերի գումարը երկու տրված թվերի միջև։
/*
        int end = 15;
        int sum = 0;
        System.out.println();
        for (int start = 1; start <= end; start++) {
            if(start % 2 == 0){
                sum += start;
                System.out.println("Even numbers is` " + start);
            }
        }
        System.out.println("Sum = " + sum);
*/

        // Task 6. Գրեք ծրագիր, որը օգտվողին թույլ կտա մուտքագրել ամբողջ թվային զանգվածի էլեմենտների արժեքները
        //         և տպում է այդ զանգավածի էլեմենտների միջին թվաբանականի արժեքը:
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's size = ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " element is = ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");


        int sum = 0;
        double aritmeticNumber;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aritmeticNumber = (double)sum / size;
        System.out.println("\nSum = " + sum);
        System.out.println("\nArrays aritmetic numbers is = " + aritmeticNumber);
*/

        // Task 7. Գրեք ծրագիր, որը էկրանին տպում է ‘*’ սիմվոլների միջոցով հավասարասրուն ուղանկյուն եռանկյան պատկերը։
        //         Եռանկյան սրունքի երկարությունը մուտքագրվում է օգտվողի կողմից։ Ծրագիրը գրելուց օգտվեք ցիկլերից։
        //          Օրինակ 5 մուտքագրելու դեպքում էկրանին կհայտնվի հետևյալ պատկերը։
        //  *
        //  *  *
        //  *  *  *
        //  *  *  *  *
        //  *  *  *  *  *
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter shank length = ");
        int shankLength = scanner.nextInt();

        for (int i = 0; i <= shankLength; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   }
}
*/

        // Task 8. Գրեք ծրագիր, որը էկրանին տպում է ‘*’ սիմվոլների միջոցով քառակուսու պատկերը։
        //         Քառակուսու կողի երկարությունը մուտքագրվում է օգտվողի կողմից։ Ծրագիրը գրելուց օգտվեք ցիկլերից։
        //         Օրինակ 5 մուտքագրելու դեպքում էկրանին կհայտնվի հետևյալ պատկերը։
        //
        //
        // *   *   *   *   *
        // *               *
        // *               *
        // *               *
        // *   *   *   *   *
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the length of the side of the square = ");
        int squareLength = scanner.nextInt();

        for (int i = 0; i < squareLength; i++) {
            for (int j = 0; j < squareLength; j++) {
                if(i == 0 || i == squareLength - 1 || j == 0 || j == squareLength - 1){
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
   }
}
*/






















    }
}