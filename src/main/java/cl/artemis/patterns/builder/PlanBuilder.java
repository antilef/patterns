package cl.artemis.patterns.builder;

public interface PlanBuilder {
    void reset();
    void setName();
    void setGB(String gb);
    void setMins(String mins);
    void setSMS();
}
