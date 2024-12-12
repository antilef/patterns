package cl.artemis.patterns.buildermethod;

public class Cat {

    private int eyes;
    private String name;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String color;
    private String owner;

    private Cat() {

    }

    public static CatBuilder builder(){
        return new CatBuilder();
    }

    public static class CatBuilder {
        private int eyes;
        private String name;
        private String color;
        private String owner;

        public CatBuilder eyes(int eyes){
            this.eyes = eyes;
            return this;
        }

        public CatBuilder name(String name){
            this.name = name;
            return this;
        }

        public CatBuilder color(String color){
            this.color = color;
            return this;
        }

        public CatBuilder owner(String owner){
            this.owner = owner;
            return this;
        }


        public Cat build(){
            Cat cat = new Cat();
            cat.color = this.color;
            cat.eyes = this.eyes;
            cat.name = this.name;
            cat.owner = this.owner;
            return cat;
        }
    }
}
