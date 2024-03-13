// Task 1. Տրված ամբողջ թվային զանգվածը սորտավորել Bubble Sort ալգորիթմով։
/*
class Main {

    public static void main(String[] args) {

        int[] arr = {5, 7, 3, 1, 2, 6, 8, 4, 9};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]= temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/

// Task 2. Տրված ամբողջ թվային զանգվածը սորտավորել Insertion Sort ալգորիթմով։

class Main {

    public static void main(String args[])
    {
        int arr[] = { 2, 1, 3, 4, 5, 6 };
        System.out.print("\nOriginal array = [");
        printArray(arr);
        System.out.print("]");

        sortInsertion(arr);
        System.out.print("\nSorted array = [");
        printArray(arr);
        System.out.print("]");
    }
    public static void sortInsertion(int arr[]) {

        for (int i = 1; i < arr.length; ++i) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
