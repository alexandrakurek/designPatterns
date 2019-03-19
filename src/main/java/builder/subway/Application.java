package builder.subway;

public class Application {

  public static void main(String[] args) {
    SubwaySandwich sandwich =
        new SubwaySandwichBuilder()
        .withBunType(BunType.WHOLEMEAL)
        .withMeatType(MeatType.BEAF)
        .withSauce(Sauce.CHILLI)
        .withAddon(Addon.CUCUMBER)
        .withAddon(Addon.OLIVES)
        .withAddon(Addon.PARMEZAN)
        .withAddon(Addon.TOMATO)
        .prepare();
    System.out.println(sandwich);

    SubwaySandwich italian = new SubwaySandwichBuilder()
        .prepareSpicyItalian();
  }
}
