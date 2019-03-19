package command;

public class Application {

  public static UserDao userDao = new UserDao();

  public static void main(String[] args) {
    userDao.save(
        new User("admin", "admin@gmail.com", "1234"),
        1L);
    System.out.println(userDao.get(1L));
    userDao.remove(1L);
    System.out.println(userDao.get(1L));

    DatabaseTransaction transaction = new DatabaseTransaction();
    transaction.addOperation(new SaveUserOperation(
        userDao, new User("user1", "user1@gmial.com", "password"), 1L));
    transaction.addOperation(new SaveUserOperation(
        userDao, new User("user2", "user2@gmial.com", "1234"), 2L));
    transaction.addOperation(new RemoveUserOperation(userDao, 3L));
    transaction.addOperation(new RemoveUserOperation(userDao, 2L));


    transaction.commit();
  }
}
