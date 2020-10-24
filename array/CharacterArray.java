public class CharacterArray {

  public static boolean isTwoCharacterArrayEqual(char[] firstArray, char[] secondArray) {
    if (firstArray.length != secondArray.length) {
      return false;
    }

    for (int index = 0; index < firstArray.length; index++) {
      if (firstArray[index] != secondArray[index]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    char[] firstArray = { 'a', 'b', 'c' };
    char[] secondArray = { 'a', 'b', 'd' };

    System.out.println(isTwoCharacterArrayEqual(firstArray, secondArray));
  }
}
