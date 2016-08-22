package com.workfront.springmvcexample.controller;

import com.workfront.springmvcexample.core.User;
import com.workfront.springmvcexample.core.UserService;
import com.workfront.springmvcexample.spring.SomeOtherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

	@Autowired
	private UserService userService;

	@Autowired
	private SomeOtherBean someOtherBean;

	@RequestMapping("/simple")
	public String simpleRequest(Model model) {
		model.addAttribute("message", "Simple Message");

		User user = userService.getById("someId");
		model.addAttribute("user", user);
		return "simpleRequest";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String simpleRequest(@RequestAttribute("id") String id, Model model) {
		model.addAttribute("message", "Simple Message");

		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "simpleRequest";
	}


}
