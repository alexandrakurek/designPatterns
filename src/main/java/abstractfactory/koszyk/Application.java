package abstractfactory.koszyk;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    List<ProductFactory> productFactories = new ArrayList<>();

    productFactories.add(new AppleFactory());
    productFactories.add(new BookFactory());

    for (ProductFactory factory : productFactories) {
      for (int i = 0; i < 3; i++) {
        factory.getProduct();
        System.out.println(factory.getProduct().getSummary());
      }
    }
  }
}
