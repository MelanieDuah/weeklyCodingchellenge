import java.util.HashMap;

public class findSubArray {

    public static void contigiousSubArray(int arr[], int n, int sum) {
        int arrsum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arrsum = arrsum + arr[i];
            //check whether cur_sum - sum = 0, if 0 it means
            //the sub array is starting from index 0- so stop
            if (arrsum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            //if hashMap already has the value, means we already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(arrsum - sum)) {
                start = hashMap.get(arrsum - sum) + 1;
                end = i;
                break;
            }

            hashMap.put(arrsum, i);

        }

        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }


    }

    public static void main(String[] args) {

        {
            findSubArray arraysum = new findSubArray();
            int arr[] = {14, 12, 70, 15, 99, 65, 21, 90 };
            int n = arr.length;
            int sum = 97;
            arraysum.contigiousSubArray(arr, n, sum);
        }


    }
}