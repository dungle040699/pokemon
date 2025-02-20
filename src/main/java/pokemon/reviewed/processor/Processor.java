package pokemon.reviewed.processor;

import pokemon.reviewed.game.Game;
import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.render.Render;
import pokemon.reviewed.state.GameState;

public interface Processor {

    Render processGameInput(GameInput input, Game game);

    GameState supportedGameState();
}
