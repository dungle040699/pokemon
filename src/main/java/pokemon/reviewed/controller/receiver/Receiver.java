package pokemon.reviewed.controller.receiver;

import pokemon.reviewed.game.handler.GameInputHandler;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.render.model.Render;

public interface Receiver {

    Render receiveInput(GameInputHandler gameInputHandler, Game game);
}
