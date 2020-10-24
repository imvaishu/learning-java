public class LargestNumberInArray {

  public static int getLargestNumberInArray(int[] array) {
    int largestNumber = array[0];
    for (int term = 0; term < array.length; term++) {
      if (largestNumber < array[term]) {
        largestNumber = array[term];
      }
    }
    return largestNumber;
  }

  public static void main(String[] args) {
    int[] array = { 100, 20000, 3 };
    System.out.println(getLargestNumberInArray(array));
  }
}
