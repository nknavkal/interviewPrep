public class pushZeroes {
  public static void main(String args[]) {
    public Array zeroes(int[] ints) {
      returnThis = new int[ints.length()];
      nums = 0
      zeros = ints.length()
      for (int i = 0; i < returnThis.length(); i++) {
        if (ints[i] == 0) {
          returnThis[zeros--] = 0;
        } else {
          returnThis[nums] = ints[i];
          nums++;
        }
      }
    }
    return returnThis;
  }
}
