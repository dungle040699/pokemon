package pokemon.reviewed.render.domain;

import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.model.Pokemon;

import java.util.List;

public record BanPickRender(

        List<Pokemon> pokemonList,

        Game game
) {
}
