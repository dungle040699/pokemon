package pokemon.demo.caller;

import pokemon.demo.game.Game;
import pokemon.demo.mode.factory.GameModeFactory;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner;
    private final Game game;
    private Integer mode = 1;

    public Controller() {
        this.scanner = new Scanner(System.in);
        this.game = new Game();
    }

    public void playGame() {

        System.out.println("""
                Choose the game mode:\s
                (1) Online.\s
                (2) Offline.""");
        mode = scanner.nextInt();

        var gameMode = GameModeFactory.createGameMode(mode);
        System.out.println("*********************************");
        System.out.println("Mode game is: " + gameMode.getClass().getName());
        gameMode.playGame(scanner, game);
    }
}
