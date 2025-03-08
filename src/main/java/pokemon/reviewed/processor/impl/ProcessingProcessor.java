package pokemon.reviewed.processor.impl;

import pokemon.reviewed.game.Game;
import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.processor.Processor;
import pokemon.reviewed.render.Render;
import pokemon.reviewed.state.GameState;

public class ProcessingProcessor implements Processor {

    @Override
    public Render processGameInput(GameInput input, Game game) {

        return new Render().setInput(input.getInput())
                .setGameState(game.getGameState());
    }

    @Override
    public GameState supportedGameState() {

        return GameState.PROCESSING;
    }
}
