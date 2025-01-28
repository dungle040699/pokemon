package pokemon.demo.field;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.demo.player.Player;
import pokemon.demo.state.State;

@Getter
@Setter
@Accessors(chain = true)
public class Field {

    private Player red;

    private Player blue;

    private State state;

    public Field() {
        this.red = new Player();
        this.blue = new Player();
        this.state = State.BEGIN;
    }
}
