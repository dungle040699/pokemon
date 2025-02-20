package pokemon.reviewed.mapper.impl;

import pokemon.reviewed.input.GameInput;
import pokemon.reviewed.mapper.Mapper;

public class ScannerMapper implements Mapper {

    @Override
    public GameInput toGameInput(String input) {

        return new GameInput().setInput(input);
    }
}
