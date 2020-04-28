package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import model.user;
import repo.Userrepo;

@Service
public class kafkaconsumer {
	
	@Autowired
	private Userrepo userrepo;
	
	Gson gson = new Gson();
	
	@KafkaListener(topics = "Kafka_Example", groupId = "group_id",containerFactory = "userKafkaListnerFactory")
	public void consume(String s)
	{
		System.out.println(s);
		try {
			user usr = gson.fromJson(s, user.class);
			//userrepo.save(usr);
			System.out.println("saved");
		} catch (Exception e) {
			System.out.println("data is not for user class");
		}
	}
}
