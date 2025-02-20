package pokemon.reviewed;

import lombok.extern.slf4j.Slf4j;
import pokemon.reviewed.controller.impl.ScannerController;
import pokemon.reviewed.game.Game;
import pokemon.reviewed.mapper.impl.ScannerMapper;
import pokemon.reviewed.processor.impl.BanPickProcessor;
import pokemon.reviewed.processor.impl.EndGameProcessor;
import pokemon.reviewed.processor.impl.InGameProcessor;
import pokemon.reviewed.receiver.impl.ScannerReceiver;
import pokemon.reviewed.render.Render;

import java.util.List;
import java.util.Scanner;

@Slf4j
public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var mapper = new ScannerMapper();
        var game = new Game();

        // controller
        var processors = List.of(new BanPickProcessor(), new InGameProcessor(), new EndGameProcessor());
        var controller = new ScannerController(processors);

        // receiver
        var receiver = new ScannerReceiver(scanner, mapper, game, controller);

        // render
        Render message = receiver.receive();
        log.info("{}", message);
    }
}
