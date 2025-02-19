package pokemon.demo.controller;

import pokemon.demo.game.Game;
import pokemon.demo.input.GameInput;

public interface GameController {

    void playGame(GameInput input, Game game);
}
