package pokemon.reviewed.controller;

import pokemon.reviewed.game.Game;
import pokemon.reviewed.input.GameInput;

public interface Controller {

    String playGame(GameInput input, Game game);
}
