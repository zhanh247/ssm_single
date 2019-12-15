package com.hao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-rabbit.xml" })
public class RabbitMqTest {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Test
	public void sendMessage() {
		rabbitTemplate.convertAndSend("hello spring-rabbit...");
	}

}
