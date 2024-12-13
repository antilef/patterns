package cl.artemis.patterns.builder;

public class DirectorPlan {

    private final PlanBuilder builder;

    public DirectorPlan(PlanBuilder builder) {
        this.builder = builder;
    }

    public void makeMobilePlan(){
        builder.setGB("1000");
        builder.setMins("500");
    }
}
