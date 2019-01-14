import java.util.*;


public class pushZeroes {
  public static void main(String args[]) {
    int[] ints = {0,1,2,3,4,5,6,0};
    int[] returnThis = new int[ints.length];
    int nums = 0;
    int zeros = ints.length;
    for (int i = 0; i < returnThis.length; i++) {
      if (ints[i] == 0) {
        zeros--;
        returnThis[zeros] = 0;
      } else {
        returnThis[nums] = ints[i];
        nums++;
      }
    }
    System.out.println(Arrays.toString(returnThis));
  }
}
