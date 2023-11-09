package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.List;

@Component
public interface UserDao {


    public List<User> index();

    public User show(long id);

    public void add(User user);

    public void update(Long id, User updatedUser);

    public void delete(long id);
}
