//&import java.util.Arrays;

public class Main_A {
    public static void main(String[] args) {

//        SingleDimensionArray sda = new SingleDimensionArray(13);
//
//        sda.insert(0, 0);
//        sda.insert(1, 10);
//        sda.insert(2, 20);
//        sda.insert(1, 30);
//        sda.insert(12, 120);


//==========================================================
//insert method
        /*
        sda.insert(0, 10); 
        sda.insert(1, 20);
        sda.insert(2, 30);
        var firstElement = sda.arr[2];//time complexity is O(1)
        System.out.println(firstElement); //time complexity is O(1)
         */
//==========================================================
// Array Traversal
        //System.out.println("Array traversal:");
        //sda.traverseArray();
//==========================================================
        //sda.searchInArray(20);
        //sda.searchInArray(10);
        //sda.deleteValue(0);
//==========================================================
//----------Two dimensional Array-------------
        /*
        //Declare
        int[][] int2DArray; //time complexity is O(1)
        //Instantiate
        int2DArray = new int[2][2]; //time complexity is O(1)
        //Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        //time complexity is O(m*n)
        System.out.println(Arrays.deepToString( int2DArray)); //time complexity is O(1)
        //Al together
        String s2DArray[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));
        */
//space complexity is O(mn)
//==========================================================
        //insertion
        /* 
        TwoDimensionalArray sdac = new TwoDimensionalArray(3,3);
        sdac.insertValueInTheArray(0, 0, 10);
        sdac.insertValueInTheArray(0, 1, 20);
        sdac.insertValueInTheArray(1, 0, 30);
        sdac.insertValueInTheArray(1, 1, 40);
        //sdac.accessCell(0, 1);
        //sdac.traverse2DArray();
        //sdac.searchingValue(50);
        System.out.println(Arrays.deepToString(sdac.arr));
        sdac.deleteValuefromArray(0,1);
        System.out.println(Arrays.deepToString(sdac.arr));
        */

//        long[] arr = new long[100];
//        int enlmn;
//        int searchkey;
//        int j;
//        arr[0] = 77;
//        arr[1] = 99;
//        arr[2] = 44;
//        arr[3] = 55;
//        arr[4] = 22;
//        arr[5] = 88;
//        arr[6] = 11;
//        arr[7] = 89;
//        arr[8] = 66;
//        arr[9] = 33;
//
//        enlmn = 10;
//
//        //-------------------------------------
//        searchkey = 89;
//        for (j = 0; j < enlmn; j++) {
//            if (arr[j] == searchkey) {
//                System.out.println("found search " + searchkey);
//                break;
//            }
//        }
//
//        if (j == enlmn) {
//            System.out.println("not found ");
//
//
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        // Get the size of the array from the user
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        // Create an array of the specified size
//        int[] myArray = new int[size];
//
//        // Get elements of the array from the user
//        System.out.println("Enter the elements of the array:");
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter element at index " + i + ": ");
//            myArray[i] = scanner.nextInt();
//        }
//
//        // Display the elements of the array
//        System.out.println("The elements of the array are:");
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(myArray[i] + " ");
//        }
//
//        scanner.close();

//        double[] myList = {1, 5, 5, 5, 5, 1};
//        double max = myList[0];
//        int indexOfMax = 0;
//        for(int i = 1; i < myList.length; i++){
//            if(myList[i] > max){
//                max = myList[i];
//                indexOfMax = i;
//            }
//        }
//        System.out.println(indexOfMax);

        long[] arr;
        arr = new long[3];
        int searchkey;
        int j;
        int elem = arr.length;

        arr[0] = 50;
        arr[1] = 90;
        arr[2] = 10;

        searchkey = 10;
        for (j = 0; j < elem; j++) {
            if (arr[j] == searchkey) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        
        for (j = 0; j < elem; j++) {
            if (arr[j] == searchkey) {
                System.out.println("Found " + searchkey);
                break;
            }
            if (j == elem) {
                System.out.println("Cannot find the number " + searchkey);
            }
        }
    }
}







