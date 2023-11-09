package web.service;

import org.springframework.stereotype.Service;
import web.models.User;

import java.util.List;

@Service
public interface UserService {
    List<User> index();

    User show(long id);

    void add(User user);

    void delete(long id);

    void update(Long id, User user);
}
