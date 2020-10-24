public class Average {

  public static int getAverage(int[] array) {
    int sum = 0;
    for (int term = 0; term < array.length; term++) {
      sum += array[term];
    }
    return sum / array.length;
  }

  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40 };
    System.out.println(getAverage(array));
  }
}
