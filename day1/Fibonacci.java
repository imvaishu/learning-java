public class Fibonacci{
  public static void main(String[] args){
    int firstTerm = 0;
    int secondTerm = 1;
    int sum;
    if(args.length < 1){
      System.out.println("Please give valid limit");
    } else {
    int limit = Integer.parseInt(args[0]);
    for(int i = 1; i <= limit ; i++ ){
      System.out.println(firstTerm);
      sum = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = sum;
      }
    }
  }
}