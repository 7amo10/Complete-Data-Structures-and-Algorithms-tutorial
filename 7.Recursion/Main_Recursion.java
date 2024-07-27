class Main_Recursion {
  public static void main(String[] args) {
    Main_Recursion recursion = new Main_Recursion();
    var rec = recursion.factorial(5);
    System.out.println(rec);
  }

  public int factorial(int n) {
    if (n<1) {
      return -1;
    }
    if (n==0 || n==1) {
      return 1;
    }
    return n * factorial(n-1);
  }
}
