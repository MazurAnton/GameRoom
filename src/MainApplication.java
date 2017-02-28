import components.*;
import toysnamefile.WorkInFile;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class MainApplication {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GameRoom.getInstance(720);
        GameRoom.seeToys();
        //System.out.println(crossword.toString());

    }
    }



