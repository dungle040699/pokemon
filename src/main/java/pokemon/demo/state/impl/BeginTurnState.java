package pokemon.demo.state.impl;

import lombok.extern.slf4j.Slf4j;
import pokemon.demo.state.GameState;

@Slf4j
public class BeginTurnState implements GameState {

    @Override
    public void run() {

        log.info("Choose the team side: red or blue.");
    }
}
