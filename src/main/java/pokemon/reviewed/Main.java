package pokemon.reviewed;

import lombok.extern.slf4j.Slf4j;
import pokemon.reviewed.controller.mapper.impl.ScannerControllerMapper;
import pokemon.reviewed.controller.service.impl.ScannerReceiver;
import pokemon.reviewed.game.handler.impl.ScannerGameInputHandler;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.processor.impl.*;
import pokemon.reviewed.game.state.GameState;

import java.util.List;
import java.util.Scanner;

@Slf4j
public class Main {

    public static void main(String[] args) {

        // game
        var gameProcessors = List.of(new BanPickProcessor(), new InGameProcessor(), new InputWaitingProcessor(),
                new ProcessingProcessor(), new RenderingProcessor(), new EndgameProcessor());
        var game = new Game().setGameState(GameState.IN_GAME);
        var gameInputHandler = new ScannerGameInputHandler(gameProcessors);

        // controller
        var scanner = new Scanner(System.in);
        var controllerMapper = new ScannerControllerMapper();
        var receiver = new ScannerReceiver(scanner, controllerMapper);

        receiver.receiveInput(gameInputHandler, game);
    }
}
