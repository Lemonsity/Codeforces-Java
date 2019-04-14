package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiverseStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] charA = br.readLine().toCharArray();
            if (charA.length > 26) {
                System.out.print("No\n");
                continue;
            }
            int[] counter = new int[27];
            boolean check = true;
            int total = 0;
            for (char v : charA) {
                counter[v - 'a' + 1]++;
                total++;
                if (counter[v - 'a' + 1] > 1){
                    System.out.print("No\n");
                    check = false;
                    break;
                }
            }
            if (!check)
                continue;
            int sum = 0;
            for (int j = 1; j <= 26; j++) {
                if (counter[j] == 1)
                    sum++;
                if (counter[j] == 0 && counter[j - 1] == 1 && sum != total) {
                    System.out.print("No\n");
                    check = false;
                    break;
                }
            }
            if (!check)
                continue;
            System.out.print("Yes\n");
        }
    }
}
