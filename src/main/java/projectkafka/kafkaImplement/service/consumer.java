package projectkafka.kafkaImplement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class consumer {

	@KafkaListener(topics = "messageTopic", groupId = "consumer1")
	public void listenToTopic(String receivedMessage) {
		System.out.println("Received the message to consumer" + receivedMessage);
	}

}
