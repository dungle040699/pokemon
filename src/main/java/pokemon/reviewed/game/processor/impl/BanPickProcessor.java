package pokemon.reviewed.game.processor.impl;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.factory.PokemonFactory;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.model.Pokemon;
import pokemon.reviewed.game.processor.GameProcessor;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

import java.util.List;

public class BanPickProcessor implements GameProcessor {

    private final List<Pokemon> pokemons;

    public BanPickProcessor(PokemonFactory factory) {
        this.pokemons = factory.getAllPokemons();
    }

    @Override
    public GameState getSupportedGameState() {

        return GameState.BAN_PICK;
    }

    @Override
    public Render process(GameInput gameInput, Game game) {

        game.setGameState(GameState.RENDERING);

        return new Render().setGame(game)
                .setPokemons(pokemons)
                .setMessage("It's in a Ban Pick GameState.");
    }
}
