package abstractfactory.schema;

public class FactoryB implements AbstractFactory {

  @Override
  public AbstractClass create() {
    return new ClassB("object B");
  }
}
