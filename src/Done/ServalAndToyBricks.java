package Done;

import java.io.IOException;
import java.util.Scanner;

public class ServalAndToyBricks {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), H = sc.nextInt();
        int[] front = new int[M];
        int[] left = new int[N];
        int[][] map = new int[N][M];
        int[][] finalMap = map.clone();
        for (int i = 0; i < M; i++)
            front[i] = sc.nextInt();
        for (int i = 0; i < N; i++)
            left[i] = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (left[i] == front[j] && map[i][j] == 1)
                    finalMap[i][j] = left[i];
                else if (map[i][j] == 1)
                    finalMap[i][j] = Math.min(left[i], front[j]);
            }
        }
        for (int[] row : finalMap) {
            for (int v : row)
                System.out.print(v + " ");
            System.out.print("\n");
        }
    }
}
