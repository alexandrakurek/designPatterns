package builder.subway;

import java.util.HashSet;
import java.util.Set;

public class SubwaySandwichBuilder {

  private SubwaySandwich sandwich;

  public SubwaySandwichBuilder() {
    sandwich = new SubwaySandwich();

    sandwich.setAddons(new HashSet<>());
    sandwich.setBunType(BunType.STANDARD);
    sandwich.setMeatType(MeatType.HAM);
    sandwich.setSauce(Sauce.NONE);
  }

  public SubwaySandwichBuilder withBunType(BunType type) {
    sandwich.setBunType(type);
    return this;
  }

  public SubwaySandwichBuilder withAddon(Addon addon) {
    sandwich.getAddons().add(addon);
    return this;
  }

  public SubwaySandwichBuilder withAddons(Set<Addon> addons) {
//    sandwich.getAddons().addAll(addons);
    sandwich.setAddons(addons);
    return this;
  }

  public SubwaySandwichBuilder withMeatType(MeatType type) {
    sandwich.setMeatType(type);
    return this;
  }

  public SubwaySandwichBuilder withSauce(Sauce sauce) {
    sandwich.setSauce(sauce);
    return this;
  }

  public SubwaySandwich prepare() {
    return sandwich;
  }

  public SubwaySandwichBuilder withWholemealBun() {
//    sandwich.setBunType(BunType.WHOLEMEAL);
//    return this;
    return withBunType(BunType.WHOLEMEAL);
  }

  public SubwaySandwichBuilder withBeaf() {
    return withMeatType(MeatType.BEAF);
  }

  public SubwaySandwich prepareSpicyItalian() {
    return withMeatType(MeatType.SALAMI)
        .withBunType(BunType.WHOLEMEAL)
        .withAddon(Addon.OLIVES)
        .withAddon(Addon.ONION)
        .prepare();
  }
}
