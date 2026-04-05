
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        // Custom sorting
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // descending order
            }
        });

        // Build result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result.toString());

        sc.close();
    }
}
