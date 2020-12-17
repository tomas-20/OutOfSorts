import java.util.Arrays;
public class Sorts {
  public static void bubbleSort(int[] data) {
    boolean changed = true;
    for (int i = data.length - 1; i >= 0 && changed; i --) {
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
  public static void selectionSort(int[] data) {
    int length = data.length;
    for (int i = 0; i < length; i ++) {
      int first = data[i];
      int minPlace = i;
      int min = first;
      for (int j = i + 1; j < length; j ++) {
        if (data[j] < min) {
          minPlace = j;
          min = data[j];
        }
      }
      data[minPlace] = first;
      data[i] = min;
    }
  }
  public static void insertionSort(int[] data) {
    int length = data.length;
    for (int i = 0; i < length; i ++) {
      int current = data[i];
      int newPlace = i;
      while (newPlace > 0 && data[newPlace - 1] > current) {
        newPlace --;
      }
      for (int j = newPlace; j <= i; j ++) {
        int temp = data[j];
        data[j] = current;
        current = temp;
      }
    }
  }
}
