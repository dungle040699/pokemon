package pokemon.reviewed.processor.impl;

import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.processor.Processor;
import pokemon.reviewed.state.GameState;

public class ScannerProcessor implements Processor {

    @Override
    public String processGameInput(GameInput input) {

        return input.getInput();
    }

    @Override
    public GameState supportedGameState() {

        return GameState.IN_GAME;
    }
}
