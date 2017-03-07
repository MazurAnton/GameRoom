package helmes.example.ordertoy.factory;

import helmes.example.ordertoy.state.TeddyToy;
import helmes.example.ordertoy.state.ToyState;
import helmes.example.ordertoy.use.EducationToy;
import helmes.example.ordertoy.use.ToyUse;

/**
 * Created by anton.mazur on 3/2/2017.
 */
public class SmallChildrenToyFactory implements ToyFactory {

    private static final double QUALITY_OF_TOY = 0.9;

    @Override
    public ToyState createToyState() {
        return new TeddyToy();
    }

    @Override
    public ToyUse createToyUse() {
        return new EducationToy();
    }

    @Override
    public double setQuality() {
        return QUALITY_OF_TOY;
    }
}
