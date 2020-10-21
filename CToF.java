public class CToF {
  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("Please give valid input");
    } else {
      double centigradeTemp = Integer.parseInt(args[0]);
      double fahrenheitTemp = 1.8 * centigradeTemp + 32;
      System.out.println("centigrade to fahrenheit of " + args[0] + " is " + fahrenheitTemp);
    }
  }
}