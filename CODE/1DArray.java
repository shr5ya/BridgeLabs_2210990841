public class ArrayFromLoop {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i * i;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
