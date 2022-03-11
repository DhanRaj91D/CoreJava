package study.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestControler {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hi")
	public String sayHello()
	{
		return "Hello from restController 1";
	}

}
