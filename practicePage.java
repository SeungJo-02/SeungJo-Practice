abstract class Predator extends Animal{
    abstract String getFood();//인터패이스의 메소드는 항상 public으로 작성하기
    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable{
    void bark();
}


class Animal {
    String name;// 클래스에 선언된 변수 == 객체 변수

    void setName(String name){
        this.name = name;
    }
}

class Tiger extends Predator  implements Barkable {
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥");
    }
}

class Lion extends Predator  implements Barkable {
    public String getFood(){
        return "banana";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}

class ZooKeeper{
    void feed(Predator predator){
        System.out.println(predator.getFood());
        predator.printFood();
    }
}

class Bouncer{
    void barkAnimal(Barkable animal){
      animal.bark();
    }
}


public class practicePage {
    static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}

