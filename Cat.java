package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
import java.text.DecimalFormat;
public class Cat extends Felime {

    private String catBreed;


    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String catBreed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.catBreed = catBreed;
    }


    @Override
    public String makeSound() {
        return "Meowwww";
    }


    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                this.catBreed,
                new DecimalFormat("##.##").format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten());
    }



}