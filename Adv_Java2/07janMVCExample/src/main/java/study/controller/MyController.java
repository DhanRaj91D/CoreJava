package study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	
	@GetMapping("/hi")
	public String sayHello()
	{
		return "first";
	}
	
}
