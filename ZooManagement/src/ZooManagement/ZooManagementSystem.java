package ZooManagement;
	// Single-file Java program for Zoo Management System

	interface CanFly {
	    void fly();
	}

	abstract class Animal {
	    String name;
	    int age;

	    Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    abstract void makeSound();
	}

	class Dog extends Animal {
	    Dog(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    void makeSound() {
	        System.out.println(name + " (" + age + " years old) says: Woof! Woof!");
	    }
	}

	class Fish extends Animal {
	    Fish(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    void makeSound() {
	        System.out.println(name + " (" + age + " years old) says: Blub blub!");
	    }
	}

	class Bird extends Animal implements CanFly {
	    Bird(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    void makeSound() {
	        System.out.println(name + " (" + age + " years old) says: Tweet! Tweet!");
	    }

	    @Override
	    public void fly() {
	        if (age < 2) {
	            System.out.println(name + " is a young bird learning to fly!");
	        } else {
	            System.out.println(name + " can fly high in the sky!");
	        }
	    }
	}

	public class ZooManagementSystem {
	    public static void main(String[] args) {
	        Animal dog = new Dog("Buddy", 3);
	        Animal fish = new Fish("Goldie", 1);
	        Animal birdYoung = new Bird("Tweety", 1);
	        Animal birdAdult = new Bird("Rio", 4);

	        Animal[] animals = {dog, fish, birdYoung, birdAdult};

	        System.out.println("=== Zoo Sounds and Flying Ability ===");

	        for (Animal animal : animals) {
	            System.out.println("\n--- " + animal.name + " ---");
	            animal.makeSound();

	            if (animal instanceof CanFly) {
	                ((CanFly) animal).fly();
	            } else {
	                System.out.println(animal.name + " cannot fly.");
	            }
	        }
	    }
}

