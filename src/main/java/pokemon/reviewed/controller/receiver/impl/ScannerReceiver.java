package pokemon.reviewed.controller.receiver.impl;

import pokemon.reviewed.controller.mapper.ControllerMapper;
import pokemon.reviewed.controller.receiver.Receiver;
import pokemon.reviewed.game.handler.GameInputHandler;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.state.GameState;
import pokemon.reviewed.render.model.Render;

import java.util.Optional;
import java.util.Scanner;

public class ScannerReceiver implements Receiver {

    private final Scanner scanner;

    private final ControllerMapper controllerMapper;

    public ScannerReceiver(Scanner scanner, ControllerMapper controllerMapper) {
        this.scanner = scanner;
        this.controllerMapper = controllerMapper;
    }

    @Override
    public Render receiveInput(GameInputHandler gameInputHandler, Game game) {

        var input = scanner.next();

        var gameInput = controllerMapper.toGameInput(input);

        var render = gameInputHandler.handleGameInput(gameInput, game);

        return Optional.ofNullable(game.getGameState())
                .filter(gameState -> gameState != GameState.END_GAME)
                .map(i -> receiveInput(gameInputHandler, game))
                .orElse(render);
    }
}
