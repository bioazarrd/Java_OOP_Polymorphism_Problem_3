package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
public abstract class Food {

    private Integer quantity;

    public Food (Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public abstract String getType();


}
