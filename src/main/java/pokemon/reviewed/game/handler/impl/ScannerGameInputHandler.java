package pokemon.reviewed.game.handler.impl;

import pokemon.reviewed.game.domain.GameInput;
import pokemon.reviewed.game.handler.GameInputHandler;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.processor.GameProcessor;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ScannerGameInputHandler implements GameInputHandler {

    private final Map<GameState, GameProcessor> gameHandlerMap;

    public ScannerGameInputHandler(List<GameProcessor> processors) {

        this.gameHandlerMap = processors.stream().collect(Collectors.toMap(
                GameProcessor::getSupportedGameState,
                Function.identity())
        );
    }

    @Override
    public Render handleGameInput(GameInput gameInput, Game game) {

        var gameState = game.getGameState();

        var gameProcessor = gameHandlerMap.get(gameState);

        return gameProcessor.process(gameInput, game);
    }
}
