package Inheritance;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog {
    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }

    void sleepTogether() {
        super.sleep(); // 오버라이딩 전 구버전 부모 메서드 호출
        System.out.println("and " + this.name + " zzz in house");
    }

}

public class InheritanceEx {
    static void main() {
        HouseDog housedog = new HouseDog();
        housedog.setName("happy");
        housedog.sleep();
        housedog.sleepTogether();
    }
}