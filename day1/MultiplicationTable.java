public class MultiplicationTable {

  public static void displayMulTable(int num, int limit) {
    for (int term = 1; term <= limit; term++) {
      System.out.println(num + " * " + term + " = " + (term * limit));
    }
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Please give valid input");
      return;
    }

    int num = Integer.parseInt(args[0]);
    int limit = Integer.parseInt(args[1]);

    displayMulTable(num, limit);
  }
}
