import java.util.Arrays;

public class Main_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 14, 1, 9, 7, 3, 10, 4, 12};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
