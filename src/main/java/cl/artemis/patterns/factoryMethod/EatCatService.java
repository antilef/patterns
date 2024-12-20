package cl.artemis.patterns.factoryMethod;

public class EatCatService extends EatService{
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
