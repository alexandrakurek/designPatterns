package command;

import lombok.AllArgsConstructor;

public class SaveUserOperation implements DatabaseOperation {

  private UserDao userDao;
  private User user;
  private Long id;
  private boolean executed = false;

  public SaveUserOperation(UserDao userDao, User user, Long id) {
    this.userDao = userDao;
    this.user = user;
    this.id = id;
  }

  @Override
  public boolean execute() {
    executed = userDao.save(user, id);
    return executed;
  }

  @Override
  public void rollback() {
    userDao.remove(id);
  }

  @Override
  public boolean wasExecuted() {
    return executed;
  }
}
