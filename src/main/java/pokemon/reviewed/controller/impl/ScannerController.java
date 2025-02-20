package pokemon.reviewed.controller.impl;

import pokemon.reviewed.controller.Controller;
import pokemon.reviewed.game.Game;
import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.processor.Processor;
import pokemon.reviewed.render.Render;
import pokemon.reviewed.state.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ScannerController implements Controller {

    private final Map<GameState, Processor> map;

    public ScannerController(List<Processor> processors) {

        this.map = processors.stream().collect(Collectors.toMap(
                Processor::supportedGameState,
                Function.identity())
        );
    }

    @Override
    public Render playGame(GameInput input, Game game) {

        var state = game.getGameState();
        var processor = map.get(state);
        return processor.processGameInput(input, game);
    }
}
