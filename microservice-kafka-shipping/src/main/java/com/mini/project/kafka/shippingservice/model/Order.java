package com.mini.project.kafka.shippingservice.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private int id;
	
	private Date updated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
