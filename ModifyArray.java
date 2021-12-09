import java.util.Arrays;

class ModifyArray {
    public static void main(String[] args) {
        int[] foo = {5, 3, 7, 1, -4};
        doubleArray(foo);

        System.out.println(Arrays.toString(foo));
    }

    public static void doubleArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}