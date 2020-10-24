public class Ascending {

  public static boolean isAscending(int[] array) {
    boolean isAscending = true;

    for (int index = 0; index < array.length - 1; index++) {
      if (array[index] > array[index + 1]) {
        isAscending = false;
      }
    }

    return isAscending;
  }

  public static void main(String[] args) {
    int[] array = { 10, 22, 33, 222, 423, 543, 7334 };
    System.out.println(isAscending(array));
  }
}
