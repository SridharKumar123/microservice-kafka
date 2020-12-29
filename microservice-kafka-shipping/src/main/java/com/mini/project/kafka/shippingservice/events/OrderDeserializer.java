package com.mini.project.kafka.shippingservice.events;


import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.mini.project.kafka.shippingservice.model.Order;

public class OrderDeserializer extends JsonDeserializer<Order>{
	
	public OrderDeserializer() {
		super(Order.class);
	}
}
