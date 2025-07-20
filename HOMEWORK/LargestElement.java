public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 7, 12, 3};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest element: " + max);
    }
}
