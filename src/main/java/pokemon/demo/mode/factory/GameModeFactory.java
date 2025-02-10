package pokemon.demo.mode.factory;

import pokemon.demo.mode.GameMode;

public abstract class GameModeFactory {

    public static GameMode createGameMode() {
        return null;
    }

    public GameMode getGameMode() {

        return createGameMode();
    }

//    @NotNull
//    public static GameMode createGameMode(@NotNull Integer mode) {
//
//        return switch (mode) {
//            case 1 -> new OfflineGameMode();
//            case 2 -> new OnlineGameMode();
//            default -> throw new RuntimeException();
//        };
//    }
}
