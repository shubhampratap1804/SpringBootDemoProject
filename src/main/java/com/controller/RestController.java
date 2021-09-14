package com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bridgelabz.model.ModelClass;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	@ResponseBody
	public String getHelloMessage() {
		return "Hello, This is Shubham!";
	}
	
	//Get request using @GetMapping
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello From Bridgelabz";
	}
	
	//Query parameter using @RequestParam
	@GetMapping("/name")
	public String nameAsQueryParameter(@RequestParam String name) {
		return "My name is: "+name;
	}
	
	 //Query parameter using @PathVariables
	@GetMapping("/name{name}")
	public String nameAsPathVariable(@PathVariable String name) {
		return "My name is: "+name;
	}
	
    //PostMapping with RequestBody
    @PostMapping("/post")
    public String postPersonFullName(@RequestBody ModelClass person) {
        return "Hello, Welcome " + person.getFirstName() + " " + person.getLastName();
    }
    
    //Demonstrating PutMapping with @PathVariable and @RequestParam
    //localhost:8080/put/Shubham/?lastName=Singh
    @PutMapping("/put/{firstname}")
    public String putMappingPersonInfo(@PathVariable String firstname, @RequestParam(value = "lastname") String lastname) {
        return "hello, Welcome " + firstname + " " + lastname;
    }
}
