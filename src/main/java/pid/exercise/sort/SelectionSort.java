package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) { // start at index 0, increment until penultimate index
            int min = i; // set min to current outer loop index
            for (int j = i + 1; j < array.length; j++) { // start at index after outer loop index, increment until last index
                if (array[j] <= array[min]) { // if the current inner index is less than the min (outer index)
                    min = j; // set the min to the inner index
                }
            }
            int temp = array[i]; // store the outer index value, before...
            array[i] = array[min]; // swapping the outer index value with the min value found during looping
            array[min] = temp;
        }
    }
}
