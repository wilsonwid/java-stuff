class BinarySearch {
    public static void main(String[] args) {
        int[] a = {-4, 3, 6, 9, 10, 23, 53, 55, 104};
        System.out.println(binarySearch(a, 6));
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high)/2;

            if(arr[mid] == key) {
                return mid;
            } else if(key > arr[mid]) {
                low = mid + 1;
            } else if(key < arr[mid]) {
                high = mid - 1;
            }
        }

        return -1;

    }
}