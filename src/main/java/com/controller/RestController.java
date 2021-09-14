package com.controller;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	@ResponseBody
	public String getHelloMessage() {
		return "Hello, This is Shubham!";
	}
	
	
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello From Bridgelabz";
	}
}
