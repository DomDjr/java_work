import java.util.Arrays;
import java.util.Random;

public class L07 {
    private static Random random = new Random();

    public static void main(String[] args) {
        // TO DO:
        // Test your sorting algorithm implementations here
        StopWatch timer = new StopWatch();
        System.out.println("TIME IN NANOSECONDS");
        for(int i=0; i<100; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("--Testing different sorts with different arrays--");

        System.out.println("\n" + "Testing bubbleSort");
        timer.start();
        bubbleSort(generateArray(10, 0, 10));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending bubbleSort");

        System.out.println("\n" + "Testing optimizedBubbleSort");
        timer.start();
        bubbleSortOptimized(generateArray(10, 0, 10));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending optimizedBubbleSort");

        System.out.println("\n" + "Testing insertionSort");
        timer.start();
        insertionSort(generateArray(10, 0, 10));
        timer.stop();
        System.out.println(timer.getElapsedTime());
        System.out.println("Ending insertionSort");

        System.out.println("\n" + "Testing selectionSort");
        timer.start();
        selectionSort(generateArray(10, 0, 10));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending selectionSort");

        int[] quickSortArray = generateArray(10, 0,10);

        System.out.println("\n" + "Testing quickSort");
        timer.start();
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        displayArray(quickSortArray);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(quickSortArray));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending quickSort");

        System.out.println("\n" + "--Testing sorts with the same array--");

        int[] bubbleArray = generateArray(10,0,20);
        int[] insertionArray = cloneArray(bubbleArray);
        int[] optimizedArray = cloneArray(insertionArray);
        int[] selectionArray = cloneArray(optimizedArray);
        int[] quickArray = cloneArray(insertionArray);

        displayArray(bubbleArray);

        System.out.println("\n" + "Testing bubbleSort");
        timer.start();
        bubbleSort(bubbleArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending bubbleSort");

        System.out.println("\n" + "Testing OptimizedbubbleSort");
        timer.start();
        bubbleSortOptimized(optimizedArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending OptimizedBubbleSort");

        System.out.println("\n" + "Testing selectionSort");
        timer.start();
        selectionSort(selectionArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending selectionSort");

        System.out.println("\n" + "Testing insertionSort");
        timer.start();
        insertionSort(insertionArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending insertionSort");


        System.out.println("\n" + "Testing quickSort");
        timer.start();
        quickSort(quickArray, 0, quickArray.length - 1);
        displayArray(quickArray);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(quickArray));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending quickSort");

        System.out.println("\n" + "sorting array without a fixed upper and lower bound");

        int[] randomBubbleArray = generateArray(10);
        int[] randomInsertArray = cloneArray(randomBubbleArray);
        int[] randomSelectionArray = cloneArray(randomInsertArray);
        int[] randomOptimizedBubbleArray = cloneArray(randomBubbleArray);
        int[] randomQuickArray = cloneArray(randomInsertArray);

        System.out.println("\n" + "--Testing sorts with the same array but without fixed upper and lower bound--");

        System.out.println("\n" + "Testing bubbleSort");
        timer.start();
        bubbleSort(randomBubbleArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending bubbleSort");

        System.out.println("\n" + "Testing OptimizedbubbleSort");
        timer.start();
        bubbleSortOptimized(randomOptimizedBubbleArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending OptimizedBubbleSort");

        System.out.println("\n" + "Testing insertionSort");
        timer.start();
        insertionSort(randomInsertArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending insertSort");

        System.out.println("\n" + "Testing selectionSort");
        timer.start();
        selectionSort(randomSelectionArray);
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending selectionSort");

        System.out.println("\n" + "Testing quickSort");
        timer.start();
        quickSort(randomQuickArray, 0, randomQuickArray.length - 1);
        displayArray(randomQuickArray);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(randomQuickArray));
        timer.stop();
        System.out.println("sorted in " + timer.getElapsedTime() + " nanoseconds");
        System.out.println("Ending quickSort");

    }

    // TO DO:
    // Implement
    public static void bubbleSort(int[] array) {

        for( int i = 0; i < array.length - 1; i++ ) {
            for( int j = 0; j < array.length - i - 1; j++ ) {
                if( array[j] > array[j + 1] ) {
                    //swaps array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        displayArray(array);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(array));
    }

    // TO DO:
    // Implement
    public static void bubbleSortOptimized(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean is_sorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    is_sorted = false;
                }
            }
            if (is_sorted) {
                displayArray(array);
                System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(array));
                return;
            }
        }
    }

    // TO DO:
    // Implement
    public static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            //j is used to compare the value of the left of index i
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                //shift element to the right
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        displayArray(array);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(array));
    }

    // TO DO:
    // Implement
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = 1;
            for(int j = i + 1; j < array.length; j++) {
                if (array[min] > array[i]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        displayArray(array);
        System.out.println("The array is sorted in nondescending order:" + isSortedInNondescendingOrder(array));
    }

    // TO DO:
    // Implement
    public static void quickSort(int[] array, int start, int end) {

        //base case
        if(end <= start) {
            return;
        }
        //uses helper method
        int pivot = partition(array, start, end);
        //recursion occurs
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }
    //quicksort helper method
    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;

    }

    //////* HELPER METHODS *//////
    public static boolean isSortedInNondescendingOrder (int[] array) {
        for(int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] cloneArray(int[] array) {
        int[] clone = new int[array.length];
        System.arraycopy(array,0, clone, 0, array.length);
        return clone;
    }

    public static int[] generateArray(int length) {
        int[] array = new int[length];

        for(int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static int[] generateArray(int length, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            throw new RuntimeException("lowerBound cannot be higher than upperBound");
        }

        int[] array = new int[length];

        for(int i = 0; i < length; i++) {
            array[i] = lowerBound + random.nextInt(upperBound - lowerBound + 1);
        }

        return array;
    }

    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
