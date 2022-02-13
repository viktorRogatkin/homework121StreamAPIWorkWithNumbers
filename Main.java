package homework12WorkWithNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> result = new ArrayList<>();
        for (int x : input) {
            if (x > 0) {
                if (x % 2 == 0) {
                    result.add(x);
                    continue;
                }
                continue;
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
