package pokemon.demo.mapper;

import pokemon.demo.input.GameInput;

public interface Mapper {

    GameInput toGameInput(String userInput);
}
