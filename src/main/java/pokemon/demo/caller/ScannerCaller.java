package pokemon.demo.caller;

import lombok.RequiredArgsConstructor;
import pokemon.demo.mapper.Mapper;
import pokemon.demo.receiver.Receiver;

import java.util.Scanner;

@RequiredArgsConstructor
public class ScannerCaller implements Caller {

    private final Scanner scanner;
    private final Mapper mapper;
    private final Receiver receiver;

    @Override
    public void callReceiver() {

        var input = scanner.next(); // -> map into GameInput

        var gameInput = mapper.toGameInput(input);

        receiver.handleUserInput(gameInput);
    }
}
