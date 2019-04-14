package Done;

import java.io.IOException;
import java.util.Scanner;

public class NastyaIsReadingABook {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] chapters = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            sc.nextLong();
            chapters[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        for (int i = 1; i < chapters.length; i++) {
            if (k > chapters[i - 1] && k <= chapters[i]) {
                System.out.print(N - i + 1);
                System.exit(0);
            }
        }
    }
}
