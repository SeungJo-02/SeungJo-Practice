package tadak;

import java.util.HashMap;
import java.util.Scanner;

public class Sample10 {
    enum coffeeType {
        Americano,
        Iceamericano,
        Cafelatte
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("커피를 입력하세요: "); // 안내 문구 추가
        String name = input.nextLine();

        HashMap<coffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(coffeeType.Americano, 3000);
        priceMap.put(coffeeType.Iceamericano, 4000);
        priceMap.put(coffeeType.Cafelatte, 5000);

        try {
            // 문자열(name)을 이넘(coffeeType)으로 변환!
            coffeeType type = coffeeType.valueOf(name);//name을 coffeeType enum으로

            // 변환된 이넘으로 가격 조회
            int price = priceMap.get(type);
            System.out.printf("%s 가격은 %d원 입니다.", name, price);

        } catch (IllegalArgumentException e) {
            // 메뉴에 없는 이름을 쳤을 때 예외 처리
            System.out.println("그런 메뉴는 없습니다.");
        } catch (NullPointerException e) {
            System.out.println("가격 정보가 없습니다.");
        }
    }
}