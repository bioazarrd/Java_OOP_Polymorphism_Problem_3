package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Animal> listOfAnimal = new ArrayList<>();
        String command = reader.readLine();

        while (!command.equals("End")) {
            String[] animalInput = command.split("\\s+");
            String animalType = animalInput[0];
            String animalName = animalInput[1];
            double animalWeight = Double.parseDouble(animalInput[2]);
            String livingRegion = animalInput[3];


            Food newFood;
            Animal newAnimal;

            String[] foodInput = reader.readLine().split("\\s+");
            String foodType = foodInput[0];
            int foodWeight = Integer.parseInt(foodInput[1]);
            if (foodType.equals("Meat")) {
                newFood = new Meat(foodWeight);
            } else {
                newFood = new Vegetable(foodWeight);
            }

            if (animalInput.length == 5) {
                String catBreed = animalInput[4];
                newAnimal = new Cat(animalType,
                        animalName,
                        animalWeight,
                        livingRegion,
                        catBreed);
            } else {
                if (animalType.equals("Tiger")) {
                    newAnimal = new Tiger(animalType,
                            animalName,
                            animalWeight,
                            livingRegion);
                } else if (animalType.equals("Zebra")) {
                    newAnimal = new Zebra(animalType,
                            animalName,
                            animalWeight,
                            livingRegion);
                } else {
                    newAnimal = new Mouse(animalType,
                            animalName,
                            animalWeight,
                            livingRegion);
                }
            }


            System.out.println(newAnimal.makeSound());
            try {
                newAnimal.eat(newFood);
            } catch (IllegalStateException iae) {
                System.out.println(iae.getMessage());
            }

            listOfAnimal.add(newAnimal);
            command = reader.readLine();
        }


        for (Animal animal : listOfAnimal) {
            System.out.println(animal.toString());
        }






    }
}