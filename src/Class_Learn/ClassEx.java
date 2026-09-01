package Class_Learn;

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class ClassEx {
    static void main() {
        Animal cat = new Animal();
        cat.setName("bobby");

        Animal dog = new Animal();
        dog.setName("happy");
        System.out.printf("%s\n%s\n", cat.name, dog.name);
    }
}
