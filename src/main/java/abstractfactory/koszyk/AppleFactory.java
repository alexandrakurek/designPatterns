package abstractfactory.koszyk;

import java.util.Random;

public class AppleFactory implements ProductFactory {

  private static String[] types =
      {"lobo", "starking", "jonagold", "papierówka"};

  @Override
  public Product getProduct() {
    Random random = new Random();
    // cena!!!!!!!
    return new Apple(types[random.nextInt(4)]);
  }
}
