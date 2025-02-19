package pokemon.demo.receiver;

import pokemon.demo.input.GameInput;

public interface Receiver {

    void handleUserInput(GameInput gameInput);
}
