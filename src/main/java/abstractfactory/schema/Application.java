package abstractfactory.schema;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String... args) {
    List<AbstractFactory> factories = new ArrayList<>();
    factories.add(new FactoryA());
    factories.add(new FactoryB());
    factories.add(new FactoryB());
    factories.add(new FactoryB());

    method(factories);
  }

  private static void method(List<AbstractFactory> factories) {
    for (AbstractFactory factory : factories) {
      AbstractClass object = factory.create();
      object.doSomething();
    }
  }
}
