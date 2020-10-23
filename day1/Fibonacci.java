public class Fibonacci{
  public static void displayFibonacci(int limit) {
    int firstTerm = 0;
    int secondTerm = 1;
    int sum;

    for(int i = 1; i <= limit ; i++ ){
      System.out.println(firstTerm);
      sum = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = sum;
    }
  }

  public static void main(String[] args){
    if(args.length < 1){
      System.out.println("Please give valid input");
      return;
    } 
   
    int limit = Integer.parseInt(args[0]);
    displayFibonacci(limit);
  }
}