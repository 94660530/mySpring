package day4.Service;

import day4.Dao.UserDao;

/**
 * @author xys
 * @Classname UserService
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/16 23:24
 */
public class UserService {

    private String id;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(id));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
