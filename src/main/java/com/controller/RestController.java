package com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	@ResponseBody
	public String getHelloMessage() {
		return "Hello, This is Shubham!";
	}
	
	//get request using @GetMapping
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello From Bridgelabz";
	}
	
	//query parameter using @RequestParam
	@GetMapping("/name")
	public String nameAsQueryParameter(@RequestParam String name) {
		return "My name is: "+name;
	}
	
	 //query parameter using @PathVariables
	@GetMapping("/name{name}")
	public String nameAsPathVariable(@PathVariable String name) {
		return "My name is: "+name;
	}
}
