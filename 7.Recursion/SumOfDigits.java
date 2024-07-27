class SumOfDigits {
  public static void main(String[] args) {
    SumOfDigits main = new SumOfDigits();
    var result = main.sumofDigits(54);
    System.out.println(result);

  }

  public int sumofDigits(int n) {

    if (n == 0 || n < 0) {
      return 0;
    }
    return n % 10 + sumofDigits(n / 10);
  }
}
