package pokemon.reviewed.render.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.model.Pokemon;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Render {

    private Game game;

    private String message;

    private List<Pokemon> pokemons;
}
