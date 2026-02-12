package tadak3;

interface Predator9{
    String bark();
}

class Animal9{
    public String hello(){
        return "hello";
    }
}

class Dog9 extends Animal9 {

}

class Lion9 extends Animal9 implements Predator9{
    public String bark(){
        return "Bark bark";
    }
}

public class Sample9 {
    static void main(String[] args) {
        Animal9 a = new Lion9();
        Lion9 b = new Lion9();
        Predator9 c = new Lion9();

        System.out.println(a.hello());
  //    System.out.println(a.bark);
        System.out.println(b.hello());
        System.out.println(b.bark());
  //    System.out.println(c.hello); // 자료형이 Animal이라면 사용할 수 있는데 Predator라면 Lion의 다른 부모니까 못쓰는거?
        System.out.println(c.bark());
    }
}
