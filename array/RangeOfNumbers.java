public class RangeOfNumbers {

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static int[] getRangeOfNumbers(int from, int to, int step) {
    int countOfTerms = ((to - from) / step) + 1;
    int[] range = new int[countOfTerms];

    for (int index = 0; index < countOfTerms; index++) {
      range[index] = from + (step * index);
    }
    return range;
  }

  public static int[] getRangeOfNumbers(int from, int to) {
    return getRangeOfNumbers(from, to, 1);
  }

  public static void main(String[] args) {
    printArray(getRangeOfNumbers(10, 22));
  }
}
