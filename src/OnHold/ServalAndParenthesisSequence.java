package OnHold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ServalAndParenthesisSequence {
    private static int[] left, right;
    private static ArrayList<Integer> rightIndex = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N % 2 == 1)
            fail();

    }
    private static void fail() {
        System.out.print(":(\n");
        System.exit(0);
    }
}
