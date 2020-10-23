public class CToF {
  public static double getCToF(double centigradeTemp) {
    return  1.8 * centigradeTemp + 32;
  }

  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("Please give valid input");
      return;
    } 

      double centigradeTemp = Integer.parseInt(args[0]);
     
      System.out.println("centigrade to fahrenheit of " + args[0] + " is " + getCToF(centigradeTemp));
  }
}