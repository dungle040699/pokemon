package pokemon.demo.processor;

import pokemon.demo.input.GameInput;
import pokemon.demo.state.GameState;

public interface Processor {

    String processGameInput(GameInput input);

    GameState supportedGameState();
}
