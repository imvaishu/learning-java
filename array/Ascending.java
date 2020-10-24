public class Ascending {

  public static boolean isAscending(int[] array) {
    for (int term = 0; term < array.length - 1; term++) {
      if (array[term] > array[term + 1]) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    int[] array = { 10, 22, 33, 222, 423, 543, 7334 };

    System.out.println(isAscending(array));
  }
}
