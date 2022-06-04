import user.dao.UserDao;
import user.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("sunggyu");
        user.setName("노성규");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId()+" 등록 성공");

        User user1 = dao.get(user.getId());
        System.out.println("user1.getId = " + user1.getId());
        System.out.println("user1.getPassword = " + user1.getPassword());

    }
}
