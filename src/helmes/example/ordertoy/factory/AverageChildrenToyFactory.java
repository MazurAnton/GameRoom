package helmes.example.ordertoy.factory;

import helmes.example.ordertoy.state.SolidToy;
import helmes.example.ordertoy.state.ToyState;
import helmes.example.ordertoy.use.EntertainmentToy;
import helmes.example.ordertoy.use.ToyUse;

/**
 * Created by anton.mazur on 3/2/2017.
 */

public class AverageChildrenToyFactory implements ToyFactory {

    private static final double QUALITY_OF_TOY = 0.85;

    @Override
    public ToyState createToyState() {
        return new SolidToy();
    }

    @Override
    public ToyUse createToyUse() {
        return new EntertainmentToy();
    }

    @Override
    public double setQuality() {
        return QUALITY_OF_TOY;
    }
}
