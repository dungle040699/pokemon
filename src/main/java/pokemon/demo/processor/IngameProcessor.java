package pokemon.demo.processor;

import pokemon.demo.input.GameInput;
import pokemon.demo.state.GameState;

public class IngameProcessor implements Processor {

    @Override
    public String processGameInput(GameInput input) {
        return "In-game-processor";
    }

    @Override
    public GameState supportedGameState() {
        return GameState.IN_GAME;
    }
}
