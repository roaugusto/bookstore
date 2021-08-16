package com.example.helloworld.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.model.Message;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/helloworld")
@Api(value="/helloworld", tags = "helloworld")
public class HelloWorld {

	@GetMapping
	public ResponseEntity<Message> getHelloWorld() {
		
		Message msg = new Message();
		msg.setDescription("Hello World");
		
		return ResponseEntity.ok(msg);
	}


}
