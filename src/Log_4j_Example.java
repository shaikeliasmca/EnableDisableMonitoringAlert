import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Log_4j_Example {
	/* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(Log_4j_Example.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	   }


}
