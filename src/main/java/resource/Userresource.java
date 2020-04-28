package resource;

import model.user;
import repo.Userrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@RestController
@RequestMapping("kafka")
public class Userresource {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    @Autowired
    private Userrepo userrepo;
    

    private static final String TOPIC = "Kafka_Example";
    
    @PostMapping(value = "/publish",consumes = "application/json")
    public String post(@RequestBody String s)
    {
    	System.out.println(s);
    	kafkaTemplate.send(TOPIC, s);
    	return s;
    }
    
    @GetMapping("/all")
    public List<user> post1(){
    	return userrepo.findAll();
    }
    
}