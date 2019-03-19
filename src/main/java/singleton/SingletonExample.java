package singleton;

public class SingletonExample {
// tworzymy jedną instancję i prywatny konstruktor
  public static final SingletonExample INSTANCE =
      new SingletonExample();

  private SingletonExample() {
  }

  public void method() {
    System.out.println("Singleton example");
  }
}
