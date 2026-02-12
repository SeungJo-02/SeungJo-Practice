package house.person;

import house.HousePark;

public class SeungJoKim extends HousePark {
    public static void main(String[] args) {
        SeungJoKim jojo = new SeungJoKim();
        System.out.println(jojo.lastname);
        HousePark park = new HousePark();
        System.out.println(park.info);
    }
}
