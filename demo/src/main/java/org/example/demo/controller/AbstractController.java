package org.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/animal")
public abstract class AbstractController<Animal> {
	@GetMapping("/")
	public abstract String getView(Animal animal) ;
	

}
