public class FToC {
  public static double getFToC(double fahrenheitTemp) {
    return (fahrenheitTemp - 32) * 5 / 9;
  }

  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("Please give valid input");
      return;
    }

      double fahrenheitTemp = Integer.parseInt(args[0]);
      
      System.out.println("fahrenheit to centigrade of " + args[0] + " is " + getFToC(fahrenheitTemp));
  }
}