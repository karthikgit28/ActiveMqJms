package com.jms.test.springjms.jmsConfig;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@EnableJms
@Configuration
public class JmsConfig {
	
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		System.out.println("Tets1111111111111");
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory
				("admin", "admin", "tcp://192.168.99.100:61616");
		return factory;
	}
	
	@Bean
	public MessageConverter jacksonMessageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_type");
		return converter;
	}
	
	@Bean
	public DefaultJmsListenerContainerFactory defaultJMSConctFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory());
		factory.setMessageConverter(jacksonMessageConverter());
		factory.setConcurrency("1-1");
		return factory;
	}
	
	
	
	

}
