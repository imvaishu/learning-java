public class ConcatArray {

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static int[] concatTwoArray(int[] array1, int[] array2) {
    int lengthOfNewArray = array1.length + array2.length;
    int[] newArray = new int[lengthOfNewArray];

    for (int index = 0; index < lengthOfNewArray; index++) {
      newArray[index] =
        index < array1.length ? array1[index] : array2[index - array1.length];
    }

    return newArray;
  }

  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3 };
    int[] array2 = { 4, 5, 6 };

    printArray(concatTwoArray(array1, array2));
  }
}
