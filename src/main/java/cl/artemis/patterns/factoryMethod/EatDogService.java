package cl.artemis.patterns.factoryMethod;

public class EatDogService extends EatService{
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
