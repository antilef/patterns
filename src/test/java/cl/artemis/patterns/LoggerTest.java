package cl.artemis.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    @BeforeEach
    public void beforeEach(){
        Logger.reset();
    }

    @Test
    public void testIfTwoInstanceAreEquals(){

        Logger logger1 = Logger.getInstance("LoggerTest");

        Logger logger = Logger.getInstance("LoggerTest");

        Assertions.assertEquals(logger,logger1);


    }

    @Test
    public void testThatTwoClassesAreInOneInstance(){

        Logger logger1 = Logger.getInstance("LoggerTest");

        Logger logger = Logger.getInstance("LoggerTest");

        Assertions.assertEquals(2,Logger.getCountClassesName());


    }
}
