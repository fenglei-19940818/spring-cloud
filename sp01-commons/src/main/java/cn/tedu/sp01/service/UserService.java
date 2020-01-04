package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/30 10:36
 */
public interface UserService {

    /**
     * 根据用户id,获取用户信息
     *
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 增加用户积分
     *
     * @param id    用户ID
     * @param score 积分
     */
    void addScore(Integer id, Integer score);
}
