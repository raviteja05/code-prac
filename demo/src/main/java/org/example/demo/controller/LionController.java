package org.example.demo.controller;

import org.example.demo.models.Lion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lion")
public class LionController extends AbstractController<Lion>{

	@Override
	public String getView(Lion animal) {
		System.out.println(animal.toString());
		return "hello";
	}

}
