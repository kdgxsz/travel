package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * 用户service
 * @author 尚郑
 */
public interface UserService {

    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    /**
     * 激活用户
     * @param code
     * @return
     */
    boolean active(String code);

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);
}
