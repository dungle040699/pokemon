package pokemon.reviewed.game.handler;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.render.model.Render;

public interface GameInputHandler {

    Render handleGameInput(GameInput gameInput, Game game);
}
