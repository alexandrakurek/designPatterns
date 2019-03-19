package command;


/*public class RemovedUserOperation implements DataBasedOperation {
    private UserDao userDao;
    private Long id;
    private User user;
    private boolean executed = false;

    public RemovedUserOperation(UserDao userDao, Long id) {
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
    public void rollback(){
        userDao.save(user,id);
    }


}
*/