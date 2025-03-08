package pokemon.reviewed.game.processor.impl;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.processor.GameProcessor;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

public class InputWaitingProcessor implements GameProcessor {

    @Override
    public GameState getSupportedGameState() {

        return GameState.INPUT_WAITING;
    }

    @Override
    public Render process(GameInput gameInput, Game game) {

        return null;
    }
}
