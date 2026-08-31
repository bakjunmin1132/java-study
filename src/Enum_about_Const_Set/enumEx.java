package Enum_about_Const_Set;

public class enumEx {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    static void main() {
//        System.out.println(CoffeeType.AMERICANO);
//        System.out.println(CoffeeType.ICE_AMERICANO);
//        System.out.println(CoffeeType.CAFE_LATTE);

        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
