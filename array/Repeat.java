public class Repeat {

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static int[] range(int numOfTimes, int term) {
    int[] series = new int[numOfTimes];

    for (int index = 0; index < numOfTimes; index++) {
      series[index] = term;
    }

    return series;
  }

  public static void main(String[] args) {
    printArray(range(5, 2));
  }
}
