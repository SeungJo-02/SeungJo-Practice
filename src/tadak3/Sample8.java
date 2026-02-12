package tadak3;

interface Predator{

}

class Animal{
}

class Dog extends Animal{

}

class Lion extends Animal implements Predator{

}


public class Sample8 {
    static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Lion();
    //  Dog d = new Animal(); #Animal이 부모니깐!
        Animal e = new Lion();
    }
}
