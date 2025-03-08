package pokemon.reviewed.game.processor.impl;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.processor.GameProcessor;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

public class ProcessingProcessor implements GameProcessor {

    @Override
    public GameState getSupportedGameState() {

        return GameState.PROCESSING;
    }

    @Override
    public Render process(GameInput gameInput, Game game) {

        return null;
    }
}
