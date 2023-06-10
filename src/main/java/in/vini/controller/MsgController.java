package in.vini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "hello,welcome to spring web mvc");
		
		mv.setViewName("message");
		
		return mv;
		
	}
	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "good morning");
		mv.setViewName("message");
		
		return mv;
	}
	
}















