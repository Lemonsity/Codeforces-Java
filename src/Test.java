import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Integer[] stuff = new Integer[10];
        stuff[0] = 10;
        Arrays.sort(stuff, Collections.reverseOrder());
        for (Integer v : stuff)
            System.out.print(v + "\n");
    }
}
