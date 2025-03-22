


abstract class Animal {
    protected String name; 
    private static int animalCount = 0; 

    
    public Animal(String name) {
        this.name = name;
        animalCount++; 
    }

    
    public static int getAnimalCount() {
        return animalCount;
    }

    
    public abstract void run(int distance);
    public abstract void swim(int distance);
}


class Cat extends Animal {
    private static int catCount = 0; 
    private final int maxRunDistance = 200; 
    private final int maxSwimDistance = 0; 

    
    public Cat(String name) {
        super(name); 
        catCount++; 
    }

    
    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}


class Dog extends Animal {
    private static int dogCount = 0; 
    private final int maxRunDistance = 500; 
    private final int maxSwimDistance = 10; 

    
    public Dog(String name) {
        super(name); 
        dogCount++; 
    }

    
    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}


public class Animals {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");

        
        cat1.run(150); 
        cat1.swim(5);  

        
        dog1.run(300); 
        dog1.swim(5);  

        
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
    }
}
