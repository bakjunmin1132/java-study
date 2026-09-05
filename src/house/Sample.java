package house;

class Counter  {
    static int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}
// 이제 스프링 배우자