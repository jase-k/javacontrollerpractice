package com.jasekraft.daikichi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Omikuji {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/fortune", method=RequestMethod.POST)
	public String fortune(Model model, 
			@RequestParam(value ="number") String number,
			@RequestParam(value ="city") String city, 
			@RequestParam(value ="person") String person,
			@RequestParam(value ="career") String career, 
			@RequestParam(value="organism") String organism,
			@RequestParam(value ="nice") String nice
			) {
		
		String fortune = String.format("In %s years, you will live in %s with %s as your roommate, %s for a living. The next time you see a %s, you will have good luck. Also, %s", number, city, person, career, organism, nice);
		model.addAttribute("fortune", fortune);
		return "fortune.jsp";
	}
	
}
