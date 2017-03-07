package helmes.example.utilities;

import helmes.example.toys.*;

/**
 * Created by anton.mazur on 3/6/2017.
 */
public final class RandomToyUtility {

    public static Toy generateToy(String toyName) {

        Toy toy = null;

        if (toyName != null) {

            switch (toyName) {
                case ToysChildsName.DINOSAUR_NAME:
                    toy = new Dinosaur();
                    break;
                case ToysChildsName.BEANBAG_NAME:
                    toy = new Beanbag();
                    break;
                case ToysChildsName.CROSSWORD_NAME:
                    toy = new Crossword();
                    break;
                case ToysChildsName.MOSAIC_NAME:
                    toy = new Mosaic();
                    break;
                case ToysChildsName.DOLL_NAME:
                    toy = new Doll();
                    break;
            }
        }

        return toy;

    }
}

