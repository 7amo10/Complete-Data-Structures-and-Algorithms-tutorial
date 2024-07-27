class GCD {
  public static void main(String[] args) {
    GCD main = new GCD();
    var result = main.gcd(17,5);
    System.out.println(result);
  }

  public int gcd(int a, int b) {
    if (a<0 || b<0) {
      return -1;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
}
