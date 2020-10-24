public class Average {

  public static double getAverage(int[] numbers) {
    int sum = 0;

    for (int term : numbers) {
      sum += term;
    }

    return sum / (double) numbers.length;
  }

  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40 };

    System.out.println(getAverage(numbers));
  }
}
