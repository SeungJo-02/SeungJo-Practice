package house;

class Singleton{
    private static Singleton one;

    public static Singleton getInstance(){
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}

public class Sample2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);

    }
}
