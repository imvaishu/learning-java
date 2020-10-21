public class FToC {
  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("Please give valid input");
    } else {
      double fahrenheitTemp = Integer.parseInt(args[0]);
      double centigradeTemp = (fahrenheitTemp - 32) * 5/9;
      System.out.println("fahrenheit to centigrade of " + args[0] + " is " + centigradeTemp);
    }
  }
}