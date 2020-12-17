import java.util.Arrays;
public class Test {
  private static void test(int[] arr) {
    Sorts.insertionSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();
  }
  public static void main(String[] args) {
    int[] bob = {5, 1, 12, -5, 16};
    int[] joe = {2, 3, 4, 5, 1};
    int[] juan = {6, 1, 2, 3, 4, 5};
    test(bob);
    test(joe);
    test(juan);
  }
}
