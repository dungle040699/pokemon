package pokemon.demo.game;

import lombok.Getter;
import pokemon.demo.field.Field;
import pokemon.demo.player.Player;
import pokemon.demo.pokemon.Pokemon;
import pokemon.demo.state.State;

import java.sql.SQLOutput;

@Getter
public class Gam {

    private final Field field;

    private State state;

    public Gam() {
        this.field = new Field();
        this.state = State.BAN_PICK;
    }

    public Player generateRedPlayer(Integer choice) {

        var redPokemon = switch (choice) {
            case 1 -> generatePikachu();
            case 2 -> generateBulbasaur();
            default -> throw new RuntimeException("Invalid input");
        };

        var player = field.getRed()
                .setId(1)
                .setName("player")
                .setPokemon(redPokemon);

        System.out.printf("Player's Pokemon: %s%n", player.getPokemon().getName());
        return player;
    }

    public Player generateBluePlayer() {

        this.state = State.IN_GAME;
        var bluePokemon = generateBulbasaur();

        var player =  field.getBlue()
                .setId(2)
                .setName("machine")
                .setPokemon(bluePokemon);

        System.out.printf("Player's Pokemon: %s%n", player.getPokemon().getName());
        return player;
    }

    public void playGame(Player player, Player machine, String attack) {

        field.setRed(player).setBlue(machine);

        System.out.printf("Red team Pokemon: %s%n", player.getPokemon().getName());
        System.out.printf("Blue team Pokemon: %s%n", machine.getPokemon().getName());

        var redPokemon = field.getRed().getPokemon();
        var bluePokemon = field.getBlue().getPokemon();

        var redPokemonDamage = redPokemon.getDamage();
        var bluePokemonDamage = bluePokemon.getDamage();

        if (!attack.equals("A")) {
            System.out.println("*********************************");
            System.out.println("Invalid input. Try again");
            return;
        }

        var bluePokemonHp = bluePokemon.getHp();
        bluePokemonHp = Math.max(0, bluePokemonHp - redPokemonDamage);

        var redPokemonHp = redPokemon.getHp();
        redPokemonHp = Math.max(0, redPokemonHp - bluePokemonDamage);

        bluePokemon.setHp(bluePokemonHp);
        redPokemon.setHp(redPokemonHp);

        System.out.println("Red team Pokemon HP: " + redPokemonHp);
        System.out.println("Blue team Pokemon HP: " + bluePokemonHp);

        if (redPokemon.getHp() <= 0 || bluePokemon.getHp() <= 0) {
            state = State.STOP;
            System.out.println("*********************************");
            System.out.println("Game over!");
        }
    }

    private Pokemon generatePikachu() {

        return new Pokemon().setId(1).setName("Pikachu").setHp(110).setDamage(50);
    }

    public Pokemon generateBulbasaur() {

        return new Pokemon().setId(2).setName("Bulbasaur").setHp(90).setDamage(50);
    }
}