class Power {
  public static void main(String[] args) {
    Power main = new Power();
    var result = main.power(2, 3);
    System.out.println(result);
  }

  public int power(int base, int exp) {
    if (exp < 0) {
      return -1;
    }
    if (exp == 0) {
      return 1;
    }
    if (exp == 1) {
      return base;
    }
    return base * power(base, exp - 1);
  }

  //* Second method with considring fractions and negative numbers
  
  // public double power(int base, int exp) {
  //   if (exp < 0) {
  //     return 1.0 / power(base, -exp);
  //   }
  //   if (exp == 0) {
  //     return 1;
  //   }
  //   if (exp == 1) {
  //     return base;
  //   }
  //   return base * power(base, exp - 1);
  // }
}
