package com.ustglobal.retailermaintenanceproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailermaintenanceproject.dto.RetailerBean;
import com.ustglobal.retailermaintenanceproject.service.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}

	@GetMapping("/createprofile")
	public String createProfile() {
		return "createprofile";
	}

	@PostMapping("/createprofile")
	public String register(RetailerBean bean,ModelMap map) {

		int check = service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg","You are Registered and ID is "+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}

	@PostMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/home")
	public String home(ModelMap map , @SessionAttribute(name = "bean",required = false) RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg","Login first!!!!");
			return "login";
		}else {
			return "home";
		}
	}

	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}

	@PostMapping("/changepassword")
	public String changePassword(String password,String confirmpassword,@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getrId(),password);
			map.addAttribute("msg","Password changed");
		}else {
			map.addAttribute("msg","Password not matching");
		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
