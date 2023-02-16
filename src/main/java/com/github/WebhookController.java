package com.github;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
	
	Logger logger=LoggerFactory.getLogger(WebhookController.class);
	@PostMapping
	public ResponseEntity<String> print(@RequestBody String requestBody){
		System.out.println(requestBody+" ");
		logger.error(requestBody);
		return new ResponseEntity<String>(requestBody, HttpStatus.OK);
	}
}
