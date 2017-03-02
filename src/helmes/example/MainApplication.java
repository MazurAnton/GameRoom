package helmes.example;

import helmes.example.gameroom.GameRoom;

import java.io.FileNotFoundException;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class MainApplication {

    public static void main(String[] args)
            throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GameRoom.getInstance(720, 15);
        GameRoom.seeToys();

    }
}



