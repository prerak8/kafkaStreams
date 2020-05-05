package setup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Set {
	static void delete(File f) throws IOException {
	  if (f.isDirectory()) {
	    for (File c : f.listFiles())
	      delete(c);
	  }
	  if (!f.delete())
	    throw new FileNotFoundException("Failed to delete file: " + f);
	}
	
	public static void main(String[] args) 
    { 
        try
        { 
//        	
           String zookeeper = System.getenv("ZOOKEEPER_HOME");
           zookeeper = zookeeper + "/bin";
           String[] command = {"cmd.exe","/C","start","zkServer"};
           ProcessBuilder builder = new ProcessBuilder(command);
           builder = builder.directory(new File(zookeeper));
           Process p = builder.start();
           
           TimeUnit.SECONDS.sleep(5);
           
             String kafka = System.getenv("KAFKA_HOME");
             kafka = kafka + "/bin/windows";	
       	     File file = new File(kafka+"/Toolskafka_2.12-2.5.0logs");
//       	     try
//       	     {
//       	    	delete(file);
//       	     }
//       	     catch (Exception e) {
//				System.out.println("can't delete file");
//			 }
             String[] command1 = {"cmd.exe","/C","start","kafka-server-start.bat","C:\\Tools\\kafka_2.12-2.5.0\\config\\server.properties"};
             ProcessBuilder builder1 = new ProcessBuilder(command1);
             builder1 = builder1.directory(new File(kafka));
             Process p1 = builder1.start();
           
//           for creating new topic
//           String[] command2 = {"cmd.exe","/C","start","kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example"};
//           ProcessBuilder builder2 = new ProcessBuilder(command2);
//           builder2 = builder2.directory(new File(kafka));
//           Process p2 = builder2.start();
             
             TimeUnit.SECONDS.sleep(3);
           
             String[] command3 = {"cmd.exe","/C","start","kafka-console-consumer.bat","--bootstrap-server","localhost:9092","--topic","Kafka_Exampl","--from-beginning"};
             ProcessBuilder builder3 = new ProcessBuilder(command3);
             builder3 = builder3.directory(new File(kafka));
             Process p3 = builder3.start();
        } 
        catch (Exception e) 
        { 
            System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
            e.printStackTrace(); 
        } 
    } 
}
