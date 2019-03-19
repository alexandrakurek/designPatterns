package abstractfactory.schema;


public class ClassA implements AbstractClass {

  private String field;

  public ClassA(String field) {
    this.field = field;
  }

  @Override
  public void doSomething() {
    System.out.println(field);
  }
}
