package com.mini.project.kafka.shippingservice.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.mini.project.kafka.shippingservice.model.Order;

@Component
public class ShipmentKafkaListener {

	private final Logger log = LoggerFactory.getLogger(ShipmentKafkaListener.class);
	
	@KafkaListener(topics="orderTopic")
	public void listenToTopic(Order order, Acknowledgment ack) {
		System.out.println(" RECEIVED PUBLISH EVENT ===");
		log.info(" RECEIVED LOG  ");
		ack.acknowledge();
	}
}
