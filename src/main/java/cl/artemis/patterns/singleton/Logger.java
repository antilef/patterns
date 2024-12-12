package cl.artemis.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger logger;
    private static List<String> classes = new ArrayList<>();

    private Logger(){
    }

    public static Logger getInstance(String className){
        if(logger == null){
            logger = new Logger();
        }
        classes.add(className);
        return logger;
    }
    public void debug(String text){
        System.out.println("DEBUG: ".concat(text));
    }

    public static int getCountClassesName(){
        return classes.size();
    }

    public static void reset(){
        logger = null;
        classes = new ArrayList<>();
    }

}
