package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public class Mouse extends Mammal {


    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    void eat(Food quantity) {
        if (quantity.getType().equals("Vegetable")) {
            super.eat(quantity);
        } else {
            throw new IllegalStateException("Mice are not eating that type of food!");
        }
    }


    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }


}