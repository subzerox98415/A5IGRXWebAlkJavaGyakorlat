package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormA5IGRX {
	
	@RequestMapping("/form")
	public String getform() {
		return "form";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm() {
		return "submitted-form";
	}
}
