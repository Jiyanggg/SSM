package jiyang.dao;

import jiyang.model.User;

/**
 * Created by wind ppt on 2017/4/28.
 */
public interface IUserDao {
    void addUser(User user);
    User selectUser(int userId);
}
