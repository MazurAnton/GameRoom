package helmes.example.ordertoy.use;

import helmes.example.ordertoy.state.ToyState;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public class EntertainmentToy implements  ToyUse{

    private double toyLearnCoefficient = 0.2;

    @Override
    public double learn() {

        double willReturn;

        willReturn = toyLearnCoefficient > ToyUse.MAX_TOY_LEARN_COEFFICIENT
                ? ToyUse.MAX_TOY_LEARN_COEFFICIENT : toyLearnCoefficient;
        toyLearnCoefficient += toyLearnCoefficient;

        return willReturn;
    }

    @Override
    public String toString() {
        return "entertainment";
    }
}
