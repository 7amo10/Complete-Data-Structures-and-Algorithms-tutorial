package Array_Big_O;

class Main_2{
    public static void main(String[] args){
        int arr[] ={2,4,6,8,10,12,14};
        System.out.println("Binary Search: "+binarySearch(arr, 5)); //returns -1 as the element is not present in
    }
    public static int binarySearch(int[] arr, int value) {
        // Initialize low and high pointers
        int start = 0;
        int end = arr.length - 1;
        int middle = (start+end)/2;
        System.out.println(start +" "+end+" "+middle);
        while (arr[middle] != value) {
            if (value < arr[middle]){
                end=middle-1;
            }else if (value > arr[middle]){
                start = middle + 1;
            }
        }
        
        while (start <= end) {
            if (arr[middle] == value){
                return middle;
            } else if (value < arr[middle]){
    }
}
        return middle;
    }
}


    


