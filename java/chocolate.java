import java.util.*;

public class chocolate {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        System.out.println(mindiff(arr, 3));
    }

    public static int mindiff(int arr[], int m) {
        Arrays.sort(arr);
        int dis = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < arr.length; i++) {
            dis = Math.min(arr[i + m - 1] - arr[i], dis);
            i++;

        }

        return dis;
    }
}