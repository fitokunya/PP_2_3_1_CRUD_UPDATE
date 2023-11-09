package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import javax.validation.Valid;
import java.util.List;

@Service
@EnableTransactionManagement(proxyTargetClass = true)
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> index() {
        return userDao.index();
    }

    @Override
    @Transactional
    public User show(long id) {
        return userDao.show(id);
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void update(Long id, @Valid User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userDao.delete(id);
    }
}
