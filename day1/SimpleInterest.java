public class SimpleInterest {
  public static void main(String[] args) {
    if(args.length < 3){
      System.out.println("Please give valid input");
    } else {
      double principal = Integer.parseInt(args[0]);
      double rateOfInterest = Integer.parseInt(args[1]);
      int period = Integer.parseInt(args[2]);
      double simpleInterest = principal * rateOfInterest * period / 100;
      System.out.println(simpleInterest);
    }
  }
}