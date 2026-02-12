package tadak;

import java.util.Scanner;
public class Sample {
    static void main(String[] args) {
        int[] score =new int[3];
        String[] subject = {"국어","영어", "수학"};
        int sum = 0;
        double average = 0;

        Scanner input =new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.printf("길동이의 %s 점수 ",subject[i]);
            score[i] = input.nextInt();
            sum += score[i];
        }
        average = (double) sum/ score.length;


        System.out.printf("길동이의 평균 점수 : %s",average);
    }
}
