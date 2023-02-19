package projectkafka.kafkaImplement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import projectkafka.kafkaImplement.service.producer;

@RestController
@RequestMapping("/api")
public class controller {

	@Autowired
	producer producerObj;

	@GetMapping("/producerinput")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producerObj.sendMessage(message);
	}
}
