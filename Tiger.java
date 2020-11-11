package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public class Tiger extends Felime {


    public Tiger(String animalType, String animalName, Double animalWeight,  String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    void eat(Food quantity) {
        if (quantity.getType().equals("Meat")) {
            super.eat(quantity);
        } else {
            throw new IllegalStateException("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }


}
