package cl.artemis.patterns.buildermethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    public void testCorrectBuildCat(){
        Cat cat = Cat.builder()
                .eyes(2)
                .color("white")
                .name("Carlos")
                .owner("Patricio")
                .build();


        Assertions.assertEquals("white", cat.getColor());
    }
}
