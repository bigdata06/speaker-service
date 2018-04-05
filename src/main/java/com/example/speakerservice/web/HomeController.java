package com.example.speakerservice.web;

import com.example.speakerservice.HelloProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private final HelloProperties properties;

	public HomeController(HelloProperties properties) {
		this.properties = properties;
	}

	@GetMapping("/")
	public String hello() {
		simulateSlowService();
		return String.format("Hello %s", this.properties.getTarget());
	}

	// Don't do this at home
	private void simulateSlowService() {
		try {
			Thread.sleep(this.properties.getDelay().toMillis());
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
