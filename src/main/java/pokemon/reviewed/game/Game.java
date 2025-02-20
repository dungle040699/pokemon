package pokemon.reviewed.game;

import lombok.Getter;
import lombok.Setter;
import pokemon.reviewed.state.GameState;

@Getter
@Setter
public class Game {

    private GameState gameState = GameState.IN_GAME;
}
