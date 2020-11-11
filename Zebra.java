package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public class Zebra extends Mammal {


    public Zebra(String animalType, String animalName, Double animalWeight,  String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    public String makeSound() {
        return "Zs";
    }


    @Override
    void eat(Food quantity) {
        if (quantity.getType().equals("Vegetable")) {
            super.eat(quantity);
        } else {
            throw new IllegalStateException("Zebras are not eating that type of food!");
        }
    }






}
