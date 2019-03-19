package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Application {

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    SingletonExample.INSTANCE.method();

    AdvancedSingletonExample.getInstance();
    Constructor<AdvancedSingletonExample> constructor =
        AdvancedSingletonExample.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    //constructor.newInstance();

    Logger.INSTANCE.log("new log message");
  }
}
