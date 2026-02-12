package tadak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sample9 {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> numb = new HashSet<>(numbers);
        System.out.println(numb);
    }
}
