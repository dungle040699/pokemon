package pokemon.reviewed.controller.mapper;

import pokemon.reviewed.game.domain.GameInput;

public interface ControllerMapper {

    GameInput toGameInput(String input);
}
