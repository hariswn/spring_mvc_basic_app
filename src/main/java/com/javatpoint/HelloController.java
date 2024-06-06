package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String display()
	{
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
