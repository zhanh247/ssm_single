package com.hao.web.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @desc rabbitMQ监听器
 * @author zhanh247
 */
public class FooMessageListerer implements MessageListener {

	@Override
	public void onMessage(Message message) {
		String msg = new String(message.getBody());
		System.out.println("spring rabbitmq receive message: " + msg);
	}

}
