package singleton;

public class AdvancedSingletonExample {

  private static AdvancedSingletonExample INSTANCE;

  private AdvancedSingletonExample() {
    if (null != INSTANCE) {
      throw new IllegalStateException();
    }
    // zosobozetna inicjalizacja obiektu
    System.out.println("private singleton contructor");
  }

  public static AdvancedSingletonExample getInstance() {
    if (null == INSTANCE) {
      // lazy loading
      INSTANCE = new AdvancedSingletonExample();
    }
    return INSTANCE;
  }

  @Override
  public AdvancedSingletonExample clone() throws CloneNotSupportedException{
    return getInstance();
  }

  // ochrona przed deserializacja
  protected Object readResolve() {
    return getInstance();
  }
}
