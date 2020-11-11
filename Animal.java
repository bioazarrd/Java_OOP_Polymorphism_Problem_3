package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
import java.text.DecimalFormat;
public abstract class Animal {

    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }


    String makeSound() {
        return "";
    }

    void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public String toString() {
        return String.format("%s[%s,%s,%d]",
                this.animalType,
                this.animalName,
                new DecimalFormat("##.##").format(this.animalWeight),
                this.foodEaten);
    }


    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }


}