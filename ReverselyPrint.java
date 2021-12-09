import java.util.*;

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

    public static int getElement(int[] arrInt, int index) {
        return arrInt[index];
    }

    public static void reversePrint(int[] arr) {

        // changed the normal implementation from only printing to actually computing the resulting reversed array (for modifiability purposes).

        // normal implementation
        /*
        for(int i = arr.length - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        */


        // array-forming implementation
        
        int[] reversedArr = new int[arr.length];
        int j = arr.length;
        for(int i = 0; i < arr.length; i++) {
            reversedArr[j - 1] = arr[i];
            j--;
        }

        int i = 0;
        while(i < reversedArr.length) {
            System.out.print(reversedArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
