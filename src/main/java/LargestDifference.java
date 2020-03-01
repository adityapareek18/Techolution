public class LargestDifference {
    public static void main(String[] args) {
        int[] arr = {10, 11, 5, 6, 8, 9, 4, 3, 15, 6, 4, 5, 1, 0, 4, 7};
        System.out.println(maxDiff(arr));
    }

    private static int maxDiff(int arr[]) {
        int max = 0;
        int diff = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (max - arr[i] > diff)
                diff = max - arr[i];
        }
        return diff;
    }
}
