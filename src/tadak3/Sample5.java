package tadak3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample5 {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> b = new ArrayList<>(a);
        a.add(4);
        System.out.println(b.size());
        System.out.println(a==b);

    }
}
