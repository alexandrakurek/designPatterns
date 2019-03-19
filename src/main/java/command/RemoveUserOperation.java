package command;

public class RemoveUserOperation implements DatabaseOperation {

  private UserDao userDao;
  private Long id;
  private User user;
  private boolean executed = false;

  public RemoveUserOperation(UserDao userDao, Long id) {
    this.userDao = userDao;
    this.id = id;
  }

  @Override
  public boolean execute() {
    user = userDao.get(id);
    executed = userDao.remove(id);
    return executed;
  }

  @Override
  public void rollback() {
    userDao.save(user, id);
  }

  @Override
  public boolean wasExecuted() {
    return executed;
  }


}
