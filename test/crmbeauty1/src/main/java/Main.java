import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.itpark.dao.UserJdbcTemplateDaoImpl;
import ru.itpark.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .age(1)
                .mobilePhone("927445466666")
                .name("Gosha543")
                .surname("Goshin543")
                .id(1)
                .build();

//       // UserJdbcTemplateDaoImpl userJdbcTemplateDao = new UserJdbcTemplateDaoImpl();
//        userJdbcTemplateDao.update(user);
//        //System.out.println(userJdbcTemplateDao.findAll());
//        List<User> userList = userJdbcTemplateDao.findAll();
//        userJdbcTemplateDao.showList(userList);









    }
}
