package com.mini.project.kafka.orderservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.mini.project.kafka.orderservice.model.Order;

@Service
public class OrderService {

	private KafkaTemplate<String, Order> kafkaTemplate;
	
	@Autowired
	public OrderService(KafkaTemplate<String, Order> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void fireKafkaEvent(Order order) {
		System.out.println(" KAFKA EVENT INVOKED ");
		//kafkaTemplate.send("orderTopic","new  orderTopic");
		kafkaTemplate.send("orderTopic", "created", order);
	}
}
