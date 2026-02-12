package tadak3;

class Calculator3{
    boolean isOdd(int num){
        return num % 2 ==1;
    }
}

public class Sample3 {
    static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
    }
}
