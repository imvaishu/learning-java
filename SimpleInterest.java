public class SimpleInterest {
  public static void main(String[] args) {
    if(args.length < 3){
      System.out.println("Please give valid input");
    } else {
      int principal = Integer.parseInt(args[0]);
      int rateOfInterest = Integer.parseInt(args[1]);
      int period = Integer.parseInt(args[2]);
      int simpleInterest = principal * rateOfInterest * period / 100;
      System.out.println(simpleInterest);
    }
  }
}