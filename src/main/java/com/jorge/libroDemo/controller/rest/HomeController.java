package com.jorge.libroDemo.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String greeting (@RequestParam(required= false, defaultValue = "") String name) {
		return name.equals("") ? "HOLA!" : "HOLA, " + name + "!";
	}

}
