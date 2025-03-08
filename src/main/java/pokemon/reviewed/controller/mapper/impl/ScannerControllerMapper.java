package pokemon.reviewed.controller.mapper.impl;

import pokemon.reviewed.controller.mapper.ControllerMapper;
import pokemon.reviewed.game.domain.GameInput;

public class ScannerControllerMapper implements ControllerMapper {

    @Override
    public GameInput toGameInput(String input) {

        return new GameInput(input);
    }
}
