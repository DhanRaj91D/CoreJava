package study.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/second")
public class SecondControler {
	
	@RequestMapping(method = RequestMethod.GET,path = "/hi")
	public String sayGet()
	{
		return "Hello from restController 2";
	}
	
	/* @RequestMapping(method = RequestMethod.POST,path = "/inPost") */
	@PostMapping("/inPost")
	public void inPost()
	{
		System.out.println("In post method");
		
	}
	
	/* @RequestMapping(method = RequestMethod.DELETE,path = "/inDelete") */
	@DeleteMapping("/inDelete")
	public void inDelete()
	{
		System.out.println("In Delete method");
		
	}
	@RequestMapping(method = RequestMethod.PUT,path = "/inPut")
	public void inPut()
	{
		System.out.println("In PUT method");
		
	}
	

}
