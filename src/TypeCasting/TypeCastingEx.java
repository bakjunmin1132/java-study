package TypeCasting;

public class TypeCastingEx {
    static void main() {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        num = "" + n;
        System.out.println(num);

        num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);

        final int asdf = 10; // 못바꿈
    }
}
