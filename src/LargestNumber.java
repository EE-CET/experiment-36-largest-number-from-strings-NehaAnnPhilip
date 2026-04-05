


import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        String result = "";
        for (int i = 0; i < N; i++) {
            result += arr[i];
        }

        System.out.println(result);

        sc.close();
    }
}
