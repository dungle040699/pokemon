package pokemon.demo.game;

import lombok.extern.slf4j.Slf4j;
import pokemon.demo.field.Field;
import pokemon.demo.pokemon.Pokemon;
import pokemon.demo.state.State;

import java.util.Scanner;

@Slf4j
public class Game {

    private final Field field;

    private final Scanner scanner;

    public Game() {
        this.field = new Field();
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {

        startGame();
    }

    private void startGame() {

        System.out.println("""
                Welcome. Please choose a Pokémon for Red team:\s
                (1) for Pikachu.\s
                (2) for Bulbasaur.""");

        var choice = scanner.nextInt();

        var redPokemon = switch (choice) {
            case 1 -> generatePikachu();
            case 2 -> generateBulbasaur();
            default -> throw new RuntimeException("Invalid input");
        };
        var bluePokemon = generateBulbasaur();

        var redTeam = field.getRed()
                .setId(1)
                .setName("red team")
                .setPokemon(redPokemon);

        var blueTeam = field.getBlue()
                .setId(2)
                .setName("blue team")
                .setPokemon(bluePokemon);

        field.setRed(redTeam).setBlue(blueTeam);

        System.out.printf("Red team Pokemon: %s%n", redTeam.getPokemon().getName());
        System.out.printf("Blue team Pokemon: %s%n", blueTeam.getPokemon().getName());

        inGame();
    }

    private Pokemon generatePikachu() {

        return new Pokemon().setId(1).setName("Pikachu").setHp(110).setDamage(50);
    }

    private Pokemon generateBulbasaur() {

        return new Pokemon().setId(2).setName("Bulbasaur").setHp(90).setDamage(50);
    }

    private void inGame() {

        field.setState(State.IN_GAME);
        System.out.println("Please enter A to Attack the blue team.");

        var redPokemon = field.getRed().getPokemon();
        var bluePokemon = field.getBlue().getPokemon();

        var redPokemonDamage = redPokemon.getDamage();
        var bluePokemonDamage = bluePokemon.getDamage();

        while (redPokemon.getHp() > 0 && bluePokemon.getHp() > 0) {
            var attack = scanner.next();
            if (!attack.equals("A")) {
                System.out.println("Invalid input. Try again");
                continue;
            }

            var bluePokemonHp = bluePokemon.getHp();
            bluePokemonHp = Math.max(0, bluePokemonHp - redPokemonDamage);

            var redPokemonHp = redPokemon.getHp();
            redPokemonHp = Math.max(0, redPokemonHp - bluePokemonDamage);

            bluePokemon.setHp(bluePokemonHp);
            redPokemon.setHp(redPokemonHp);

            System.out.println("Red team Pokemon HP: " + redPokemonHp);
            System.out.println("Blue team Pokemon HP: " + bluePokemonHp);
        }

        endGame();
    }


    private void endGame() {

        field.setState(State.END);
        System.out.println("End game.");

        System.out.println("Red team Pokemon HP: " + field.getRed().getPokemon().getHp());
        System.out.println("Blue team Pokemon HP: " + field.getBlue().getPokemon().getHp());
    }
}
