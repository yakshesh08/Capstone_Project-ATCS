package com.fetch;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class query {

	//@RequestMapping("/sub")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView obj = new ModelAndView();

		obj.setViewName("index.jsp");

		return obj;

	}

}