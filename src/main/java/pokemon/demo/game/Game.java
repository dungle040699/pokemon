package pokemon.demo.game;

import lombok.Getter;
import lombok.Setter;
import pokemon.demo.state.GameState;

@Setter
@Getter
public class Game {

    private GameState gameState = GameState.IN_GAME;
}
