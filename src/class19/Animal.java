package class19;

// create 3 classes like Dog Cat Horse define 5 properties in each class
// access level
// create one printInfo method that will print the values of these variables.
// create constructors as well in each child class to initialize those
// properties create one object of each class and call the printInfo method

public class Animal {
    String name;
    double weight;
    int age;
    char gender;
    String color;

    public Animal(String name, double weight, int age, char gender, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Color: " + color);
        System.out.println();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("James", 24.2, 7, 'F', "White");
        dog.printInfo();

        Cat cat = new Cat("Blacky", 12.2, 3, 'M', "Black");
        cat.printInfo();

        Horse horse = new Horse("Snow", 50, 12, 'M', "White");
        horse.printInfo();
    }
}

class Dog extends Animal {
    public Dog(String name, double weight, int age, char gender, String color) {
        super(name, weight, age, gender, color);
    }
}

class Cat extends Animal {
    public Cat(String name, double weight, int age, char gender, String color) {
        super(name, weight, age, gender, color);
    }
}

class Horse extends Animal {
    public Horse(String name, double weight, int age, char gender, String color) {
        super(name, weight, age, gender, color);
    }
}