package be.vdab.hello;
import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */
public class App {
    private static Logger logger = LogManager.getLogger();

public String sayHello() {
logger.debug ("Somebody called sayHello()");
return "Hello world";
}

	public static void main( String[] args ) {
App app = new App();
        System.out.println(app.sayHello());
    }
}
