package command;

public interface DatabaseOperation {
  boolean execute();
  void rollback();
  boolean wasExecuted();
}
