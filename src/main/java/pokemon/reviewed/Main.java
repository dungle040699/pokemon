package pokemon.reviewed;

import lombok.extern.slf4j.Slf4j;
import pokemon.reviewed.controller.impl.ScannerController;
import pokemon.reviewed.game.Game;
import pokemon.reviewed.mapper.impl.ScannerMapper;
import pokemon.reviewed.processor.impl.*;
import pokemon.reviewed.receiver.impl.ScannerReceiver;

import java.util.List;
import java.util.Scanner;

@Slf4j
public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var mapper = new ScannerMapper();
        var game = new Game();

        // controller
        var processors = List.of(new BanPickProcessor(), new InGameProcessor(), new EndGameProcessor(),
                new ProcessingProcessor(), new RenderingProcessor(), new WaitingForInputProcessor());
        var controller = new ScannerController(processors);

        // receiver
        var receiver = new ScannerReceiver(scanner, mapper, game, controller);
        var message = receiver.receive();
        log.info("{}", message);
    }
}
