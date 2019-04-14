package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logging {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] times = new String[N];
        for  (int i = 0; i < N; i++)
            times[i] = br.readLine().substring(0, 13);
        int c1 = 1;
        int c2 = 1;
        String prev = times[0];
        for (int i = 1; i < N; i++) {
            if (times[i].equals(prev)) {
                if (c2 == 10) {
                    c2 = 1;
                    c1++;
                }
                else
                    c2++;
            }
            else {
                c2 = 1;
                if (!A_Before_B(prev, times[i])) {
                    c1++;
                }
            }
            prev = times[i];
        }
        System.out.print(c1 + "\n");
    }
    public static boolean A_Before_B(String a, String b) {
        if (!a.substring(7, 11).equals(b.substring(7, 11)))
            return a.substring(7, 11).equals("a.m.") && b.substring(7, 11).equals("p.m.");
        if (!a.substring(1, 3).equals(b.substring(1, 3))) {
            if (Integer.parseInt(a.substring(1, 3)) == 12)
                return true;
            else if (Integer.parseInt(b.substring(1, 3)) == 12)
                return false;
            return Integer.parseInt(a.substring(1, 3)) < Integer.parseInt(b.substring(1, 3));
        }
        return Integer.parseInt(a.substring(4, 6)) < Integer.parseInt(b.substring(4, 6));
    }
}
