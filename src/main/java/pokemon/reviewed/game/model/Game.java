package pokemon.reviewed.game.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.reviewed.game.state.GameState;

@Getter
@Setter
@Accessors(chain = true)
public class Game {

    private GameState gameState = GameState.IN_GAME;
}
