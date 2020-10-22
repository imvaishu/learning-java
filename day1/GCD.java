public class GCD {
  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give valid input");
    } 
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int reminder = num1;
      if(num2 > num1){
        num1 = num2;
        num2 = reminder;
      }
      while(num2 != 0){
        reminder = num2;
        num2 = num1 % num2;
        num1 = reminder;
      }
      System.out.println("GCD is " + reminder);
  }
}