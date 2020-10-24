public class ConcatArray {

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static int[] getConcatenatedArray(int[] firstArray, int[] secondArray) {
    int[] concatenatedArray = new int[firstArray.length + secondArray.length];

    for (int index = 0; index < concatenatedArray.length; index++) {
      concatenatedArray[index] = index < firstArray.length ? firstArray[index] : secondArray[index - firstArray.length];
    }

    return concatenatedArray;
  }

  public static void main(String[] args) {
    int[] firstArray = { 1, 2, 3 };
    int[] secondArray = { 4, 5, 6 };

    printArray(getConcatenatedArray(firstArray, secondArray));
  }
}
