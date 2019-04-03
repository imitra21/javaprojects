package com.in28minutes.springboot.web;
//created by Indranil Mitra
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Hi This is Indranil Mitra";
	}

}
