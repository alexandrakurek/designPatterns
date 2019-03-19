package zadanieDecorator;

public class Application {
    public static void main(String[] arg) {

        MealSet set = new BasicSet();
        set = new LargeDrinkDecorator(set);
        System.out.println(set.getParts());
        System.out.println(set.getPrice());
    }
}