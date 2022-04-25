package FizzBuzz_412;

import java.util.LinkedList;
import java.util.List;

public class Solution_412 {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            if (i%15 == 0) list.add("FizzBuzz");
            else if (i%5 == 0) list.add("Buzz");
            else if (i%3 == 0) list.add("Fizz");
            else list.add(Integer.toString(i));
        }
        return list;
    }
}
