package com.example.speakerservice;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello")
public class HelloProperties {

	/**
	 * Target of our friendly welcome message.
	 */
	private String target = "World";

	/**
	 * Delay after which the welcome message is made available.
	 */
	private Duration delay = Duration.ofSeconds(3);

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Duration getDelay() {
		return this.delay;
	}

	public void setDelay(Duration delay) {
		this.delay = delay;
	}

}
