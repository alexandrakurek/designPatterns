package abstractfactory.schema;

public class FactoryA implements AbstractFactory {

  @Override
  public AbstractClass create() {
    return new ClassA("object A");
  }
}
