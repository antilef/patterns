package cl.artemis.patterns.builder;

public class MobileXLPlanBuilder implements PlanBuilder{

    private MobilePlan plan;

    public MobileXLPlanBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.plan = new MobilePlan();
    }

    @Override
    public void setName() {

    }

    @Override
    public void setGB(String gb) {
        this.plan.setGB(gb);
    }

    @Override
    public void setMins(String mins) {
        this.plan.setMins(mins);
    }

    @Override
    public void setSMS() {

    }


    public MobilePlan getResult() {
        return this.plan;
    }
}
