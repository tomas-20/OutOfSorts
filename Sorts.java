import java.util.Arrays;
public class Sorts {
  public static void bubbleSort(int[] data) {
    boolean changed = true;
    for (int i = data.length - 1; i >= 0 && changed; i --) {
      System.out.println(Arrays.toString(data));
      changed = false;
      for (int j = 0; j < i; j ++) {
        int j2 = j + 1;
        int current = data[j];
        int next = data[j2];
        if (current > next) {
          changed = true;
          data[j] = next;
          data[j2] = current;
        }
      }
    }
  }
}
