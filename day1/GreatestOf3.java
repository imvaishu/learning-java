public class GreatestOf3{
 public static void main(String[] args) {
  if(args.length < 3){
    System.out.println("Please give 3 numbers");
    return;
  } 

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    
    int greatestOf2 = Math.max(num1,num2);
    int result = Math.max(greatestOf2,num3);
    System.out.println("Greatest of three is " + result);
  }
}