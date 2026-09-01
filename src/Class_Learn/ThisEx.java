package Class_Learn;

public class ThisEx {
    int a;

    void varTest() {
        this.a++;
    }
    static void main() {
        ThisEx thisEx = new ThisEx();
        thisEx.a = 1;
        thisEx.varTest();
        System.out.println(thisEx.a);
    }
}
