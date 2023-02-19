package projectkafka.kafkaImplement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class producer {

	// < name of the topic, message>
	@Autowired
	KafkaTemplate<String, String> kafkatemplate;

	public void sendMessage(String message) {
		kafkatemplate.send("messageTopic", message);

	}
}
