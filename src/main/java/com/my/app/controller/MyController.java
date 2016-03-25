package com.my.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * TODO 控制层代码 
 * @author 591791 
 * @date 2014年11月27日 
 */
@Controller
public class MyController {

	@Autowired
	private HttpServletRequest request;

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

		//		System.out.println("JSESSIONID:" + jes.toString());

		return "Hello " + username + ",Your password is: " + password;

	}

}