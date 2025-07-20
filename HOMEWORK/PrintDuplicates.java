public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 3, 2, 5, 9};
        int n = arr.length;
        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing multiple times
                }
            }
        }
    }
}
