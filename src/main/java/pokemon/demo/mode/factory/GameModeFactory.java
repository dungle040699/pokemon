package pokemon.demo.mode.factory;

import org.jetbrains.annotations.NotNull;
import pokemon.demo.mode.GameMode;
import pokemon.demo.mode.OfflineGameMode;

public class GameModeFactory {

    @NotNull
    public static GameMode createGameMode(@NotNull Integer mode) {

        return switch (mode) {
            case 1 -> new OfflineGameMode();
            case 2 -> new OnlineGameMode();
            default -> throw new RuntimeException();
        };
    }
}
