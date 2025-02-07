package pokemon.demo.mode.factory;

import pokemon.demo.mode.GameMode;
import pokemon.demo.mode.OfflineGameMode;

public class OfflineGameModeFactory extends GameModeFactory {

    @Override
    public GameMode createGameMode() {

        return new OfflineGameMode();
    }
}
