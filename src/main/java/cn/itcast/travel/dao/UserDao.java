package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * 用户Dao
 * @author 尚郑
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User findByUserName(String username);

    /**
     * 用户保存
     * @param user
     */
    public void save(User user);

    /**
     * 按照激活码查找用户
     * @param code
     * @return
     */
    User findByCode(String code);

    /**
     * 修改 User 激活码状态
     * @param user
     */
    void updateStatus(User user);

    /**
     * 根据登录名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    User findByUserNameAndPassword(String username, String password);
}
