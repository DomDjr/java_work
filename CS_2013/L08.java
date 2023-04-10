public class L08 {
    public static void main(String[] args) {
        // TO DO:
        // Test your radix sort implementation here
        StopWatch timer = new StopWatch();
        String[] radixArray = generateStringArray(3, 5);
        System.out.println("The array before sort:");
        displayStringArray(radixArray);
        timer.start();
        radixSort(radixArray);
        timer.stop();
        System.out.println("The array after being sorted:");
        displayStringArray(radixArray);
        System.out.println("The string array is sorted: " + isSortedInNondescendingOrder(radixArray));
        System.out.println("Radix sort took " + timer.getElapsedTime() + " in nanoseconds");

    }

    // TO DO:
    // Implement
    // NOTE: You can assume that all strings in the array have the same length
    public static void radixSort(String[] array) {
        //for loop that goes through 3 indices of each string in the array
        for (int i = 2; i >= 0; i--) {
            //uses bubble sort to sort each char index of the string
            //bubble sort is a stable sort
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 0; k < array.length - j - 1; k++) {
                    if(array[k].charAt(i) > array[k + 1].charAt(i)) {
                        //swaps words as i decrements
                        String temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
                }
            }
        }
    }

    //////* HELPER METHODS *//////
    private static String[] generateStringArray(int wordLen, int arrLen) {
        String[] array = new String[arrLen];

        for(int i = 0; i < arrLen; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < wordLen; j++) {
                sb.append((char)('a' + Math.random() * ('z' - 'a' + 1)));
            }
            array[i] = sb.toString();
        }

        return array;
    }

    private static void displayStringArray (String[] array) {
        for(String s : array) {
            System.out.println(s);
        }
    }

    private static boolean isSortedInNondescendingOrder(String[] array) {
        for(int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i-1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
