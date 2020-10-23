public class MultiplicationTable {
  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give valid input");
      return;
    } 
      int from = Integer.parseInt(args[0]);
      int to = Integer.parseInt(args[1]);

      for (int count = 1; count <= to ;count++){
        int multiplication = from * count;

        System.out.println(from + " * " + count + " = " + multiplication);
      }
  }
}