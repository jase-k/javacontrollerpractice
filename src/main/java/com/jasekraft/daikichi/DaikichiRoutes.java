package com.jasekraft.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiRoutes {

	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{place}")
	public String showDestination(@PathVariable("place") String destination) {
		return "Have fun in " + destination;
	}
	
	@RequestMapping("/lotto/{guess}")
	public String participateInLott(@PathVariable("guess") int guess) {
		if(guess%2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor  but now is a great time to spend time with family and friends.";
		}
	}
}