/**
 * Project Name:credit-app
 * File Name:UserServiceImpl.java
 * Package Name:com.my.app.service.impl
 * Date:2016年3月25日下午6:08:36
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
*/

package com.my.app.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.app.dao.IUserDao;
import com.my.app.dto.User;
import com.my.app.service.IUserService;

/**
 * ClassName:UserServiceImpl <br/>
 * Description:	 TODO ADD Description. <br/>
 * Date:     2016年3月25日 下午6:08:36 <br/>
 * @author   linjinxiao
 * @version  
 * @see 	 
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub  
		return this.userDao.selectByPrimaryKey(userId);
	}

}
