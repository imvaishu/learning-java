public class GreatestOf3 {

  public static int greatestOf2(int num1, int num2) {
    return Math.max(num1, num2);
  }

  public static int greatestOf3(int num1, int num2, int num3) {
    return greatestOf2(greatestOf2(num1, num2), num3);
  }

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("please give valid input");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    System.out.println("Greatest of three is " + greatestOf3(num1, num2, num3));
  }
}
