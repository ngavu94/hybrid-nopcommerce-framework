package javaOOP;

public class Dog extends Animals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.annimalAge);
        dog.setAnimalName("Husky");
        System.out.println(dog.getAnimalName());
    }
}
