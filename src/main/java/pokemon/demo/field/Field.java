package pokemon.demo.field;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.demo.player.Player;

@Getter
@Setter
@Accessors(chain = true)
public class Field {

    private Player red;

    private Player blue;

    public Field() {
        this.red = new Player();
        this.blue = new Player();
    }
}
