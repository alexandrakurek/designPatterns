package command;

public interface DataBasedOperation {

    boolean execute();
    void rollback ();
    boolean wasExecuted();

}
