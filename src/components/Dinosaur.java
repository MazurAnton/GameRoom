package components;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Dinosaur extends Toy{

    private static final int DINOSAUR_MAX_PREDICTED_COST = 60;
    private String speciesOfDino;

    public Dinosaur() throws FileNotFoundException {
        super("Dinosaur");
        this.setToysCharacteristicsRandomly(DINOSAUR_MAX_PREDICTED_COST);
    }

    @Override
    public void setToysCharacteristicsRandomly(int maxPredictedCost) throws FileNotFoundException {

        super.setToysCharacteristicsRandomly(maxPredictedCost);
        speciesOfDino = setDinosaurSpeciesRandomly();

    }


    public String setDinosaurSpeciesRandomly() throws FileNotFoundException {
        Random random = new Random();

        String[] possibleSpecies = super.getAllCharacteristicsOfToy(this).split(" ");
        int randomizeSpecies = random.nextInt(possibleSpecies.length) + 1;

        return possibleSpecies[randomizeSpecies-1];

    }


    @Override
    public String toString() {
        return "Dinosaur{" +
                super.toString() +
                "speciesOfDino='" + speciesOfDino + '\'' +
                '}';
    }

    public int getMaxPredictedCost() {return DINOSAUR_MAX_PREDICTED_COST;}
}

