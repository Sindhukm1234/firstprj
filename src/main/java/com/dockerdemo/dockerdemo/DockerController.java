package com.dockerdemo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DockerController {
	@GetMapping("/get")
	public String test1() {
		return "Get method calling";
				
	}
	
 @GetMapping("/post")
 public String test2() {
	 return"controller post ";
 }
}
