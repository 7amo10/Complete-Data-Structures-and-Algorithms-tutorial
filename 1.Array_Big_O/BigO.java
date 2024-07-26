package Array_Big_O;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class BigO {
    public static void main(String[] args){
        BigO main = new BigO();
        int [] customArray = {1,3,4,5};
        // int [] customArray2 = {1,3,4,5,6,7,8};
        //main.spoofArray(customArray);
        // main.printpairs(customArray);
        main.Reverse(customArray);
        //  main.printUnorderedPairs(customArray,customArray2);
    }
    //sum and product of an array
    void spoofArray(int[] array){
        int sum =0;     //todo O(1) time complexity
        int product =1; //todo O(1) time complexity
        for (int i=0; i<array.length; i++){ //todo O(N) time complexity
            sum +=array[i];  //todo O(1) time complexity
        }
        for (int i=0; i<array.length; i++){  //todo O(N) time complexity
            product *=array[i];              //todo O(1) time complexity
        }
        System.out.println(sum+","+product);  //todo O(1) time complexity
    }
    //========================================================================
    //  print pairs of numbers
    void printpairs(int[] array){
        for (int i=0; i<array.length; i++){ //todo O(N) time complexity
            for (int j=0; j<array.length; j++){  //todo O(N) time complexity
                System.out.println(array[i] + "," + array[j]); //todo O(1) time complexity
            }
        }
        //todo O(N^2) Total time complexity
    }
    //========================================================================
    //if the counter become one more element over the first number of iteration:
    //todo The time complexity becomes n^2 - n/2 and with non dominant-term it becomes O(N^2)
    /*
    for (int i=0; i<array.length; i++){ //todo O(N) time complexity
        for (int j=i+1; j<array.length; j++){  //todo O(N) time complexity
            System.out.println(array[i] + "," + array[j]); //todo O(1) time complexity
        }
    */
    //========================================================================
    // If we code 2 different arrays and make nested loop over them:
    //todo Time complexity becomes O(ab) ?!
    //todo as there 2 different arrays for each elelment in a it will loop throw elements in b
    //========================================================================
    void printUnorderedPairs (int[] arrayA, int[] arrayB){
        for (int i=0; i<arrayA.length; i++){ //todo O(a) time complexity
            for (int j=0; j<arrayB.length; j++){  //todo O(b) time complexity
                //todo this part takes O(ab) Time complexity
                for (int k = 0; k<10; k++){  //todo O(1) time complexity because it reaches 1 million,
                    //todo which is at the end constant
                    System.out.println(arrayA[i] + "," + arrayB[j]); //todo O(1) time complexity
                }
            }
        }
        //todo Total Time complexity is O(ab)
    }
    //========================================================================
    void Reverse (int[] array){
        for (int i=0; i<array.length/2; i++){ //todo O(N/2) time complexity
            int other = array.length-i-1; //todo O(1) time complexity
            int temp = array[i];          //todo O(1) time complexity
            array[i] = array[other];      //todo O(1) time complexity
            array[other] = temp;          //todo O(1) time complexity
        }
        System.out.println(Arrays.toString(array));  //todo O(N) time complexity

    }
    //todo Total Time complexity is O(N)
    //========================================================================
}