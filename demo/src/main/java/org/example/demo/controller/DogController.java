package org.example.demo.controller;

import org.example.demo.models.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/dog")
public class DogController extends AbstractController<Dog> {

	@Override
	public String getView(Dog animal) {
		// TODO Auto-generated method stub
		return "forward:/lion/";
	}

}
