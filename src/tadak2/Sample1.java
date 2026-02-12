package tadak2;

public class Sample1 {
    static void main(String[] args) {
        int num = 1, sum = 0;

        while (num <=1000){
            if (num % 3 == 0) {
                sum += num;
                num++;
            }else {
                num++;
                continue;
            }
        }System.out.println(sum);
    }
}
