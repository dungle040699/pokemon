package pokemon.reviewed.game.processor;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

public interface GameProcessor {

    GameState getSupportedGameState();

    Render process(GameInput gameInput, Game game);
}
