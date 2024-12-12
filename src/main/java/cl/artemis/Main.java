package cl.artemis;

import cl.artemis.patterns.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("Main");
        logger.debug("Hello world");



    }
}
