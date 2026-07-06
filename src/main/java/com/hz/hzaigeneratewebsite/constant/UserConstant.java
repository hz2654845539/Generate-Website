package com.hz.hzaigeneratewebsite.constant;

/**
 * 用户常量
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin"; //加上了这个注解 必须要登录 否则要抛出异常。只有管理员才能用这个
    
    // endregion
}