package OnHold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Nirvana {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charA = br.readLine().toCharArray();
        int[] originalD = new int[charA.length];
        for (int i = 0; i < originalD.length; i++)
            originalD[i] = charA[i] - '0';

    }
}
