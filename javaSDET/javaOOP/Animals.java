package javaOOP;

public class Animals {
    private String animalName;
    protected Integer annimalAge = 5;
    protected String getAnimalName(){ // Hàm getter
        return animalName;
    }
    protected void setAnimalName(String animalName){// Hàm setter
        this.animalName = animalName;
    }
}
