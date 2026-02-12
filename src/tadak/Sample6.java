package tadak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample6 {
    static void main(String[] args) {
        String[] data = {"1","3","5","4","2"};// 배열 타입이랑 맞추기
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        list.sort(Comparator.reverseOrder());// sort 하고 출력하기
        System.out.println(list);
    }
}
