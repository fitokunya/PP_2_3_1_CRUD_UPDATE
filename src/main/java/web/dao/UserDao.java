package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.List;

@Component
public interface UserDao {


    List<User> showAllUsers();

    User show(long id);

    void add(User user);

    void update(Long id, User updatedUser);

    void delete(long id);
}
