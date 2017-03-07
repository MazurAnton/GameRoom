package helmes.example.gameroom;

import helmes.example.toys.Toy;

import java.util.Comparator;

/**
 * Created by anton.mazur on 2/27/2017.
 */
class ToysComparatorByCost implements Comparator<Toy> {
    @Override
    public int compare(Toy firstToy, Toy secondToy) {

        int costOfFirstToy = firstToy.getToyCost();
        int costOfSecondToy = secondToy.getToyCost();


        if(costOfFirstToy > costOfSecondToy) {
            return 1;
        }
        else if(costOfFirstToy < costOfSecondToy) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
