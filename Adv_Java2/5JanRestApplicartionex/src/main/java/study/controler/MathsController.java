package study.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.CalculatorPOJO;

@RestController
@RequestMapping(path = "/maths")
public class MathsController {
	
	/*
	 * @RequestMapping(method = RequestMethod.GET, path = "/add") public int
	 * add(@RequestParam int num1, @RequestParam("num2") int n2) { return num1 +n2;
	 * }
	 */
	
	@PostMapping("/add")
	public int add(@RequestBody CalculatorPOJO cal)
	{
		
		
		int res =0;
		if(cal.getOp().equals("add"))
		res=cal.getNum1() +cal.getNum2();
		
		if(cal.getOp().equals("sub"))
			res=cal.getNum1() -cal.getNum2();
		
		if(cal.getOp().equals("mul"))
			res=cal.getNum1() *cal.getNum2();
		
		if(cal.getOp().equals("div"))
			res=cal.getNum1() /cal.getNum2();
		
		
		return res;
	}
	

	/* @RequestMapping(method = RequestMethod.GET,path = "/mul/{num1}/{num2}") */
	@GetMapping("/mul/{num1}/{num2}") // This is shortcut way for above line
	public double multiply(@PathVariable("num1") double n1,@PathVariable double num2)
	{
		return n1*num2;
	}
	
	@GetMapping("/product/{num1}/{num2}/{num3}") // This is shortcut way to write get method
	public double product(@PathVariable("num1") double n1,@PathVariable double num2,@PathVariable double num3)
	{
		return n1*num2*num3;
	}
	
	@GetMapping("/intdiv")
	public int div(@RequestParam int num1,@RequestParam int num2)
	{
		return num1/num2;
	}
	
	@GetMapping("/floatdiv/{num1}/{num2}")
	public float div(@PathVariable float num1, @PathVariable float num2)
	{
		return num1/num2;  
		
	}
	
	@GetMapping("/subtract")
	public int substract(@RequestParam int num1, @RequestParam int num2)
	{
		return num1-num2;
	}
}
