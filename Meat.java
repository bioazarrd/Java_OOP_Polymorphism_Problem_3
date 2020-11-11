package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public class Meat extends Food {


    public Meat(Integer quantity) {
        super(quantity);
    }



    @Override
    public String getType() {
        return "Meat";
    }


}
