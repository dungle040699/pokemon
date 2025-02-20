package pokemon.reviewed.mapper;

import pokemon.reviewed.input.GameInput;

public interface Mapper {

    GameInput toGameInput(String input);
}
