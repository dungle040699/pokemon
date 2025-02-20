package pokemon.reviewed.controller;

import pokemon.reviewed.game.Game;
import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.render.Render;

public interface Controller {

    Render playGame(GameInput input, Game game);
}
