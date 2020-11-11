package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public class Vegetable extends Food {


    public Vegetable(Integer quantity) {
        super(quantity);
    }

    @Override
    public String getType() {
        return "Vegetable";
    }


}
