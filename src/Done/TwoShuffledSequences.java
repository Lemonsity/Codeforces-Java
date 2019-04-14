package Done;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoShuffledSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] counter = new int[200005];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            counter[num]++;
            if (counter[num] > 2) {
                System.out.print("NO\n");
                System.exit(0);
            }
        }
        ArrayList<Integer> aList = new ArrayList<>(), bList = new ArrayList<>();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                if (counter[i] == 1)
                    aList.add(i);
                else {
                    aList.add(i);
                    bList.add(i);
                }
            }
        }
        Object[] a = aList.toArray();
        Object[] b = bList.toArray();
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        System.out.print("YES\n");
        System.out.print(a.length + "\n");
        for (int i = 0; i < a.length; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(a[i]);
        }
        if (a.length == 0)
            System.out.print("\n");
        System.out.print("\n");
        System.out.print(b.length + "\n");
        for (int i = 0; i < b.length; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(b[i]);
        }
        if (b.length == 0)
            System.out.print("\n");
        System.out.print("\n");
    }

}
