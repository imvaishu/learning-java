public class RemoveZeros {

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static int getCountOfZeros(int[] array) {
    int count = 0;

    for (int value : array) {
      if (value > 0) {
        count++;
      }
    }

    return count;
  }

  public static int[] removeZeros(int[] array) {
    int[] newArray = new int[getCountOfZeros(array)];

    int count = 0;
    for (int value : array) {
      if (value > 0) {
        newArray[count] = value;
        count++;
      }
    }

    return newArray;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 0, 4, 0, 3 };

    printArray(removeZeros(array));
  }
}
