import java.util.Scanner;

class ReverselyPrint {
    public static void main(String[] args) {
        int[] numbers = readArray();
        reversePrint(numbers);
    }

    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int numInt = sc.nextInt();
        int[] values = new int[numInt];
        System.out.print("Enter the " + numInt + " integers: ");
        for(int i = 0; i < numInt; i++) {
            values[i] = sc.nextInt();
        }
        sc.close();
        return values;
    }

    public static void reversePrint(int[] arr) {
        // changed the normal implementation from only printing to actually computing the resulting reversed array (for modifiability purposes).

        int[] reversedArr = new int[arr.length];
        for(int i = arr.length - 1; i > -1; i--) {
            reversedArr[arr.length - i - 1] = arr[i];
        }
        System.out.print(reversedArr.toString());
    }
}
