package resource;

import model.User;
import repo.Userrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Userresource {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    @Autowired
    private Userrepo userrepo;
    

    private static final String TOPIC = "Kafka_Example";
    
    @PostMapping(value = "/publish",consumes = "text/plain")
    public String post(@RequestBody String s)
    {
    	kafkaTemplate.send(TOPIC,"key",s);
		return s;
    }
    
    @GetMapping("/all")
    public List<User> post1(){
    	return userrepo.findAll();
    }
    
}