public class GCD {

  public static int getGcd(int num1, int num2) {
    int gcd = num1;
    num1 = Math.max(num1, num2);
    num2 = Math.min(gcd, num2);

    while (num2 != 0) {
      gcd = num2;
      num2 = num1 % num2;
      num1 = gcd;
    }
    return gcd;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Please give valid input");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println("GCD is " + getGcd(num1, num2));
  }
}
