package pokemon.demo.mode.factory;

import pokemon.demo.mode.GameMode;
import pokemon.demo.mode.OnlineGameMode;

public class OnlineGameModeFactory extends GameModeFactory {

    @Override
    public GameMode createGameMode() {

        return new OnlineGameMode();
    }
}
