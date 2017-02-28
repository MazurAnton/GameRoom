package components;

import toysnamefile.WorkInFile;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Crossword extends Toy  {

    private static final int CROSSWORD_MAX_PREDICTED_COST = 15;
    private String difficultOfCrossword ;


    public Crossword() throws FileNotFoundException {
        super("Crossword");
        this.setToysCharacteristicsRandomly(CROSSWORD_MAX_PREDICTED_COST);
    }

    @Override
    public void setToysCharacteristicsRandomly(int maxPredictedCost) throws FileNotFoundException {

        super.setToysCharacteristicsRandomly(maxPredictedCost);
        difficultOfCrossword = setCrosswordDifficultRandomly();

    }


    public String setCrosswordDifficultRandomly() throws FileNotFoundException {
        Random random = new Random();

        String[] possibleDifficultOfCrossword = super.getAllCharacteristicsOfToy(this).split(" ");
        int randomizeDifficult = random.nextInt(possibleDifficultOfCrossword.length) + 1;

        return possibleDifficultOfCrossword[randomizeDifficult-1];

    }


    @Override
    public String toString() {
        return "Crossword{" +
                super.toString() +
                "difficultOfCrossword='" + difficultOfCrossword + '\'' +
                '}';
    }


    public int getMaxPredictedCost() {return CROSSWORD_MAX_PREDICTED_COST;}
}
