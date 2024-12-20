package cl.artemis.patterns.factoryMethod;

public abstract class EatService {

    void eat(){
        Animal animal = createAnimal();
        System.out.println(animal.eat());
    }

    abstract Animal createAnimal();

}
