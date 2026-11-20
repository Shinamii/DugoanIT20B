package sortingalgorithms;


import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        // Original Array
        int[] originalArray = {
            64, 25, 12, 22, 11,
            90, 34, 5, 77, 18
        };

        // Display Original Array
        System.out.println("Original Array: "
                + Arrays.toString(originalArray));

        // Create separate copies
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);

        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);

        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        // Call Sorting Methods
        bubbleSort(bubbleArray);

        selectionSort(selectionArray);

        insertionSort(insertionArray);

        // Display Sorted Results
        System.out.println("\nBubble Sort: "
                + Arrays.toString(bubbleArray));

        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));
    }

    // 1. BUBBLE SORT
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. SELECTION SORT
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = arr[i];

            arr[i] = arr[minIndex];

            arr[minIndex] = temp;
        }
    }

    // 3. INSERTION SORT
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];

                j--;
            }

            arr[j + 1] = key;
        }
    }
}
