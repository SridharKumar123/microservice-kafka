package com.mini.project.kafka.orderservice.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mini.project.kafka.orderservice.impl.OrderService;
import com.mini.project.kafka.orderservice.model.Order;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView loginPage() {
		System.out.println(" ENTERED THE CONTROLLER ===============================     ");
		Order order = new Order();
		order.setId(11);
		order.setUpdated(new Date(10));
		orderService.fireKafkaEvent(order);
		return new ModelAndView("login","order",order);
	}
}
