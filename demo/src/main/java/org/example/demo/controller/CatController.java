package org.example.demo.controller;

import org.example.demo.models.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/cat")
public class CatController extends AbstractController<Cat>{

	@Override
	public String getView(Cat animal) {
		// TODO Auto-generated method stub
		return "hello";
	}

}
