public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int[] sub = new int[arr.length];
        sub[0] = arr[0];
        sub[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            sub[i] = Math.max(sub[i - 1], arr[i] + sub[i - 2]);
        }
    }
}
