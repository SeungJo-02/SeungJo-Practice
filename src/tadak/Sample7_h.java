package tadak;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample7_h {
    static void main(String[] args) {
        String[] data = {"Life", "is", "too", "short"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        String result = String.join(" ", list);
        System.out.println(result);
    }
}
