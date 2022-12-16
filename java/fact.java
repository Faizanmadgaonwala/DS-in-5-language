import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find the fact of a num");
        int num = sc.nextInt();

        System.out.println("the fact of " + num + " is " + fact(num));

    }

    public static int fact(int num) {
        int res = 1, i;
        for (i = 2; i <= num; i++) {

            res = res * i;

        }
        return res;
    }
}
