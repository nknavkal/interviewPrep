import java.util.*;


public class dutchNatFlag {
  public static void swap(int[] arr, int i1, int i2) {
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }
  public static int[] dutch(int[] arr, int index) {
    //int[] ret = arr;
    int k = arr[index];
    int less = -1;
    int equal = -1;
    int more = arr.length;
    while (equal+1 < more) {
      if (arr[equal+1] > k) {
        swap(arr, equal+1, more - 1);
        more--;
      } else if (arr[equal+1] == k){
        //swap(arr, i, equal + 1);
        equal++;
      } else {
        swap(arr, equal+1, less + 1);
        //swap(arr, equal + 1, less + 1);
        equal++;
        less++;
      }
    }
    return arr;
  }
  public static void main (String[] args) {
    int[] a = new int[]{1,3,3,2,6,2,7,4,2,1,2,2,1,3,3,3,2,4,2,3,5,1,99,4};
    System.out.println(Arrays.toString(dutch(a, 2)));
  }

}
