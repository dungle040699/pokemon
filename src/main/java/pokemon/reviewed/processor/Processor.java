package pokemon.reviewed.processor;

import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.state.GameState;

public interface Processor {

    String processGameInput(GameInput input);

    GameState supportedGameState();
}
