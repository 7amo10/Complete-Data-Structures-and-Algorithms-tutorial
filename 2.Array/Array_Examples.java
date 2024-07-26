// import java.util.Arrays;
public class Array_Examples {
    // private static int i;

    // !1-

    // public static void main(String[] args) {
    //     int[] myArray = { 1, 2, 3, 4, 5, 6 };

    //     int[] middleArray = Exersize.middle(myArray);

    //     System.out.println("myArray = " + Arrays.toString(myArray));
    //     System.out.println("cuted array = " + Arrays.toString(middleArray));
    // }

    // ? ========================================================================
    // !2-

    // public static void main(String[] args) {
    //     int[][] array = {
    //             { 1, 2, 3 },
    //             { 4, 5, 6 },
    //             { 7, 8, 9 }
    //     };

    //     int sum = Exersize.sumDiagonalElements(array);

    //     System.out.println("Sum of diagonal elements: " + sum);
    // }

    // ? ========================================================================
    // !3-

    // public static void main(String[] args) {
    //     int[] myArray = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
    //     int[] scores = Exersize.findTopTwoScores(myArray);
    //     System.out.println("myArray = " + Arrays.toString(myArray));
    //     System.out.println("cuted array = " + Arrays.toString(scores));
    // }

    // ? ========================================================================
    // !4-

    // public static void main(String[] args) {
    //     int[] array = { 1, 2, 3, 5 };
    //     int missingNumber = Exersize.findMissingNumberInArray(array);
    //     System.out.println("Missing number: " + missingNumber);
    // }

    // ? ========================================================================
    // !5-

    // public static void main(String[] args) {
    //   int[] array = {1, 2, 3, 2, 4, 3, 5};
    //   Exersize Exersize = new Exersize();
    //   int[] uniqueArray = Exersize.removeDuplicates(array);
    //   System.out.println("The final array is:" + Arrays.toString(uniqueArray));
    //   }
    // ? ========================================================================
    // !6-

    // public static void main(String[] args) {
    //   int[] nums = {1, 1, 2,3,2,5};
    //   int uniqueCount = Exersize.removeDuplicates_2(nums);
    //   System.out.println("Unique Count: " + uniqueCount);
    //   }

    // ? ========================================================================

    // !special

    // public static void main(String[] args) {
    //     long x = Ma.factorialprogram(5);
    //     System.out.println("The factorial number is:" + x);
    // }

    // ? ========================================================================
    // !7-

    // public static void main(String[] args) {
    //     int[] prices_main = {7, 1, 5, 3, 6, 4 };
    //     Exersize Exersize = new Exersize();
    //     int max_Profit = Exersize.maxProfit(prices_main);
    //     System.out.println("Max Profit: " + max_Profit);
    // }

    // ? ========================================================================
    // !8-

    // public static void main(String[] args) {
    //     Exersize exersize = new Exersize();
    //     int[] nums = { 2, 7, 11, 15 };
    //     int target = 9;
    //     int[] result = exersize.twoSum(nums, target);
    //     System.out.println(Arrays.toString(result));
    // }

    // ? ========================================================================
    // !9-

    // public static void main(String[] args) {
    //     Exersize exersize = new Exersize();
    //     int[] array = { 1, 2, 3, 4, 5 };
    //     int valueToSearch = 3;
    //     exersize.searchInArray(array, valueToSearch);
    // }

    // ? ========================================================================
    // !10-

    // public static void main(String[] args) {
    //     Exersize mn = new Exersize();
    //     int[] intArray = { 10, 60, 30, 40, 50 };
    //     String pairs = mn.maxProduct(intArray);
    //     System.out.println(pairs);
    // }

    // ? ========================================================================
    // !11-

    // public static void main(String[] args) {
    //   Exersize mn = new Exersize();
    //   int[] intArray = {1,2,78,3};
    //   boolean result = mn.isUnique(intArray);
    //   System.out.println("Does the array has duplicate numbers?" +" " + result);
    // }

    // ? ========================================================================
    // !12-

    // public static void main(String[] args) {
    //     Exersize mn = new Exersize();
    //     int[] array1 = { 1, 2, 3, 4, 5 };
    //     int[] array2 = { 5, 4, 3, 2, 1 };
    //     boolean result = mn.permutation(array1, array2);
    //     System.out.println("Does these arrays are permutaion of each other?" + " " + result);
    // }

    // ? ========================================================================
    // !13-

    // public static void main(String[] args) {
    //     Exersize mn = new Exersize();
    //     int[][] matrix = { { 1, 2, 3 },
    //             { 4, 5, 6 },
    //             { 7, 8, 9 } };
    //     mn.rotateMatrix(matrix);
    //     System.out.println(Arrays.deepToString(matrix));
    // }

    // ? ========================================================================
    // ^ special-2

    // public static void main(String args[]) {
    //     int array_variable[] = new int[10];
    //     for (int i = 0; i < 10; ++i) {
    //         array_variable[i] = i;
    //         System.out.print(array_variable[i] + " ");
    //         i++;
    //     }
    // }

    // ?========================================================================
    // ^ special-3
    // todo great idea

    // public static void main(String args[]) {
    //     int arr[][] = new int[3][];
    //     arr[0] = new int[1];
    //     arr[1] = new int[2];
    //     arr[2] = new int[3];
    //     int sum = 0;
    //     for (int i = 0; i < 3; ++i)
    //         for (int j = 0; j < i + 1; ++j)
    //             arr[i][j] = j + 1;
    //     for (int i = 0; i < 3; ++i)
    //         for (int j = 0; j < i + 1; ++j)
    //             sum += arr[i][j];
    //     System.out.print(sum);
    // }

    // ?========================================================================
    // ^special-4

    // public static void main(String args[]) {
    //     int arr[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    //     int n = 6;
    //     n = arr[arr[n] / 2];
    //     System.out.println(arr[n] / 2);
    // }

    // ?========================================================================

    // public static void main(String args[]) {
    //     int[] a = { 0, 2, 4, 1, 3 };
    //     for (int i = 0; i < a.length; i++) {
    //         a[i] = a[(a[i] + 3) % a.length];
    //     }
    //     System.out.println(a[i]);
    // }

    // ?========================================================================
    // ^special-6

    // public static void main(String args[]) {
    //     int i;
    //     for (i = 1; i < 6; i++) {
    //         if (i > 3)
    //             continue;
    //     }
    //     System.out.println(i);
    // }

    // ?========================================================================
}
