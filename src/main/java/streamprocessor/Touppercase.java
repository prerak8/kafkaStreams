package streamprocessor;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.ValueMapper;
import org.springframework.stereotype.Component;

@Component
public class Touppercase {
	public void process(KStream<String, String> stream,String output_topic){
        stream.mapValues(value -> value.toUpperCase()).to(output_topic);
    }

}
