import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 7, 9, 3 };

        // 1st method using another array of same size
        int arr1[] = { 2, 10, 15, 20, 25 };
        System.out.println(arr.length);
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr1[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        // 2nd method using same array
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
