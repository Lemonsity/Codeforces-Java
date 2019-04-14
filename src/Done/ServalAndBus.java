package Done;

import java.util.Scanner;

public class ServalAndBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt();
        int[] first = new int[N + 1];
        int firstTime = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int start = sc.nextInt();
            int interval = sc.nextInt();
            int t;
            if (T <= start)
                t = start;
            else if ((T - start) % interval == 0)
                t = T;
            else
                t = ((T - start) / interval + 1) * interval + start;
            if (t < firstTime) {
                firstTime = t;
                result = i;
            }
        }
        System.out.print(result);
    }
}
