package helmes.example.toys;

import helmes.example.ordertoy.factory.SmallChildrenToyFactory;
import helmes.example.utilities.RandomToyCharacteristicsUtility;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class Crossword extends Toy {

    public static final String CROSSWORD = "Crossword";
    private String difficultOfCrossword ;

    public Crossword() {
        super(CROSSWORD, new SmallChildrenToyFactory());
        difficultOfCrossword = RandomToyCharacteristicsUtility
                .setToysCharacteristicsRandomly(this, MaxPredictedValueOfToy.CROSSWORD_MAX_PREDICTED_COST);
    }

    public void play() {
        double toyQuality;

        super.play();
        toyQuality = getToyQuality() +
                ((double)MaxPredictedValueOfToy.CROSSWORD_MAX_PREDICTED_COST /
                        (double)MaxPredictedValueOfToy.TOY_5_TIMES_MAX_PREDICTED_COST);
        setToyQuality(toyQuality);
    }

    @Override
    public String toString() {
        return "Crossword{" +
                super.toString() +
                "difficultOfCrossword='" + difficultOfCrossword + '\'' +
                '}';
    }
}
