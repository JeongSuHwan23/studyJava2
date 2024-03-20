public class java6_20 {

  static int[] shuffle(int[] arr) {
    for (int i = 0; i < 9; i++) {
      int a = (int) (Math.random() * 9);

      int tmp = arr[a];
      arr[a] = arr[i];
      arr[i] = tmp;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] original = {1,2,3,4,5,6,7,8,9};
    System.out.println(java.util.Arrays.toString(original));

    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }
}
