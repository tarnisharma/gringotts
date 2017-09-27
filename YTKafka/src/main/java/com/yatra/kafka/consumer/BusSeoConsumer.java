package com.yatra.kafka.consumer;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class BusSeoConsumer {

	private static final Logger logger = LoggerFactory.getLogger(BusSeoConsumer.class);

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}

	@KafkaListener(topics = "${kafka.busseo.topic.busseotopic}")
	public void receive(String payload) {
		logger.info("received busseotopic payload='{}'", payload);
		latch.countDown();
	}
}