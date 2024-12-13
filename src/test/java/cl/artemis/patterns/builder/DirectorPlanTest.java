package cl.artemis.patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DirectorPlanTest {

    @Test
    public void testCreateAMobilePlan(){


        MobileXLPlanBuilder builder = new MobileXLPlanBuilder();
        DirectorPlan directorPlan = new DirectorPlan(builder);
        directorPlan.makeMobilePlan();
        MobilePlan plan = builder.getResult();

        Assertions.assertEquals("1000",plan.getGB());
        Assertions.assertEquals("500",plan.getMins());


    }
}
