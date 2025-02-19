package pokemon.demo.receiver.impl;

import lombok.RequiredArgsConstructor;
import pokemon.demo.controller.GameController;
import pokemon.demo.input.GameInput;
import pokemon.demo.receiver.Receiver;

@RequiredArgsConstructor
public class ScannerInputReceiver implements Receiver {

    private final GameController gameController;

    @Override
    public void handleUserInput(GameInput gameInput) {
    }
}
