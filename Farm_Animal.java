import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canWalk();
    public abstract boolean canSwim();
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public boolean canWalk() {
        return true; 
    }

    @Override
    public boolean canSwim() {
        return false; 
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public boolean canWalk() {
        return true; 
    }

    @Override
    public boolean canSwim() {
        return true; 
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public boolean canWalk() {
        return false; 
    }

    @Override
    public boolean canSwim() {
        return true; 
    }
}

class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimalsCanWalkOrSwim() {
        System.out.println("Animals that can walk or swim:");
        for (Animal animal : animals) {
            if (animal.canWalk() || animal.canSwim()) {
                System.out.println(animal.getName() + " - Can Walk: " + animal.canWalk() + ", Can Swim: " + animal.canSwim());
            }
        }
    }
}

public class Farm_Animal {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Animal pig = new Pig("Pig");
        Animal duck = new Duck("Duck");
        Animal fish = new Fish("Fish");

        farm.addAnimal(pig);
        farm.addAnimal(duck);
        farm.addAnimal(fish);

        farm.printAnimalsCanWalkOrSwim();
    }
}