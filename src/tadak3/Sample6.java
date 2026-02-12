package tadak3;

class Calculator6{
    Integer value;

    Calculator6(){
        this.value = 0;
    }

    void add(int val){
        this.value += val;
    }

    Integer getValue(){
        return this.value;
    }
}

public class Sample6 {
    static void main(String[] args) {
        Calculator6 cal = new Calculator6();
        cal.add(3);
        System.out.println(cal.getValue());

        Calculator6 cal2 = new Calculator6();
        cal2.add(4);
        System.out.println(cal2.getValue());


    }
}
