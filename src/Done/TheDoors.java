package Done;

import java.util.Scanner;

public class TheDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        byte[] doors = new byte[N];
        for (int i = 0; i < N; i++) {
            doors[i] = sc.nextByte();
        }
        byte start = doors[N - 1];
        for (int i = N - 1; i >= 0; i--) {
            if (doors[i] != start) {
                System.out.print(i + 1 + "\n");
                System.exit(0);
            }
        }
    }
}
