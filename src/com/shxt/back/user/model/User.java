/**
 * User.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2019-06-04 14:09:20
 **/
package com.shxt.back.user.model;

/**
 * user 类
 * @Description : 
 * 
 * @author 胖先生
 * @version 1.0 
 * 文件创建于: 2019-06-04 14:09:20
 **/
public class User {

    private Integer user_id;
    private String user_name;
    private String account;
    private String password;
    private Integer status;
    private Integer fk_role_id;
    private String user_img;
    public String getUser_img() {
		return user_img;
	}

	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}

	/**
     * 获取  字段:user.user_id
     *
     * @return  user.user_id
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 设置  字段:user.user_id
     *
     * @param user_id  user.user_id
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 获取  字段:user.user_name
     *
     * @return  user.user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * 设置  字段:user.user_name
     *
     * @param user_name  user.user_name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * 获取  字段:user.account
     *
     * @return  user.account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置  字段:user.account
     *
     * @param account  user.account
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取  字段:user.password
     *
     * @return  user.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:user.password
     *
     * @param password  user.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取  字段:user.status
     *
     * @return  user.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置  字段:user.status
     *
     * @param status  user.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:user.fk_role_id
     *
     * @return  user.fk_role_id
     */
    public Integer getFk_role_id() {
        return fk_role_id;
    }

    /**
     * 设置  字段:user.fk_role_id
     *
     * @param fk_role_id  user.fk_role_id
     */
    public void setFk_role_id(Integer fk_role_id) {
        this.fk_role_id = fk_role_id;
    }
}