package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo
 
{
	private static Logger logger=(Logger) LogManager.getLogger(Demo.class);
    public static void main(String[] args)
    {
        System.out.println("\n  Hello World...! \n");
        logger.info("This is a info message");
        logger.error("This is a error message");
        logger.warn("This is a warning message");
        logger.fatal("This is a fatal message");
        System.out.println("\n  Completed");
    }
}
