package helmes.example.gameroom;

import helmes.example.toys.Toy;

import java.util.Comparator;

/**
 * Created by anton.mazur on 3/7/2017.
 */
public class ToysComparatorByQuality implements Comparator<Toy> {
    @Override
    public int compare(Toy firstToy, Toy secondToy) {

        double qualityOfFirstToy = firstToy.getToyQuality();
        double qualityOfSecondToy = secondToy.getToyQuality();


        if (qualityOfFirstToy > qualityOfSecondToy) {
            return 1;
        } else if (qualityOfFirstToy < qualityOfSecondToy) {
            return -1;
        } else {
            return 0;
        }
    }
}

