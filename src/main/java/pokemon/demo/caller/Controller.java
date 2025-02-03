package pokemon.demo.caller;

import pokemon.demo.game.Game;
import pokemon.demo.player.Player;
import pokemon.demo.enums.State;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner;
    private final Game game;
    private Player player;
    private Player machine;

    public Controller() {
        this.scanner = new Scanner(System.in);
        this.game = new Game();
    }

    public void playGame() {

        System.out.println("""
                Welcome. Please choose a Pokémon for Red team:\s
                (1) for Pikachu.\s
                (2) for Bulbasaur.""");

        var choice = scanner.nextInt();

        while (game.getState() != State.STOP) {

            if (game.getState() == State.BAN_PICK) {
                player = game.generateRedPlayer(choice);
                machine = game.generateBluePlayer();
                continue;
            }

            if (game.getState() == State.IN_GAME) {
                System.out.println("*********************************");
                System.out.println("Press A to attack");
                var attack = scanner.next();
                game.playGame(player, machine, attack);
            }
        }
    }

    private void gameMode() {

        //TODO
    }
}
