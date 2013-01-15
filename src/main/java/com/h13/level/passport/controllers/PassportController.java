package com.h13.level.passport.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/passport")
public class PassportController {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		
		
		
		
		
		

		ModelAndView mav  = new ModelAndView("/board/index");
		return mav;
	}
}
