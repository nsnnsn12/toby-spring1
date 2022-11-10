package user.dao;

//클라이언트에서 사용할 서비스 로직의 오브젝트간 의존관계를 설정하여
//리턴한다.
public class DaoFactory {
    public UserDao userDao(){
        ConnectionMaker connectionMaker = new SimpleConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
}
