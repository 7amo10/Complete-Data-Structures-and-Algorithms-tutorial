class Main_RecrusionFibonacci {
  public static void main(String[] args) {
    Main_RecrusionFibonacci recursion = new Main_RecrusionFibonacci();
    var rec = recursion.fibonacci(4);
    System.out.println(rec);
  }

  public int fibonacci(int n) {
    if (n<0) {
      return -1;
    }
    if (n==0 || n==1) {
      return n;
    }
    System.out.println("numbers are:"+n);
    return fibonacci(n-1) + fibonacci(n-2);
  }
} 
