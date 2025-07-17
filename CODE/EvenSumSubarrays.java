public class EvenSumSubarrays {
    public static int countEvenSumSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int start = 0; start < n; start++) {
            if (arr[start] % 2 == 0) continue; 
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Example
        System.out.println(countEvenSumSubarrays(arr)); 
    }
}
