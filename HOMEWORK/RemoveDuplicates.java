public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 8, 7};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
