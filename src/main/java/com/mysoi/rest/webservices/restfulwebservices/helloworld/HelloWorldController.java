package com.mysoi.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	
	@GetMapping(path = "/basicauth")
	public String basicAuthCheck() 
	{
		return "Success";
	}
	
	@GetMapping(path = "/") 
	public String returnSomethingAtRootUrl() {
		return "Congratulations!"; 
	}
	
	@GetMapping(path = "/hello-world-bean")
	public helloWorldBean helloWorldBean() 
	{
		return new helloWorldBean("Hello world Bean");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public helloWorldBean helloWorldPathVariable(@PathVariable String name) 
	{
		return new helloWorldBean(String.format("Hello world, %s", name));
	}
	
}
