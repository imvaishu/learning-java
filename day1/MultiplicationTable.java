public class MultiplicationTable {
  public static void displayMulTable(int from, int to) {
    for (int term = 1; term <= to ;term++){
      System.out.println(from + " * " + term + " = " + (from * to));
    }
  }

  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give valid input");
      return;
    } 

      int from = Integer.parseInt(args[0]);
      int to = Integer.parseInt(args[1]);

      displayMulTable(from, to);
  }
}