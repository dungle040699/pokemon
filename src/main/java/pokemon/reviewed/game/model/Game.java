package pokemon.reviewed.game.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.reviewed.game.state.BanPickState;
import pokemon.reviewed.game.state.GameState;

@Getter
@Setter
@Accessors(chain = true)
public class Game {

    private GameState gameState = GameState.BAN_PICK;

    private BanPickState banPickState = BanPickState.RENDERING;
}
