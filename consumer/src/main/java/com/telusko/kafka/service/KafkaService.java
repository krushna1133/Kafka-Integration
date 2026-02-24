package com.telusko.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.telusko.kafka.model.Course;

@Service
public class KafkaService {
	private String message;
	
	@KafkaListener(topics="telusko", groupId="telusko-group")
	public void consume(Course course) {

		message= course + " Got the data from kafka";
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

}
