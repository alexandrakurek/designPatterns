package abstractfactory.schema;


public class ClassB implements AbstractClass {

  private String field;

  public ClassB(String field) {
    this.field = field;
  }

  @Override
  public void doSomething() {
    System.out.println(field);
  }
}
