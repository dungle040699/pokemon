package pokemon.demo.mode;

import pokemon.demo.enums.State;
import pokemon.demo.game.Game;
import pokemon.demo.player.Player;

import java.util.Scanner;

public class OfflineGameMode implements GameMode {

    private Player player;
    private Player machine;

    @Override
    public void playGame(Scanner scanner, Game game) {

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
}
