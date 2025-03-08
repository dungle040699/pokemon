package pokemon.reviewed.render.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.reviewed.game.model.Game;

@Getter
@Setter
@Accessors(chain = true)
public class Render {

    private Game game;

    private String message;
}
