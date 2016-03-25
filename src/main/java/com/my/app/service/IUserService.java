/**
 * Project Name:credit-app
 * File Name:IUserService.java
 * Package Name:com.my.app.service
 * Date:2016年3月25日下午6:06:40
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
*/

package com.my.app.service;

import com.my.app.dto.User;

/**
 * ClassName:IUserService <br/>
 * Description:	 TODO ADD Description. <br/>
 * Date:     2016年3月25日 下午6:06:40 <br/>
 * @author   linjinxiao
 * @version  
 * @see 	 
 */
public interface IUserService {
	public User getUserById(int userId);
}
