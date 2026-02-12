package tadak2;

public class Sample4 {
    static void main(String[] args) {
        int[] marks = {70,60,55,75,95,90,80,80,85,100};
        int sum = 0;
        double average = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = (double) sum / marks.length;
        System.out.println(average);
    }
}
