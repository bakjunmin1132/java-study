package Learn_Interface;

interface Predator {
    String getFood(); // 메서드에 입출력이 없는 이유는 인터페이스는 규칙이기 때문

    default void printFood() { // 디폴트 메서드
        System.out.println("my food is "+getFood());
    }
}

interface Barkable {
    void bark();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

}

class Tiger extends Animal implements Predator, Barkable { // 나는 동물 자료형을 가지면서 포식자로도 취급할 수 있다
    public String getFood() { // 인터페이스의 메서드는 항상 public으로 구현해야 한다
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class Zookeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("여흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        }
    }
}

public class InterFace {
    static void main() {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
        tiger.printFood();
        lion.printFood();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
