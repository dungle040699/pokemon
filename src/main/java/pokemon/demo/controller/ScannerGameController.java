package pokemon.demo.controller;

import pokemon.demo.game.Game;
import pokemon.demo.input.GameInput;
import pokemon.demo.processor.Processor;
import pokemon.demo.state.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ScannerGameController implements GameController {

    private final Map<GameState, Processor> map;

    public ScannerGameController(List<Processor> processors) {

        this.map = processors.stream()
                .collect(Collectors.toMap(Processor::supportedGameState, Function.identity()));
    }

    @Override
    public void playGame(GameInput input, Game game) {

        var state = game.getGameState();
        var processor = map.get(state);
        processor.processGameInput(input);
    }
}
