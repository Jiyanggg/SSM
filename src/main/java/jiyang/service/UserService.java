package jiyang.service;

import jiyang.dao.IUserDao;
import jiyang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by wind ppt on 2017/4/28.
 */
@Service("userService")
public class UserService {
    @Resource
    private IUserDao userDao;

    public void addUser(User user){
        userDao.addUser(user);
    }
    public User selectUser(int userId){
        return userDao.selectUser(userId);
    }
}
