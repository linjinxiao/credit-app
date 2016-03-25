package com.my.app.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.app.dto.User;
import com.my.app.service.IUserService;

/** 
 * TODO 控制层代码 
 * @author 591791 
 * @date 2014年11月27日 
 */
@Controller
public class MyController {

	@Autowired
	private HttpServletRequest request;
	@Resource
	private IUserService userService;

	@RequestMapping("login") //用来处理前台的login请求  
	private @ResponseBody String hello(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {

		HttpSession jes = request.getSession(false);

		if (jes == null) {
			if ("a".equals(username)) {
				System.out.println("begin create");
				jes = request.getSession(true);
				jes.setAttribute("aa", "bbc");
			} else {
				System.out.println("not create");
			}
		} else {
			Object aa = jes.getAttribute("aa");
			System.out.println("aa:" + aa);
		}

		int userId = 1;//Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(userId);
		System.out.println(user.getPassword());
		//        model.addAttribute("user", user);  
		//        return "showUser";  

		//		System.out.println("JSESSIONID:" + jes.toString());

		return "Hello " + username + ",Your password is: " + password;

	}

}