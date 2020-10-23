public class GCD {
  public static void main(String[] args) {
    
    if(args.length < 2){
      System.out.println("Please give valid input");
      return;
    } 

      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int gcd = num1;
     
      int greatest = Math.max(num1, num2);
      num1 = greatest;
      num2 = gcd;

      while(num2 != 0){
        gcd = num2;
        num2 = num1 % num2;
        num1 = gcd;
      }
      System.out.println("GCD is " + gcd);
  }
}