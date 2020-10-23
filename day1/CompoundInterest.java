public class CompoundInterest {

  public static double getCI(int principal, double rateOfInterest, int period) {
    double compoundInterest = principal * Math.pow((1 + rateOfInterest / 100), period);
    return compoundInterest - principal;
  }

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Please give valid input");
      return;
    }

    int principal = Integer.parseInt(args[0]);
    double rateOfInterest = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    System.out.println(getCI(principal, rateOfInterest, period));
  }
}
