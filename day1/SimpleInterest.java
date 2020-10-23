public class SimpleInterest {
  public static double getSI(int principal,int rateOfInterest,int period) {
    return (principal * rateOfInterest * period) / 100 ;
  }

  public static void main(String[] args) {
    if(args.length < 3){
      System.out.println("Please give valid input");
      return;
    } 

      int principal = Integer.parseInt(args[0]);
      int rateOfInterest = Integer.parseInt(args[1]);
      int period = Integer.parseInt(args[2]);

      double simpleInterest = getSI(principal, rateOfInterest, period);

      System.out.println("Simple interest is " + simpleInterest);
  }
}