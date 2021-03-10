package pid.exercise.sort;

public class BubbleSort {

    public static void sort(int[] array) {
        int maxIndex = array.length - 1;
        // the left comparator starts at index 0, and increments by one
        // as the highest value is placed at the end of the array,
        // we loop until we reach the index 2 before the last verified ordered position
        for (int i = 0; i < maxIndex - 1 - i; i++) {
            // the right comparator starts at index 0, and increments by one
            // as the highest value is placed at the end of the array,
            // we loop until we reach the index before the last verified ordered position
            for (int j = i + 1; j < maxIndex -1; j++){ // right comparator
                if (array[i] > array[j]) { // if left position is higher, swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}


