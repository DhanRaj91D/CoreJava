package study.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* org.springframework.beans.factory.BeanCreationException: Error creating bean
 * with name 'requestMappingHandlerMapping' defined in class path resource
 * [org/springframework/boot/autoconfigure/web/servlet/
 * WebMvcAutoConfiguration$EnableWebMvcConfiguration.class]: Invocation of init
 * method failed; nested exception is java.lang.IllegalStateException: Ambiguous
 * mapping. Cannot map 'thirdControler' method
 * Due to same controller urland method url as second controler ambigutyty error occurs
 */


@RestController
/* @RequestMapping(path = "/second") */
public class ThirdControler {
	
	@RequestMapping(method = RequestMethod.GET/* ,path = "/hi" */)
	public String sayGet()
	{
		return "Hello from restController 2";
	}

}
