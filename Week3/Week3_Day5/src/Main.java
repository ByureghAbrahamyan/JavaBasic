public class Main {
    public static void main(String[] args) {

        // Task 4. Տրված ամբողջ թվային զանգվածը սորտավորել Bubble Sort ալգորիթմով։
/*
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        bubbleSort(array);

        System.out.println("\nSorted Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
*/

        // Task 5. Տրված ամբողջ թվային զանգվածը սորտավորել Insertion Sort ալգորիթմով։
/*
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(array);

        // Sorting the array using Insertion Sort
        insertionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Insertion Sort algorithm
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
*/

        // Task 5.2 Recursive Insertion Sort algorithm

        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(array);

        recursiveInsertionSort(array, array.length);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    private static void recursiveInsertionSort(int[] arr, int n) {

        if (n <= 1) {
            return;
        }
        recursiveInsertionSort(arr, n - 1);

        int lastElement = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > lastElement) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = lastElement;
    }
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
