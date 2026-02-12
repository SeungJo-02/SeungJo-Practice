package tadak;
import java.util.Scanner;
public class Sample2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
