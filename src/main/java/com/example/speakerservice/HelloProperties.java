package com.example.speakerservice;

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
	 * Delay in milliseconds after which the welcome message is made available.
	 */
	private long delay = 3000;

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public long getDelay() {
		return this.delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

}
