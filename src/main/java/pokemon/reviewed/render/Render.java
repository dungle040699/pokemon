package pokemon.reviewed.render;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.reviewed.state.GameState;

@Getter
@Setter
@Accessors(chain = true)
public class Render {

    private GameState gameState;

    private String input;

    private String message;
}
