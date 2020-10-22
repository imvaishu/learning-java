public class LCM {
  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give valid input");
    } else {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int large = Math.max(num1,num2);
      int small = Math.min(num1,num2);
      int i = large;
      while(i % small != 0){
        i = i + large;
      }
      System.out.println("LCM is " + i);
    }
  }
}