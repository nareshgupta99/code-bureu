public class FindLargestAndSecondLargest {

    public static int[] getSecondOrderElements(int n, int[] arr) {
        int ans[] = new int[2];
        ans[0] = secondLargest(arr, n);
        ans[1] = secondMinimum(arr, n);
        return ans;
    }

    public static int secondLargest(int[] arr, int n) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            if (arr[i] > slargest && arr[i] < largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int secondMinimum(int[] arr, int n) {
        int minimum = arr[0];
        int sminimum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minimum) {
                sminimum = minimum;
                minimum = arr[i];
            }
            if (arr[i] < sminimum && arr[i] > minimum) {
                sminimum = arr[i];
            }
        }
        return sminimum;
    }

}
