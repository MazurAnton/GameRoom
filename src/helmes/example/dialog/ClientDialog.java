package helmes.example.dialog;

import helmes.example.gameroom.GameRoom;

import java.util.Scanner;

/**
 * Created by anton.mazur on 3/7/2017.
 */
public final class ClientDialog {

    private Scanner in = new Scanner(System.in);
    private GameRoom gameroom = GameRoom.GAMEROOM;
    private boolean alreadyPlayed = false;

    public ClientDialog() {

        inviteSetGameRoom();
        playAllTheTime();
    }

    private void inviteSetGameRoom() {

        int moneyOnToys = 0;
        int maxAgeOfChildrens = 0;

        System.out.println("How much do u want to spend money on toys? (write \"-skip\" if u want default game room) ");
        if (!isSkip(in.nextLine())) {
            moneyOnToys = in.nextInt();
            System.out.println("How old Is your child?");
            maxAgeOfChildrens = in.nextInt();
        }
        if ((moneyOnToys > 0) && (maxAgeOfChildrens > 0)) {
            gameroom.setGameRoom(moneyOnToys, maxAgeOfChildrens);
        }
        gameroom.seeToys();

    }

    private boolean isSkip(String chekLine) {
        return (chekLine.startsWith("-skip")) ? true : false;
    }

    private void playAllTheTime() {

        String invitePlay;

        invitePlay = invitePlayInGameRomm();

        while(invitePlay.equals("da")) {
            playInGameRoom();
            invitePlay = invitePlayInGameRomm();
        }
    }

    private String invitePlayInGameRomm() {

        String invtitPlay;

        if (alreadyPlayed) {
            System.out.println("Do u want to play with toys one more time?");
            invtitPlay = in.nextLine();
        } else {
            System.out.println("Do u want to play with toys?");
            invtitPlay = in.nextLine();
            alreadyPlayed = true;
        }

        return invtitPlay;
    }

    private void playInGameRoom() {
        gameroom.playWithToys();
        gameroom.seeToys();
    }
}


