package pokemon.reviewed;

import pokemon.reviewed.controller.impl.ScannerController;
import pokemon.reviewed.game.Game;
import pokemon.reviewed.mapper.impl.ScannerMapper;
import pokemon.reviewed.processor.impl.ScannerProcessor;
import pokemon.reviewed.receiver.impl.ScannerReceiver;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var mapper = new ScannerMapper();
        var game = new Game();

        // controller
        var processor = new ScannerProcessor();
        var controller = new ScannerController(List.of(processor));
        var receiver = new ScannerReceiver(scanner, mapper, game, controller);

        // receive
        var message = receiver.receive();
        System.out.printf("%s%n", message);
    }
}
