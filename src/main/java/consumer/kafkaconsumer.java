package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Jsondata;
import repo.Userrepo;
@Service
public class kafkaconsumer {
	
	@Autowired
	private Userrepo userrepo;
	
	@Autowired
	private ObjectMapper objmapper;
	
	@Autowired
	ApplicationContext appcontext;
	
 	@KafkaListener(topics = "Kafka_output", groupId = "group_id",containerFactory = "userKafkaListnerFactory")
 	public void consume(String s) 
 	{
		System.out.println(s);
//		try {
//			JsonNode parent= objmapper.readTree(s);
//			String dataType = parent.path("dataType").asText();
//			Jsondata jsondata = (Jsondata) objmapper.readValue(s, appcontext.getBean(dataType).getClass());
//			System.out.println(jsondata.getjsonData());
//		} catch (Exception e) {
//			System.out.println("Invalid object");
//		}    
		
	}
}
