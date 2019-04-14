package Done;

import java.util.*;

public class ParityAlternatedDeletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] even = new Integer[N], odd = new Integer[N];
        int evenC = 0, oddC = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            even[i] = odd[i] = -1;
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even[i] = num;
                evenC++;
            }
            else {
                odd[i] = num;
                oddC++;
            }
            sum += num;
        }
        if (evenC == oddC) {
            System.out.print(0);
            System.exit(0);
        }
        Arrays.sort(even, Collections.reverseOrder());
        Arrays.sort(odd, Collections.reverseOrder());
        long result;
        if (evenC > oddC)
            result = solve(even, odd);
        else
            result = solve(odd, even);
        System.out.print(sum - result + "\n");
    }
    public static long solve(Integer[] a, Integer[] b) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (b[i] != -1)
                sum += b[i];
            else
                break;
        }
        return sum;
    }
}
