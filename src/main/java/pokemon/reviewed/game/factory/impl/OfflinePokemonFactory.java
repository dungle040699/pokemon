package pokemon.reviewed.game.factory.impl;

import pokemon.reviewed.game.factory.PokemonFactory;
import pokemon.reviewed.game.model.Pokemon;

import java.util.List;

public class OfflinePokemonFactory implements PokemonFactory {

    @Override
    public List<Pokemon> getAllPokemons() {

        var pikachu = generatePikachu();
        var bulbasaur = generateBulbasaur();

        return List.of(pikachu, bulbasaur);
    }

    private Pokemon generatePikachu() {

        return new Pokemon().setId("1")
                .setName("Pikachu")
                .setHp(100)
                .setAttack(10);
    }

    private Pokemon generateBulbasaur() {

        return new Pokemon().setId("2")
                .setName("Bulbasaur")
                .setHp(200)
                .setAttack(20);
    }
}
