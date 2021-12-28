import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Log4j {
	//Factory Design pattern
	
	static Logger log = Logger.getLogger(Basic_Log4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("information");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		
		
		
	}

	
	
	

}
