
import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 7, 9, 3, 5 };
        System.out.println(duplicates(arr));

    }

    public static boolean duplicates(int arr[]) {
        Arrays.sort(arr);
        System.out.println("The storted array is " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("the duplicate element is " + arr[i]);
                return true;
            }

        }
        return false;
    }
}
