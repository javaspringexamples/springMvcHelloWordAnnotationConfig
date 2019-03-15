package javaspringexamples.spring.springmvcHelloWord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Controller
public class HelloWordController {

	@RequestMapping(value = "/helloWord")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello JavaSpringExamples Word!");
		mv.setViewName("helloWord");
		return mv;
	}
}
