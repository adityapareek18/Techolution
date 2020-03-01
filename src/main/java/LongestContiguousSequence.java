public class LongestContiguousSequence {

    public static void main(String[] args) {
        char arr[] = {'a', 'a', 'b', 'c', 'a', 'b', 'b', 'b','c', 'c', 'c', 'a', 'a', 'a', 'a', 'c', 'c', 'c', 'b', 'b'};
        System.out.println(getLongestContiguousSequence(arr));
    }

    private static int getLongestContiguousSequence(char arr[]) {
        int result = 0;
        int length = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                length++;
                if(length > result)
                    result = length;
            } else {
                //result = length;
                length = 1;
            }
        }
        return result;
    }
}
