package house;

public class Sample3 {
    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample3 sample = new Sample3();
        int c;
        try{
            c = 4/0;
            sample.shouldBeRun();
        } catch (ArithmeticException e){
            c = -1;
        } finally {
            sample.shouldBeRun();
        }
    }
}
