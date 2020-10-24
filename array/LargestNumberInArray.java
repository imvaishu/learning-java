public class LargestNumberInArray {

  public static int getLargestNumberInArray(int[] numbers) {
    int largestNumber = numbers[0];

    for (int term : numbers) {
      if (largestNumber < term) {
        largestNumber = term;
      }
    }

    return largestNumber;
  }

  public static void main(String[] args) {
    int[] numbers = { 100, 20000, 3 };

    System.out.println(getLargestNumberInArray(numbers));
  }
}
