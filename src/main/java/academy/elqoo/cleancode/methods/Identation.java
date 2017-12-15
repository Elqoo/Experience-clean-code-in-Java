package academy.elqoo.cleancode.methods;

public class Identation {

    public static boolean isABigYellowBanana(String fruit, boolean big, String color){
        return isBanana(fruit) && isBigAndYellow(color, big);
    }

    private static boolean isBigAndYellow(String color, boolean big){
        return color.equals("yellow") && big;
    }

    private static boolean isBanana(String fruit){
        return fruit.equals("banana");
    }


}
