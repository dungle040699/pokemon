package pokemon.demo.caller;

import pokemon.demo.game.Gam;
import pokemon.demo.player.Player;
import pokemon.demo.state.State;

import java.util.Scanner;

public class Caller {

    private final Scanner scanner;
    private final Gam gam;
    private Player player;
    private Player machine;

    public Caller() {
        this.scanner = new Scanner(System.in);
        this.gam = new Gam();
    }

    public void playGame() {

        System.out.println("""
                Welcome. Please choose a Pokémon for Red team:\s
                (1) for Pikachu.\s
                (2) for Bulbasaur.""");

        var choice = scanner.nextInt();

        while (gam.getState() != State.STOP) {

            if (gam.getState() == State.BAN_PICK) {
                player = gam.generateRedPlayer(choice);
                machine = gam.generateBluePlayer();
                continue;
            }
            if (gam.getState() == State.IN_GAME) {
                System.out.println("*********************************");
                System.out.println("Press A to attack");
                var attack = scanner.next();
                gam.playGame(player, machine, attack);
            }
        }
    }
}
